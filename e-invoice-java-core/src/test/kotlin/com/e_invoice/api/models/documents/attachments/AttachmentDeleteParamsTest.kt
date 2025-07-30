// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.models.documents.attachments

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AttachmentDeleteParamsTest {

    @Test
    fun create() {
        AttachmentDeleteParams.builder()
            .documentId("document_id")
            .attachmentId("attachment_id")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AttachmentDeleteParams.builder()
                .documentId("document_id")
                .attachmentId("attachment_id")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("document_id")
        assertThat(params._pathParam(1)).isEqualTo("attachment_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
