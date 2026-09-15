// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.services.blocking

import com.e_invoice.api.client.okhttp.EInvoiceOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MeServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = EInvoiceOkHttpClient.builder().apiKey("My API Key").build()
        val meService = client.me()

        val me = meService.retrieve()

        me.validate()
    }
}
