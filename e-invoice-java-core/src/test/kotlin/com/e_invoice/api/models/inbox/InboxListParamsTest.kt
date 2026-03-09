// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.models.inbox

import com.e_invoice.api.core.http.QueryParams
import com.e_invoice.api.models.documents.DocumentType
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InboxListParamsTest {

    @Test
    fun create() {
        InboxListParams.builder()
            .dateFrom(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .dateTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .page(1L)
            .pageSize(1L)
            .search("search")
            .sender("sender")
            .state(DocumentState.DRAFT)
            .type(DocumentType.INVOICE)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            InboxListParams.builder()
                .dateFrom(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dateTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .page(1L)
                .pageSize(1L)
                .search("search")
                .sender("sender")
                .state(DocumentState.DRAFT)
                .type(DocumentType.INVOICE)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("date_from", "2019-12-27T18:11:19.117Z")
                    .put("date_to", "2019-12-27T18:11:19.117Z")
                    .put("page", "1")
                    .put("page_size", "1")
                    .put("search", "search")
                    .put("sender", "sender")
                    .put("state", "DRAFT")
                    .put("type", "INVOICE")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = InboxListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
