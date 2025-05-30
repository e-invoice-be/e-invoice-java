// File generated from our OpenAPI spec by Stainless.

package com.e_invoice_api.api.models.outbox

import com.e_invoice_api.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class OutboxListDraftDocumentsParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        OutboxListDraftDocumentsParams.builder().page(1L).pageSize(1L).build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParams() {
        val params = OutboxListDraftDocumentsParams.builder().page(1L).pageSize(1L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("page", "1").put("page_size", "1").build())
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = OutboxListDraftDocumentsParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
