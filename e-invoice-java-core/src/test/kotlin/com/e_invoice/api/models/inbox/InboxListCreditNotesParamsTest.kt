// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.models.inbox

import com.e_invoice.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InboxListCreditNotesParamsTest {

    @Test
    fun create() {
        InboxListCreditNotesParams.builder()
            .page(1L)
            .pageSize(1L)
            .sortBy(InboxListCreditNotesParams.SortBy.CREATED_AT)
            .sortOrder(InboxListCreditNotesParams.SortOrder.ASC)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            InboxListCreditNotesParams.builder()
                .page(1L)
                .pageSize(1L)
                .sortBy(InboxListCreditNotesParams.SortBy.CREATED_AT)
                .sortOrder(InboxListCreditNotesParams.SortOrder.ASC)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("page", "1")
                    .put("page_size", "1")
                    .put("sort_by", "created_at")
                    .put("sort_order", "asc")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = InboxListCreditNotesParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
