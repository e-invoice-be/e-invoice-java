package com.e_invoice.api.models.conversion

import com.e_invoice.api.core.MultipartField
import com.e_invoice.api.core.http.QueryParams
import com.e_invoice.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.io.InputStream
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DocumentCreateFromPdfTaskTest {

    @Test
    fun create() {
        val task =
            DocumentCreateFromPdfTask.builder()
                .taskId("task_id")
                .status(DocumentCreateFromPdfTask.Status.COMPLETED)
                .build()

        assertThat(task.taskId()).isEqualTo("task_id")
        assertThat(task.status()).contains(DocumentCreateFromPdfTask.Status.COMPLETED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val task =
            DocumentCreateFromPdfTask.builder()
                .taskId("task_id")
                .status(DocumentCreateFromPdfTask.Status.PENDING)
                .build()

        val roundtripped =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(task),
                jacksonTypeRef<DocumentCreateFromPdfTask>(),
            )

        assertThat(roundtripped).isEqualTo(task)
    }
}

internal class ConversionCreateFromPdfParamsTest {

    @Test
    fun queryParams() {
        val params =
            ConversionCreateFromPdfParams.builder().file("Example data".byteInputStream()).build()

        assertThat(params._queryParams()).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            ConversionCreateFromPdfParams.builder().file("Example data".byteInputStream()).build()

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
                mapOf("file" to MultipartField.of("Example data".byteInputStream())).mapValues {
                    (_, field) ->
                    field.map { (it as? ByteArray)?.inputStream() ?: it }
                }
            )
    }
}

internal class ConversionRetrievePdfParamsTest {

    @Test
    fun statusPathParams() {
        val params = ConversionRetrievePdfStatusParams.builder().taskId("task_id").build()

        assertThat(params._pathParam(0)).isEqualTo("task_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun resultPathParams() {
        val params = ConversionRetrievePdfResultParams.builder().taskId("task_id").build()

        assertThat(params._pathParam(0)).isEqualTo("task_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
