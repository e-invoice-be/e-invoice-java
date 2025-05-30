// File generated from our OpenAPI spec by Stainless.

package com.e_invoice_api.api.models.documents.attachments

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AttachmentListParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        AttachmentListParams.builder().documentId("document_id").build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun pathParams() {
        val params = AttachmentListParams.builder().documentId("document_id").build()

        assertThat(params._pathParam(0)).isEqualTo("document_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
