// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.services.async

import com.e_invoice.api.TestServerExtension
import com.e_invoice.api.client.okhttp.EInvoiceOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class OutboxServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun listDraftDocuments() {
        val client =
            EInvoiceOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val outboxServiceAsync = client.outbox()

        val pageFuture = outboxServiceAsync.listDraftDocuments()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun listReceivedDocuments() {
        val client =
            EInvoiceOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val outboxServiceAsync = client.outbox()

        val pageFuture = outboxServiceAsync.listReceivedDocuments()

        val page = pageFuture.get()
        page.response().validate()
    }
}
