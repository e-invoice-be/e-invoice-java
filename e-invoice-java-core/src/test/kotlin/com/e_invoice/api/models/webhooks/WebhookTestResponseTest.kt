package com.e_invoice.api.models.webhooks

import com.e_invoice.api.core.JsonValue
import com.e_invoice.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookTestResponseTest {

    @Test
    fun create() {
        val webhookTestResponse =
            WebhookTestResponse.builder()
                .message("message")
                .success(true)
                .webhookDeliveryResult(
                    WebhookTestResponse.WebhookDeliveryResult.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        assertThat(webhookTestResponse.message()).isEqualTo("message")
        assertThat(webhookTestResponse.success()).isEqualTo(true)
        assertThat(webhookTestResponse.webhookDeliveryResult())
            .isEqualTo(
                WebhookTestResponse.WebhookDeliveryResult.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val webhookTestResponse =
            WebhookTestResponse.builder()
                .message("message")
                .success(true)
                .webhookDeliveryResult(
                    WebhookTestResponse.WebhookDeliveryResult.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val roundtrippedWebhookTestResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(webhookTestResponse),
                jacksonTypeRef<WebhookTestResponse>(),
            )

        assertThat(roundtrippedWebhookTestResponse).isEqualTo(webhookTestResponse)
    }
}
