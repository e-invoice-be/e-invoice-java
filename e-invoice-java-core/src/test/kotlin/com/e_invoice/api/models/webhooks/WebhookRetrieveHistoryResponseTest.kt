package com.e_invoice.api.models.webhooks

import com.e_invoice.api.core.JsonValue
import com.e_invoice.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookRetrieveHistoryResponseTest {

    @Test
    fun create() {
        val webhookRetrieveHistoryResponse =
            WebhookRetrieveHistoryResponse.builder()
                .addHistory(
                    WebhookRetrieveHistoryResponse.History.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        assertThat(webhookRetrieveHistoryResponse.history())
            .containsExactly(
                WebhookRetrieveHistoryResponse.History.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val webhookRetrieveHistoryResponse =
            WebhookRetrieveHistoryResponse.builder()
                .addHistory(
                    WebhookRetrieveHistoryResponse.History.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val roundtrippedWebhookRetrieveHistoryResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(webhookRetrieveHistoryResponse),
                jacksonTypeRef<WebhookRetrieveHistoryResponse>(),
            )

        assertThat(roundtrippedWebhookRetrieveHistoryResponse)
            .isEqualTo(webhookRetrieveHistoryResponse)
    }
}
