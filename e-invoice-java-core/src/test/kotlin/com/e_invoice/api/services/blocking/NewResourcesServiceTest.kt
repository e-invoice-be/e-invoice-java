package com.e_invoice.api.services.blocking

import com.e_invoice.api.client.EInvoiceClient
import com.e_invoice.api.client.okhttp.EInvoiceOkHttpClient
import com.e_invoice.api.models.conversion.ConversionCreateFromPdfParams
import com.e_invoice.api.models.conversion.DocumentCreateFromPdfTask
import com.e_invoice.api.models.documents.DocumentType
import com.e_invoice.api.models.drafts.DraftListParams
import com.e_invoice.api.models.inbox.DocumentState
import com.e_invoice.api.models.mailbox.MailboxDownloadAttachmentParams
import com.e_invoice.api.models.mailbox.MailboxListParams
import com.e_invoice.api.models.stats.StatsAggregationType
import com.e_invoice.api.models.stats.StatsResponse
import com.e_invoice.api.models.stats.StatsRetrieveParams
import com.e_invoice.api.services.NewResourcesFixtures
import com.github.tomakehurst.wiremock.client.WireMock.aMultipart
import com.github.tomakehurst.wiremock.client.WireMock.aResponse
import com.github.tomakehurst.wiremock.client.WireMock.absent
import com.github.tomakehurst.wiremock.client.WireMock.binaryEqualTo
import com.github.tomakehurst.wiremock.client.WireMock.containing
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
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class NewResourcesServiceTest {

    private lateinit var client: EInvoiceClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            EInvoiceOkHttpClient.builder()
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
                        .page(1L)
                        .pageSize(20L)
                        .status(MailboxListParams.Status.SUCCESS)
                        .processed(true)
                        .receivedFrom(OffsetDateTime.parse("2025-01-01T00:00:00Z"))
                        .receivedTo(OffsetDateTime.parse("2025-01-31T00:00:00Z"))
                        .search("invoice")
                        .sortBy(MailboxListParams.SortBy.CREATED_AT)
                        .sortOrder(MailboxListParams.SortOrder.ASC)
                        .build()
                )

        verify(
            getRequestedFor(urlPathEqualTo("/api/mailbox/"))
                .withQueryParam("page", equalTo("1"))
                .withQueryParam("page_size", equalTo("20"))
                .withQueryParam("status", equalTo("success"))
                .withQueryParam("processed", equalTo("true"))
                .withQueryParam("received_from", equalTo("2025-01-01T00:00:00Z"))
                .withQueryParam("received_to", equalTo("2025-01-31T00:00:00Z"))
                .withQueryParam("search", equalTo("invoice"))
                .withQueryParam("sort_by", equalTo("created_at"))
                .withQueryParam("sort_order", equalTo("asc"))
        )
        assertThat(page.items()).hasSize(1)
        val email = page.items().single()
        assertThat(email.id()).isEqualTo("ie_123")
        assertThat(email.attachments().get().single().filename()).isEqualTo("invoice.pdf")
        assertThat(email.ccAddresses()).isEmpty
        assertThat(page.hasNextPage()).isFalse()
    }

    @Test
    fun mailboxListAutoPager() {
        fun pageJson(page: Int, hasNext: Boolean) =
            NewResourcesFixtures.INBOUND_EMAIL_PAGE.replace("\"page\": 1", "\"page\": $page")
                .replace("\"pages\": 1", "\"pages\": 2")
                .replace("\"has_next_page\": false", "\"has_next_page\": $hasNext")
        stubFor(
            get(urlPathEqualTo("/api/mailbox/"))
                .withQueryParam("page", absent())
                .willReturn(okJson(pageJson(1, true)))
        )
        stubFor(
            get(urlPathEqualTo("/api/mailbox/"))
                .withQueryParam("page", equalTo("2"))
                .willReturn(okJson(pageJson(2, false)))
        )

        val items = client.mailbox().list().autoPager().toList()

        assertThat(items).hasSize(2)
        verify(1, getRequestedFor(urlPathEqualTo("/api/mailbox/")).withQueryParam("page", absent()))
        verify(
            1,
            getRequestedFor(urlPathEqualTo("/api/mailbox/")).withQueryParam("page", equalTo("2")),
        )
    }

    @Test
    fun mailboxRetrieve() {
        stubFor(
            get(urlPathEqualTo("/api/mailbox/ie_123"))
                .willReturn(okJson(NewResourcesFixtures.INBOUND_EMAIL))
        )

        val email = client.mailbox().retrieve("ie_123")

        verify(getRequestedFor(urlPathEqualTo("/api/mailbox/ie_123")))
        assertThat(email.id()).isEqualTo("ie_123")
        assertThat(email.senderEmail()).isEqualTo("sender@example.com")
        assertThat(email.documentId()).contains("doc_123")
    }

    @Test
    fun mailboxDownloadAttachment() {
        val bytes = byteArrayOf(0x25, 0x50, 0x44, 0x46, 0x00, 0x7f)
        stubFor(
            get(urlPathEqualTo("/api/mailbox/ie_123/attachments/invoice.pdf"))
                .willReturn(
                    aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/pdf")
                        .withBody(bytes)
                )
        )

        client
            .mailbox()
            .downloadAttachment(
                "invoice.pdf",
                MailboxDownloadAttachmentParams.builder().inboundEmailId("ie_123").build(),
            )
            .use { response ->
                assertThat(response.statusCode()).isEqualTo(200)
                assertThat(response.headers().values("Content-Type"))
                    .containsExactly("application/pdf")
                assertThat(response.body().readBytes()).isEqualTo(bytes)
            }

        verify(getRequestedFor(urlPathEqualTo("/api/mailbox/ie_123/attachments/invoice.pdf")))
    }

    @Test
    fun mailboxReprocess() {
        stubFor(
            post(urlPathEqualTo("/api/mailbox/ie_123/reprocess"))
                .willReturn(okJson(NewResourcesFixtures.INBOUND_EMAIL).withStatus(202))
        )

        val email = client.mailbox().reprocess("ie_123")

        verify(
            postRequestedFor(urlPathEqualTo("/api/mailbox/ie_123/reprocess"))
                .withRequestBody(absent())
        )
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
                        .page(1L)
                        .pageSize(20L)
                        .state(DocumentState.DRAFT)
                        .type(DocumentType.INVOICE)
                        .dateFrom(OffsetDateTime.parse("2025-01-01T00:00:00Z"))
                        .dateTo(OffsetDateTime.parse("2025-01-31T00:00:00Z"))
                        .search("acme")
                        .sortBy(DraftListParams.SortBy.DUE_DATE)
                        .sortOrder(DraftListParams.SortOrder.DESC)
                        .build()
                )

        verify(
            getRequestedFor(urlPathEqualTo("/api/drafts/"))
                .withQueryParam("page", equalTo("1"))
                .withQueryParam("page_size", equalTo("20"))
                .withQueryParam("state", equalTo("DRAFT"))
                .withQueryParam("type", equalTo("INVOICE"))
                .withQueryParam("date_from", equalTo("2025-01-01T00:00:00Z"))
                .withQueryParam("date_to", equalTo("2025-01-31T00:00:00Z"))
                .withQueryParam("search", equalTo("acme"))
                .withQueryParam("sort_by", equalTo("due_date"))
                .withQueryParam("sort_order", equalTo("desc"))
        )
        assertThat(page.items().single().id()).isEqualTo("doc_123")
        assertThat(page.items().single().state()).contains(DocumentState.DRAFT)
        assertThat(page.hasNextPage()).isFalse()
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
                        .endDate(LocalDate.parse("2025-01-31"))
                        .aggregation(StatsAggregationType.MONTH)
                        .build()
                )

        verify(
            getRequestedFor(urlPathEqualTo("/api/stats"))
                .withQueryParam("start_date", equalTo("2025-01-01"))
                .withQueryParam("end_date", equalTo("2025-01-31"))
                .withQueryParam("aggregation", equalTo("MONTH"))
        )
        assertThat(stats.tenantId()).isEqualTo("tenant_123")
        assertThat(stats.aggregation()).isEqualTo(StatsAggregationType.DAY)
        assertThat(stats.actions().map { it.action() })
            .containsExactly(
                StatsResponse.ActionStats.Action.DOCUMENT_SENT,
                StatsResponse.ActionStats.Action.DOCUMENT_RECEIVED,
            )
        assertThat(stats.totalDays()).isEqualTo(31L)
        assertThat(stats.budgetEstimationDays()).contains(120.5)
    }

    @Test
    fun statsRetrieveWithoutParams() {
        stubFor(get(urlPathEqualTo("/api/stats")).willReturn(okJson(NewResourcesFixtures.STATS)))

        client.stats().retrieve()

        verify(
            getRequestedFor(urlPathEqualTo("/api/stats"))
                .withQueryParam("start_date", absent())
                .withQueryParam("aggregation", absent())
        )
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

        verify(
            postRequestedFor(urlPathEqualTo("/api/conversion/pdf"))
                .withHeader("Content-Type", containing("multipart/form-data"))
                .withRequestBodyPart(
                    aMultipart()
                        .withName("file")
                        .withBody(binaryEqualTo("%PDF-1.4 test".toByteArray()))
                        .build()
                )
        )
        assertThat(task.taskId()).isEqualTo("task_123")
        assertThat(task.status()).contains(DocumentCreateFromPdfTask.Status.PENDING)
    }

    @Test
    fun conversionRetrievePdfStatus() {
        stubFor(
            get(urlPathEqualTo("/api/conversion/pdf/task_123"))
                .willReturn(okJson(NewResourcesFixtures.TASK))
        )

        val task = client.conversion().retrievePdfStatus("task_123")

        verify(getRequestedFor(urlPathEqualTo("/api/conversion/pdf/task_123")))
        assertThat(task.taskId()).isEqualTo("task_123")
    }

    @Test
    fun conversionRetrievePdfResult() {
        stubFor(
            get(urlPathEqualTo("/api/conversion/pdf/task_123/result"))
                .willReturn(okJson(NewResourcesFixtures.PDF_RESULT))
        )

        val result = client.conversion().retrievePdfResult("task_123")

        verify(getRequestedFor(urlPathEqualTo("/api/conversion/pdf/task_123/result")))
        assertThat(result.invoiceId()).contains("INV-1")
        assertThat(result.success()).contains(true)
        assertThat(result.ublDocument()).contains("<Invoice/>")
    }
}
