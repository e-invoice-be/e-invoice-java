package com.e_invoice.api.services.blocking

import com.e_invoice.api.client.EInvoiceClient
import com.e_invoice.api.client.okhttp.EInvoiceOkHttpClient
import com.github.tomakehurst.wiremock.client.WireMock.absent
import com.github.tomakehurst.wiremock.client.WireMock.anyRequestedFor
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.equalTo
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.okJson
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.client.WireMock.urlPathEqualTo
import com.github.tomakehurst.wiremock.client.WireMock.verify
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

/**
 * Document list pages must stop paging based on `has_next_page` (or `pages`), not by comparing the
 * page number to the total item count.
 */
@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class DocumentPaginationTest {

    private lateinit var client: EInvoiceClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            EInvoiceOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
    }

    private fun pageJson(page: Int, hasNext: Boolean) =
        """
        {
          "items": [{"id": "doc_$page", "created_at": "2025-01-01T10:00:00Z", "state": "RECEIVED"}],
          "total": 50,
          "page": $page,
          "page_size": 1,
          "pages": 2,
          "has_next_page": $hasNext
        }
        """

    @Test
    fun inboxListStopsAtLastPage() {
        stubFor(
            get(urlPathEqualTo("/api/inbox/"))
                .withQueryParam("page", absent())
                .willReturn(okJson(pageJson(1, true)))
        )
        stubFor(
            get(urlPathEqualTo("/api/inbox/"))
                .withQueryParam("page", equalTo("2"))
                .willReturn(okJson(pageJson(2, false)))
        )

        val ids = client.inbox().list().autoPager().map { it.id() }.toList()

        assertThat(ids).containsExactly("doc_1", "doc_2")
        verify(2, anyRequestedFor(anyUrl()))
    }
}
