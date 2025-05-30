// File generated from our OpenAPI spec by Stainless.

package com.e_invoice_api.api.services.blocking

import com.e_invoice_api.api.TestServerExtension
import com.e_invoice_api.api.client.okhttp.EInvoiceOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InboxServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun list() {
        val client =
            EInvoiceOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboxService = client.inbox()

        val page = inboxService.list()

        page.response().validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun listCreditNotes() {
        val client =
            EInvoiceOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboxService = client.inbox()

        val page = inboxService.listCreditNotes()

        page.response().validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun listInvoices() {
        val client =
            EInvoiceOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboxService = client.inbox()

        val page = inboxService.listInvoices()

        page.response().validate()
    }
}
