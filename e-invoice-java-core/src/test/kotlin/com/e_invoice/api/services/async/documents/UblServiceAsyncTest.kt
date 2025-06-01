// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.services.async.documents

import com.e_invoice.api.TestServerExtension
import com.e_invoice.api.client.okhttp.EInvoiceOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class UblServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
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
