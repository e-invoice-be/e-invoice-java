// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.models.webhooks

import com.e_invoice.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class WebhookResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val webhookResponse =
            WebhookResponse.builder()
                .id("id")
                .addEvent("string")
                .url("https://example.com")
                .enabled(true)
                .build()

        assertThat(webhookResponse.id()).isEqualTo("id")
        assertThat(webhookResponse.events()).containsExactly("string")
        assertThat(webhookResponse.url()).isEqualTo("https://example.com")
        assertThat(webhookResponse.enabled()).contains(true)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val webhookResponse =
            WebhookResponse.builder()
                .id("id")
                .addEvent("string")
                .url("https://example.com")
                .enabled(true)
                .build()

        val roundtrippedWebhookResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(webhookResponse),
                jacksonTypeRef<WebhookResponse>(),
            )

        assertThat(roundtrippedWebhookResponse).isEqualTo(webhookResponse)
    }
}
