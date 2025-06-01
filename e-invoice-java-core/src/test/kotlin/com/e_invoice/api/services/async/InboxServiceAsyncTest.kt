// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.services.async

import com.e_invoice.api.TestServerExtension
import com.e_invoice.api.client.okhttp.EInvoiceOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InboxServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun list() {
        val client =
            EInvoiceOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboxServiceAsync = client.inbox()

        val pageFuture = inboxServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun listCreditNotes() {
        val client =
            EInvoiceOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboxServiceAsync = client.inbox()

        val pageFuture = inboxServiceAsync.listCreditNotes()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun listInvoices() {
        val client =
            EInvoiceOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboxServiceAsync = client.inbox()

        val pageFuture = inboxServiceAsync.listInvoices()

        val page = pageFuture.get()
        page.response().validate()
    }
}
