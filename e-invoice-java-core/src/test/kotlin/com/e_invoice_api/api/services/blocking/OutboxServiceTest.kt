// File generated from our OpenAPI spec by Stainless.

package com.e_invoice_api.api.services.blocking

import com.e_invoice_api.api.TestServerExtension
import com.e_invoice_api.api.client.okhttp.EInvoiceOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class OutboxServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun listDraftDocuments() {
        val client =
            EInvoiceOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val outboxService = client.outbox()

        val page = outboxService.listDraftDocuments()

        page.response().validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun listReceivedDocuments() {
        val client =
            EInvoiceOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val outboxService = client.outbox()

        val page = outboxService.listReceivedDocuments()

        page.response().validate()
    }
}
