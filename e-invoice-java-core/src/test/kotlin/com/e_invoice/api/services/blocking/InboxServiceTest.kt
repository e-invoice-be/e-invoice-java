// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.services.blocking

import com.e_invoice.api.client.okhttp.EInvoiceOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class InboxServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = EInvoiceOkHttpClient.builder().apiKey("My API Key").build()
        val inboxService = client.inbox()

        val page = inboxService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listCreditNotes() {
        val client = EInvoiceOkHttpClient.builder().apiKey("My API Key").build()
        val inboxService = client.inbox()

        val page = inboxService.listCreditNotes()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listInvoices() {
        val client = EInvoiceOkHttpClient.builder().apiKey("My API Key").build()
        val inboxService = client.inbox()

        val page = inboxService.listInvoices()

        page.response().validate()
    }
}
