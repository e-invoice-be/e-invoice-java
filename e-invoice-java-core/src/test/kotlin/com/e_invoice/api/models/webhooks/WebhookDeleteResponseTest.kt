// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.models.webhooks

import com.e_invoice.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookDeleteResponseTest {

    @Test
    fun create() {
        val webhookDeleteResponse = WebhookDeleteResponse.builder().isDeleted(true).build()

        assertThat(webhookDeleteResponse.isDeleted()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val webhookDeleteResponse = WebhookDeleteResponse.builder().isDeleted(true).build()

        val roundtrippedWebhookDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(webhookDeleteResponse),
                jacksonTypeRef<WebhookDeleteResponse>(),
            )

        assertThat(roundtrippedWebhookDeleteResponse).isEqualTo(webhookDeleteResponse)
    }
}
