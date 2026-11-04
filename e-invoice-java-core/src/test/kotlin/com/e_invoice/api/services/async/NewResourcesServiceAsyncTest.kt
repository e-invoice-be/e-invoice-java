package com.e_invoice.api.services.async

import com.e_invoice.api.client.EInvoiceClientAsync
import com.e_invoice.api.client.okhttp.EInvoiceOkHttpClientAsync
import com.e_invoice.api.models.conversion.ConversionCreateFromPdfParams
import com.e_invoice.api.models.conversion.DocumentCreateFromPdfTask
import com.e_invoice.api.models.drafts.DraftListParams
import com.e_invoice.api.models.inbox.DocumentState
import com.e_invoice.api.models.mailbox.MailboxDownloadAttachmentParams
import com.e_invoice.api.models.mailbox.MailboxListParams
import com.e_invoice.api.models.stats.StatsAggregationType
import com.e_invoice.api.models.stats.StatsRetrieveParams
import com.e_invoice.api.services.NewResourcesFixtures
import com.github.tomakehurst.wiremock.client.WireMock.aMultipart
import com.github.tomakehurst.wiremock.client.WireMock.aResponse
import com.github.tomakehurst.wiremock.client.WireMock.binaryEqualTo
import com.github.tomakehurst.wiremock.client.WireMock.equalTo
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.getRequestedFor
import com.github.tomakehurst.wiremock.client.WireMock.okJson
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.postRequestedFor
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.client.WireMock.urlPathEqualTo
import com.github.tomakehurst.wiremock.client.WireMock.verify
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class NewResourcesServiceAsyncTest {

    private lateinit var client: EInvoiceClientAsync

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            EInvoiceOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .responseValidation(true)
                .build()
    }

    @Test
    fun mailboxList() {
        stubFor(
            get(urlPathEqualTo("/api/mailbox/"))
                .willReturn(okJson(NewResourcesFixtures.INBOUND_EMAIL_PAGE))
        )

        val page =
            client
                .mailbox()
                .list(
                    MailboxListParams.builder()
                        .status(MailboxListParams.Status.PENDING)
                        .sortBy(MailboxListParams.SortBy.RECEIVED_AT)
                        .build()
                )
                .get()

        verify(
            getRequestedFor(urlPathEqualTo("/api/mailbox/"))
                .withQueryParam("status", equalTo("pending"))
                .withQueryParam("sort_by", equalTo("received_at"))
        )
        assertThat(page.items().single().id()).isEqualTo("ie_123")
        assertThat(page.hasNextPage()).isFalse()
    }

    @Test
    fun mailboxRetrieve() {
        stubFor(
            get(urlPathEqualTo("/api/mailbox/ie_123"))
                .willReturn(okJson(NewResourcesFixtures.INBOUND_EMAIL))
        )

        val email = client.mailbox().retrieve("ie_123").get()

        verify(getRequestedFor(urlPathEqualTo("/api/mailbox/ie_123")))
        assertThat(email.messageId()).isEqualTo("<msg@example.com>")
    }

    @Test
    fun mailboxDownloadAttachment() {
        val bytes = byteArrayOf(1, 2, 3, 0, -1)
        stubFor(
            get(urlPathEqualTo("/api/mailbox/ie_123/attachments/invoice.pdf"))
                .willReturn(aResponse().withStatus(200).withBody(bytes))
        )

        client
            .mailbox()
            .downloadAttachment(
                "invoice.pdf",
                MailboxDownloadAttachmentParams.builder().inboundEmailId("ie_123").build(),
            )
            .get()
            .use { response -> assertThat(response.body().readBytes()).isEqualTo(bytes) }

        verify(getRequestedFor(urlPathEqualTo("/api/mailbox/ie_123/attachments/invoice.pdf")))
    }

    @Test
    fun mailboxReprocess() {
        stubFor(
            post(urlPathEqualTo("/api/mailbox/ie_123/reprocess"))
                .willReturn(okJson(NewResourcesFixtures.INBOUND_EMAIL).withStatus(202))
        )

        val email = client.mailbox().reprocess("ie_123").get()

        verify(postRequestedFor(urlPathEqualTo("/api/mailbox/ie_123/reprocess")))
        assertThat(email.id()).isEqualTo("ie_123")
    }

    @Test
    fun draftsList() {
        stubFor(
            get(urlPathEqualTo("/api/drafts/")).willReturn(okJson(NewResourcesFixtures.DRAFTS_PAGE))
        )

        val page =
            client
                .drafts()
                .list(
                    DraftListParams.builder()
                        .state(DocumentState.DRAFT)
                        .sortBy(DraftListParams.SortBy.CUSTOMER_NAME)
                        .build()
                )
                .get()

        verify(
            getRequestedFor(urlPathEqualTo("/api/drafts/"))
                .withQueryParam("state", equalTo("DRAFT"))
                .withQueryParam("sort_by", equalTo("customer_name"))
        )
        assertThat(page.items().single().id()).isEqualTo("doc_123")
    }

    @Test
    fun statsRetrieve() {
        stubFor(get(urlPathEqualTo("/api/stats")).willReturn(okJson(NewResourcesFixtures.STATS)))

        val stats =
            client
                .stats()
                .retrieve(
                    StatsRetrieveParams.builder()
                        .startDate(LocalDate.parse("2025-01-01"))
                        .aggregation(StatsAggregationType.WEEK)
                        .build()
                )
                .get()

        verify(
            getRequestedFor(urlPathEqualTo("/api/stats"))
                .withQueryParam("start_date", equalTo("2025-01-01"))
                .withQueryParam("aggregation", equalTo("WEEK"))
        )
        assertThat(stats.periodEnd()).isEqualTo(LocalDate.parse("2025-01-31"))
        assertThat(stats.actions()).hasSize(2)
    }

    @Test
    fun conversionCreateFromPdf() {
        stubFor(
            post(urlPathEqualTo("/api/conversion/pdf"))
                .willReturn(okJson(NewResourcesFixtures.TASK).withStatus(201))
        )

        val task =
            client
                .conversion()
                .createFromPdf(
                    ConversionCreateFromPdfParams.builder()
                        .file("%PDF-1.4 test".toByteArray())
                        .build()
                )
                .get()

        verify(
            postRequestedFor(urlPathEqualTo("/api/conversion/pdf"))
                .withRequestBodyPart(
                    aMultipart()
                        .withName("file")
                        .withBody(binaryEqualTo("%PDF-1.4 test".toByteArray()))
                        .build()
                )
        )
        assertThat(task.status()).contains(DocumentCreateFromPdfTask.Status.PENDING)
    }

    @Test
    fun conversionRetrievePdfStatus() {
        stubFor(
            get(urlPathEqualTo("/api/conversion/pdf/task_123"))
                .willReturn(okJson(NewResourcesFixtures.TASK))
        )

        val task = client.conversion().retrievePdfStatus("task_123").get()

        verify(getRequestedFor(urlPathEqualTo("/api/conversion/pdf/task_123")))
        assertThat(task.taskId()).isEqualTo("task_123")
    }

    @Test
    fun conversionRetrievePdfResult() {
        stubFor(
            get(urlPathEqualTo("/api/conversion/pdf/task_123/result"))
                .willReturn(okJson(NewResourcesFixtures.PDF_RESULT))
        )

        val result = client.conversion().retrievePdfResult("task_123").get()

        verify(getRequestedFor(urlPathEqualTo("/api/conversion/pdf/task_123/result")))
        assertThat(result.invoiceId()).contains("INV-1")
    }
}
