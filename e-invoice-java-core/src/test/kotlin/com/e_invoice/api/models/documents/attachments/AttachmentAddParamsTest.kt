// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.models.documents.attachments

import com.e_invoice.api.core.MultipartField
import java.io.InputStream
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AttachmentAddParamsTest {

    @Test
    fun create() {
        AttachmentAddParams.builder()
            .documentId("document_id")
            .file("some content".byteInputStream())
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AttachmentAddParams.builder()
                .documentId("document_id")
                .file("some content".byteInputStream())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("document_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            AttachmentAddParams.builder()
                .documentId("document_id")
                .file("some content".byteInputStream())
                .build()

        val body = params._body()

        assertThat(body.filterValues { !it.value.isNull() })
            .usingRecursiveComparison()
            // TODO(AssertJ): Replace this and the `mapValues` below with:
            // https://github.com/assertj/assertj/issues/3165
            .withEqualsForType(
                { a, b -> a.readBytes() contentEquals b.readBytes() },
                InputStream::class.java,
            )
            .isEqualTo(
                mapOf("file" to MultipartField.of("some content".byteInputStream())).mapValues {
                    (_, field) ->
                    field.map { (it as? ByteArray)?.inputStream() ?: it }
                }
            )
    }
}
