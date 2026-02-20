// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.services.async

import com.e_invoice.api.client.okhttp.EInvoiceOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class OutboxServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun listDraftDocuments() {
        val client = EInvoiceOkHttpClientAsync.builder().apiKey("My API Key").build()
        val outboxServiceAsync = client.outbox()

        val pageFuture = outboxServiceAsync.listDraftDocuments()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listReceivedDocuments() {
        val client = EInvoiceOkHttpClientAsync.builder().apiKey("My API Key").build()
        val outboxServiceAsync = client.outbox()

        val pageFuture = outboxServiceAsync.listReceivedDocuments()

        val page = pageFuture.get()
        page.response().validate()
    }
}
