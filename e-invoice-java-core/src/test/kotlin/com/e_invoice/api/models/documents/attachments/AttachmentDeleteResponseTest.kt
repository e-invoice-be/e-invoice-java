// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.models.documents.attachments

import com.e_invoice.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AttachmentDeleteResponseTest {

    @Test
    fun create() {
        val attachmentDeleteResponse = AttachmentDeleteResponse.builder().isDeleted(true).build()

        assertThat(attachmentDeleteResponse.isDeleted()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val attachmentDeleteResponse = AttachmentDeleteResponse.builder().isDeleted(true).build()

        val roundtrippedAttachmentDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(attachmentDeleteResponse),
                jacksonTypeRef<AttachmentDeleteResponse>(),
            )

        assertThat(roundtrippedAttachmentDeleteResponse).isEqualTo(attachmentDeleteResponse)
    }
}
