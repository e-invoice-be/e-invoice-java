// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.models.outbox

import com.e_invoice.api.core.http.QueryParams
import com.e_invoice.api.models.documents.DocumentType
import com.e_invoice.api.models.inbox.DocumentState
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OutboxListDraftDocumentsParamsTest {

    @Test
    fun create() {
        OutboxListDraftDocumentsParams.builder()
            .page(1L)
            .pageSize(1L)
            .search("search")
            .sortBy(OutboxListDraftDocumentsParams.SortBy.CREATED_AT)
            .sortOrder(OutboxListDraftDocumentsParams.SortOrder.ASC)
            .state(DocumentState.DRAFT)
            .type(DocumentType.INVOICE)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            OutboxListDraftDocumentsParams.builder()
                .page(1L)
                .pageSize(1L)
                .search("search")
                .sortBy(OutboxListDraftDocumentsParams.SortBy.CREATED_AT)
                .sortOrder(OutboxListDraftDocumentsParams.SortOrder.ASC)
                .state(DocumentState.DRAFT)
                .type(DocumentType.INVOICE)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("page", "1")
                    .put("page_size", "1")
                    .put("search", "search")
                    .put("sort_by", "created_at")
                    .put("sort_order", "asc")
                    .put("state", "DRAFT")
                    .put("type", "INVOICE")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = OutboxListDraftDocumentsParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
