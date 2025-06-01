// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.models.webhooks

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class WebhookUpdateParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        WebhookUpdateParams.builder()
            .webhookId("webhook_id")
            .enabled(true)
            .addEvent("string")
            .url("https://example.com")
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun pathParams() {
        val params = WebhookUpdateParams.builder().webhookId("webhook_id").build()

        assertThat(params._pathParam(0)).isEqualTo("webhook_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
            WebhookUpdateParams.builder()
                .webhookId("webhook_id")
                .enabled(true)
                .addEvent("string")
                .url("https://example.com")
                .build()

        val body = params._body()

        assertThat(body.enabled()).contains(true)
        assertThat(body.events().getOrNull()).containsExactly("string")
        assertThat(body.url()).contains("https://example.com")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun bodyWithoutOptionalFields() {
        val params = WebhookUpdateParams.builder().webhookId("webhook_id").build()

        val body = params._body()
    }
}
