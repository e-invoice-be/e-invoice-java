// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.models.documents.attachments

import com.e_invoice.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DocumentAttachmentTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val documentAttachment =
            DocumentAttachment.builder()
                .id("id")
                .fileName("file_name")
                .fileSize(0L)
                .fileType("file_type")
                .fileUrl("file_url")
                .build()

        assertThat(documentAttachment.id()).isEqualTo("id")
        assertThat(documentAttachment.fileName()).isEqualTo("file_name")
        assertThat(documentAttachment.fileSize()).contains(0L)
        assertThat(documentAttachment.fileType()).contains("file_type")
        assertThat(documentAttachment.fileUrl()).contains("file_url")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val documentAttachment =
            DocumentAttachment.builder()
                .id("id")
                .fileName("file_name")
                .fileSize(0L)
                .fileType("file_type")
                .fileUrl("file_url")
                .build()

        val roundtrippedDocumentAttachment =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(documentAttachment),
                jacksonTypeRef<DocumentAttachment>(),
            )

        assertThat(roundtrippedDocumentAttachment).isEqualTo(documentAttachment)
    }
}
