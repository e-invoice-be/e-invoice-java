package com.e_invoice.api.models.webhooks

import com.e_invoice.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.Test

internal class WebhookTestParamsTest {

    @Test
    fun create() {
        WebhookTestParams.builder()
            .webhookId("webhook_id")
            .data(
                WebhookTestParams.Data.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .eventType("document.received")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            WebhookTestParams.builder()
                .webhookId("webhook_id")
                .data(WebhookTestParams.Data.builder().build())
                .eventType("document.received")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("webhook_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            WebhookTestParams.builder()
                .webhookId("webhook_id")
                .data(
                    WebhookTestParams.Data.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .eventType("document.received")
                .build()

        val body = params._body()

        assertThat(body.data())
            .isEqualTo(
                WebhookTestParams.Data.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.eventType()).isEqualTo("document.received")
    }

    @Test
    fun buildWithoutRequiredFieldsThrows() {
        assertThatThrownBy { WebhookTestParams.builder().webhookId("webhook_id").build() }
            .isInstanceOf(IllegalStateException::class.java)
    }
}
