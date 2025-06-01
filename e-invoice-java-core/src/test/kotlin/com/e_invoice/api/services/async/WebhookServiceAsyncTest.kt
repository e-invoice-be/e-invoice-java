// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.services.async

import com.e_invoice.api.TestServerExtension
import com.e_invoice.api.client.okhttp.EInvoiceOkHttpClientAsync
import com.e_invoice.api.models.webhooks.WebhookCreateParams
import com.e_invoice.api.models.webhooks.WebhookUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class WebhookServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val client =
            EInvoiceOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val webhookServiceAsync = client.webhooks()

        val webhookResponseFuture =
            webhookServiceAsync.create(
                WebhookCreateParams.builder()
                    .addEvent("string")
                    .url("https://example.com")
                    .enabled(true)
                    .build()
            )

        val webhookResponse = webhookResponseFuture.get()
        webhookResponse.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieve() {
        val client =
            EInvoiceOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val webhookServiceAsync = client.webhooks()

        val webhookResponseFuture = webhookServiceAsync.retrieve("webhook_id")

        val webhookResponse = webhookResponseFuture.get()
        webhookResponse.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun update() {
        val client =
            EInvoiceOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val webhookServiceAsync = client.webhooks()

        val webhookResponseFuture =
            webhookServiceAsync.update(
                WebhookUpdateParams.builder()
                    .webhookId("webhook_id")
                    .enabled(true)
                    .addEvent("string")
                    .url("https://example.com")
                    .build()
            )

        val webhookResponse = webhookResponseFuture.get()
        webhookResponse.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun list() {
        val client =
            EInvoiceOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val webhookServiceAsync = client.webhooks()

        val webhookResponsesFuture = webhookServiceAsync.list()

        val webhookResponses = webhookResponsesFuture.get()
        webhookResponses.forEach { it.validate() }
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun delete() {
        val client =
            EInvoiceOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val webhookServiceAsync = client.webhooks()

        val webhookFuture = webhookServiceAsync.delete("webhook_id")

        val webhook = webhookFuture.get()
        webhook.validate()
    }
}
