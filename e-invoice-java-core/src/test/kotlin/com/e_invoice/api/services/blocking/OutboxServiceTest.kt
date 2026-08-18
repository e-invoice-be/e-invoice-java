// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.services.blocking

import com.e_invoice.api.client.okhttp.EInvoiceOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class OutboxServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun listDraftDocuments() {
        val client = EInvoiceOkHttpClient.builder().apiKey("My API Key").build()
        val outboxService = client.outbox()

        val page = outboxService.listDraftDocuments()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listReceivedDocuments() {
        val client = EInvoiceOkHttpClient.builder().apiKey("My API Key").build()
        val outboxService = client.outbox()

        val page = outboxService.listReceivedDocuments()

        page.response().validate()
    }
}
