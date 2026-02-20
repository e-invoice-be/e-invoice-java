// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.services.blocking.documents

import com.e_invoice.api.client.okhttp.EInvoiceOkHttpClient
import com.e_invoice.api.models.documents.ubl.UblCreateFromUblParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UblServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun createFromUbl() {
        val client = EInvoiceOkHttpClient.builder().apiKey("My API Key").build()
        val ublService = client.documents().ubl()

        val documentResponse =
            ublService.createFromUbl(
                UblCreateFromUblParams.builder().file("some content".byteInputStream()).build()
            )

        documentResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = EInvoiceOkHttpClient.builder().apiKey("My API Key").build()
        val ublService = client.documents().ubl()

        val ubl = ublService.get("document_id")

        ubl.validate()
    }
}
