// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.services.async

import com.e_invoice.api.client.okhttp.EInvoiceOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class InboxServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = EInvoiceOkHttpClientAsync.builder().apiKey("My API Key").build()
        val inboxServiceAsync = client.inbox()

        val pageFuture = inboxServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listCreditNotes() {
        val client = EInvoiceOkHttpClientAsync.builder().apiKey("My API Key").build()
        val inboxServiceAsync = client.inbox()

        val pageFuture = inboxServiceAsync.listCreditNotes()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listInvoices() {
        val client = EInvoiceOkHttpClientAsync.builder().apiKey("My API Key").build()
        val inboxServiceAsync = client.inbox()

        val pageFuture = inboxServiceAsync.listInvoices()

        val page = pageFuture.get()
        page.response().validate()
    }
}
