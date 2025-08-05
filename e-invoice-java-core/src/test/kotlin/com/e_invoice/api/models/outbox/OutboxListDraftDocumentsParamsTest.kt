// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.models.outbox

import com.e_invoice.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OutboxListDraftDocumentsParamsTest {

    @Test
    fun create() {
        OutboxListDraftDocumentsParams.builder().page(1L).pageSize(1L).build()
    }

    @Test
    fun queryParams() {
        val params = OutboxListDraftDocumentsParams.builder().page(1L).pageSize(1L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("page", "1").put("page_size", "1").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = OutboxListDraftDocumentsParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
