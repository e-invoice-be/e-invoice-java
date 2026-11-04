package com.e_invoice.api.services

import com.e_invoice.api.client.EInvoiceClient
import com.e_invoice.api.client.EInvoiceClientAsync
import com.e_invoice.api.client.okhttp.EInvoiceOkHttpClient
import com.e_invoice.api.client.okhttp.EInvoiceOkHttpClientAsync
import com.e_invoice.api.core.JsonValue
import com.e_invoice.api.errors.UnprocessableEntityException
import com.e_invoice.api.models.webhooks.WebhookRetrieveHistoryResponse
import com.e_invoice.api.models.webhooks.WebhookTestParams
import com.e_invoice.api.models.webhooks.WebhookTestResponse
import com.github.tomakehurst.wiremock.client.WireMock.equalTo
import com.github.tomakehurst.wiremock.client.WireMock.equalToJson
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.getRequestedFor
import com.github.tomakehurst.wiremock.client.WireMock.okJson
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.postRequestedFor
import com.github.tomakehurst.wiremock.client.WireMock.status
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.client.WireMock.urlPathEqualTo
import com.github.tomakehurst.wiremock.client.WireMock.verify
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.parallel.ResourceLock

/**
 * Mock-server tests for `GET /api/webhooks/{webhook_id}/history` and `POST
 * /api/webhooks/{webhook_id}/test`.
 */
@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class WebhookServiceMockServerTest {

    companion object {

        private const val HISTORY_PATH = "/api/webhooks/webhook_id/history"

        private const val TEST_PATH = "/api/webhooks/webhook_id/test"

        private const val HISTORY_JSON =
            """{"history":[{"event_type":"document.received","status_code":200},{"event_type":"document.sent"}]}"""

        private const val TEST_JSON =
            """{"success":true,"message":"Test event delivered","webhook_delivery_result":{"status_code":200,"attempts":1}}"""

        private const val TEST_REQUEST_JSON =
            """{"event_type":"document.received","data":{"document_id":"doc_123","amount":42}}"""

        private fun testParams(): WebhookTestParams =
            WebhookTestParams.builder()
                .eventType("document.received")
                .data(
                    WebhookTestParams.Data.builder()
                        .putAdditionalProperty("document_id", JsonValue.from("doc_123"))
                        .putAdditionalProperty("amount", JsonValue.from(42))
                        .build()
                )
                .build()
    }

    private lateinit var client: EInvoiceClient
    private lateinit var asyncClient: EInvoiceClientAsync

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            EInvoiceOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
        asyncClient =
            EInvoiceOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
    }

    private fun assertHistory(response: WebhookRetrieveHistoryResponse) {
        response.validate()
        assertThat(response.history()).hasSize(2)
        assertThat(response.history()[0]._additionalProperties())
            .containsEntry("event_type", JsonValue.from("document.received"))
            .containsEntry("status_code", JsonValue.from(200))
        assertThat(response.history()[1]._additionalProperties())
            .containsEntry("event_type", JsonValue.from("document.sent"))
    }

    private fun assertTestResponse(response: WebhookTestResponse) {
        response.validate()
        assertThat(response.success()).isTrue()
        assertThat(response.message()).isEqualTo("Test event delivered")
        assertThat(response.webhookDeliveryResult()._additionalProperties())
            .containsEntry("status_code", JsonValue.from(200))
            .containsEntry("attempts", JsonValue.from(1))
    }

    @Test
    fun retrieveHistory() {
        stubFor(get(urlPathEqualTo(HISTORY_PATH)).willReturn(okJson(HISTORY_JSON)))

        val response = client.webhooks().retrieveHistory("webhook_id")

        assertHistory(response)
        verify(
            getRequestedFor(urlPathEqualTo(HISTORY_PATH))
                .withHeader("Authorization", equalTo("Bearer My API Key"))
        )
    }

    @Test
    fun retrieveHistoryWithRawResponse() {
        stubFor(get(urlPathEqualTo(HISTORY_PATH)).willReturn(okJson(HISTORY_JSON)))

        client.webhooks().withRawResponse().retrieveHistory("webhook_id").use { response ->
            assertThat(response.statusCode()).isEqualTo(200)
            assertHistory(response.parse())
        }
        verify(getRequestedFor(urlPathEqualTo(HISTORY_PATH)))
    }

    @Test
    fun retrieveHistoryAsync() {
        stubFor(get(urlPathEqualTo(HISTORY_PATH)).willReturn(okJson(HISTORY_JSON)))

        val response = asyncClient.webhooks().retrieveHistory("webhook_id").get()

        assertHistory(response)
        verify(getRequestedFor(urlPathEqualTo(HISTORY_PATH)))
    }

    @Test
    fun retrieveHistoryAsyncWithRawResponse() {
        stubFor(get(urlPathEqualTo(HISTORY_PATH)).willReturn(okJson(HISTORY_JSON)))

        asyncClient.webhooks().withRawResponse().retrieveHistory("webhook_id").get().use { response
            ->
            assertThat(response.statusCode()).isEqualTo(200)
            assertHistory(response.parse())
        }
        verify(getRequestedFor(urlPathEqualTo(HISTORY_PATH)))
    }

    @Test
    fun test() {
        stubFor(post(urlPathEqualTo(TEST_PATH)).willReturn(okJson(TEST_JSON)))

        val response = client.webhooks().test("webhook_id", testParams())

        assertTestResponse(response)
        verify(
            postRequestedFor(urlPathEqualTo(TEST_PATH))
                .withHeader("Authorization", equalTo("Bearer My API Key"))
                .withHeader("Content-Type", equalTo("application/json"))
                .withRequestBody(equalToJson(TEST_REQUEST_JSON))
        )
    }

    @Test
    fun testWithRawResponse() {
        stubFor(post(urlPathEqualTo(TEST_PATH)).willReturn(okJson(TEST_JSON)))

        client
            .webhooks()
            .withRawResponse()
            .test(testParams().toBuilder().webhookId("webhook_id").build())
            .use { response ->
                assertThat(response.statusCode()).isEqualTo(200)
                assertTestResponse(response.parse())
            }
        verify(
            postRequestedFor(urlPathEqualTo(TEST_PATH))
                .withRequestBody(equalToJson(TEST_REQUEST_JSON))
        )
    }

    @Test
    fun testAsync() {
        stubFor(post(urlPathEqualTo(TEST_PATH)).willReturn(okJson(TEST_JSON)))

        val response = asyncClient.webhooks().test("webhook_id", testParams()).get()

        assertTestResponse(response)
        verify(
            postRequestedFor(urlPathEqualTo(TEST_PATH))
                .withRequestBody(equalToJson(TEST_REQUEST_JSON))
        )
    }

    @Test
    fun testAsyncWithRawResponse() {
        stubFor(post(urlPathEqualTo(TEST_PATH)).willReturn(okJson(TEST_JSON)))

        asyncClient.webhooks().withRawResponse().test("webhook_id", testParams()).get().use {
            response ->
            assertThat(response.statusCode()).isEqualTo(200)
            assertTestResponse(response.parse())
        }
        verify(
            postRequestedFor(urlPathEqualTo(TEST_PATH))
                .withRequestBody(equalToJson(TEST_REQUEST_JSON))
        )
    }

    @Test
    fun testUnsubscribedEventType422() {
        stubFor(
            post(urlPathEqualTo(TEST_PATH))
                .willReturn(
                    status(422)
                        .withHeader("Content-Type", "application/json")
                        .withBody("""{"detail":"event_type not subscribed"}""")
                )
        )

        assertThrows<UnprocessableEntityException> {
            client.webhooks().test("webhook_id", testParams())
        }
    }
}
