// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.services.blocking

import com.e_invoice.api.TestServerExtension
import com.e_invoice.api.client.okhttp.EInvoiceOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class OutboxServiceTest {

    @Disabled("Prism tests are disabled")
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

    @Disabled("Prism tests are disabled")
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
