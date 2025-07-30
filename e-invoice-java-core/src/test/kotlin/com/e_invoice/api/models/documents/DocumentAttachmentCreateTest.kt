// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.models.documents

import com.e_invoice.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DocumentAttachmentCreateTest {

    @Test
    fun create() {
        val documentAttachmentCreate =
            DocumentAttachmentCreate.builder()
                .fileName("file_name")
                .fileData("file_data")
                .fileSize(0L)
                .fileType("file_type")
                .build()

        assertThat(documentAttachmentCreate.fileName()).isEqualTo("file_name")
        assertThat(documentAttachmentCreate.fileData()).contains("file_data")
        assertThat(documentAttachmentCreate.fileSize()).contains(0L)
        assertThat(documentAttachmentCreate.fileType()).contains("file_type")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val documentAttachmentCreate =
            DocumentAttachmentCreate.builder()
                .fileName("file_name")
                .fileData("file_data")
                .fileSize(0L)
                .fileType("file_type")
                .build()

        val roundtrippedDocumentAttachmentCreate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(documentAttachmentCreate),
                jacksonTypeRef<DocumentAttachmentCreate>(),
            )

        assertThat(roundtrippedDocumentAttachmentCreate).isEqualTo(documentAttachmentCreate)
    }
}
