// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.services.async

import com.e_invoice.api.client.okhttp.EInvoiceOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MeServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = EInvoiceOkHttpClientAsync.builder().apiKey("My API Key").build()
        val meServiceAsync = client.me()

        val meFuture = meServiceAsync.retrieve()

        val me = meFuture.get()
        me.validate()
    }
}
