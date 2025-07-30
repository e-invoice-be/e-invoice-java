// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.models.documents

import com.e_invoice.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DocumentDeleteResponseTest {

    @Test
    fun create() {
        val documentDeleteResponse = DocumentDeleteResponse.builder().isDeleted(true).build()

        assertThat(documentDeleteResponse.isDeleted()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val documentDeleteResponse = DocumentDeleteResponse.builder().isDeleted(true).build()

        val roundtrippedDocumentDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(documentDeleteResponse),
                jacksonTypeRef<DocumentDeleteResponse>(),
            )

        assertThat(roundtrippedDocumentDeleteResponse).isEqualTo(documentDeleteResponse)
    }
}
