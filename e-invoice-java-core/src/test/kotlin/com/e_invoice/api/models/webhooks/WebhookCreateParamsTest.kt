// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.models.webhooks

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookCreateParamsTest {

    @Test
    fun create() {
        WebhookCreateParams.builder()
            .addEvent("string")
            .url("https://example.com")
            .enabled(true)
            .build()
    }

    @Test
    fun body() {
        val params =
            WebhookCreateParams.builder()
                .addEvent("string")
                .url("https://example.com")
                .enabled(true)
                .build()

        val body = params._body()

        assertThat(body.events()).containsExactly("string")
        assertThat(body.url()).isEqualTo("https://example.com")
        assertThat(body.enabled()).contains(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            WebhookCreateParams.builder().addEvent("string").url("https://example.com").build()

        val body = params._body()

        assertThat(body.events()).containsExactly("string")
        assertThat(body.url()).isEqualTo("https://example.com")
    }
}
