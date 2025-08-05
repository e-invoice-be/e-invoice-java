// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.models.webhooks

import com.e_invoice.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookResponseTest {

    @Test
    fun create() {
        val webhookResponse =
            WebhookResponse.builder()
                .id("id")
                .addEvent("string")
                .secret("secret")
                .url("https://example.com")
                .enabled(true)
                .build()

        assertThat(webhookResponse.id()).isEqualTo("id")
        assertThat(webhookResponse.events()).containsExactly("string")
        assertThat(webhookResponse.secret()).isEqualTo("secret")
        assertThat(webhookResponse.url()).isEqualTo("https://example.com")
        assertThat(webhookResponse.enabled()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val webhookResponse =
            WebhookResponse.builder()
                .id("id")
                .addEvent("string")
                .secret("secret")
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
