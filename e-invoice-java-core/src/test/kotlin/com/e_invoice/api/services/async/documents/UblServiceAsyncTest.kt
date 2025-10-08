// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.services.async.documents

import com.e_invoice.api.TestServerExtension
import com.e_invoice.api.client.okhttp.EInvoiceOkHttpClientAsync
import com.e_invoice.api.models.documents.ubl.UblCreateFromUblParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class UblServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun createFromUbl() {
        val client =
            EInvoiceOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val ublServiceAsync = client.documents().ubl()

        val documentResponseFuture =
            ublServiceAsync.createFromUbl(
                UblCreateFromUblParams.builder().file("some content".byteInputStream()).build()
            )

        val documentResponse = documentResponseFuture.get()
        documentResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            EInvoiceOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val ublServiceAsync = client.documents().ubl()

        val ublFuture = ublServiceAsync.get("document_id")

        val ubl = ublFuture.get()
        ubl.validate()
    }
}
