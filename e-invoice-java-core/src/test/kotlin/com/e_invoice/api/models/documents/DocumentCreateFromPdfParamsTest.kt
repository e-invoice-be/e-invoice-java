// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.models.documents

import com.e_invoice.api.core.MultipartField
import com.e_invoice.api.core.http.QueryParams
import java.io.InputStream
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DocumentCreateFromPdfParamsTest {

    @Test
    fun create() {
        DocumentCreateFromPdfParams.builder()
            .customerTaxId("customer_tax_id")
            .vendorTaxId("vendor_tax_id")
            .file("Example data".byteInputStream())
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            DocumentCreateFromPdfParams.builder()
                .customerTaxId("customer_tax_id")
                .vendorTaxId("vendor_tax_id")
                .file("Example data".byteInputStream())
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("customer_tax_id", "customer_tax_id")
                    .put("vendor_tax_id", "vendor_tax_id")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            DocumentCreateFromPdfParams.builder().file("Example data".byteInputStream()).build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            DocumentCreateFromPdfParams.builder()
                .customerTaxId("customer_tax_id")
                .vendorTaxId("vendor_tax_id")
                .file("Example data".byteInputStream())
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
                mapOf("file" to MultipartField.of("Example data".byteInputStream())).mapValues {
                    (_, field) ->
                    field.map { (it as? ByteArray)?.inputStream() ?: it }
                }
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            DocumentCreateFromPdfParams.builder().file("Example data".byteInputStream()).build()

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
