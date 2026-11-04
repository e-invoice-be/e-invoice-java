package com.e_invoice.api.services

import com.e_invoice.api.client.EInvoiceClient
import com.e_invoice.api.client.EInvoiceClientAsync
import com.e_invoice.api.client.okhttp.EInvoiceOkHttpClient
import com.e_invoice.api.client.okhttp.EInvoiceOkHttpClientAsync
import com.e_invoice.api.core.JsonValue
import com.e_invoice.api.errors.NotFoundException
import com.e_invoice.api.models.documents.DocumentLifecycle
import com.e_invoice.api.models.documents.DocumentRetrieveLifecycleParams
import com.e_invoice.api.models.documents.DocumentRetrieveTimelineParams
import com.e_invoice.api.models.documents.DocumentTimeline
import com.github.tomakehurst.wiremock.client.WireMock.equalTo
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.getRequestedFor
import com.github.tomakehurst.wiremock.client.WireMock.notFound
import com.github.tomakehurst.wiremock.client.WireMock.okJson
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.client.WireMock.urlPathEqualTo
import com.github.tomakehurst.wiremock.client.WireMock.verify
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

/** WireMock-backed tests for `GET /api/documents/{document_id}/timeline` and `/lifecycle`. */
@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class DocumentEventsServiceTest {

    private lateinit var client: EInvoiceClient
    private lateinit var clientAsync: EInvoiceClientAsync

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            EInvoiceOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .maxRetries(0)
                .build()
        clientAsync =
            EInvoiceOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .maxRetries(0)
                .build()
    }

    @Test
    fun retrieveTimeline() {
        stubFor(get(urlPathEqualTo(TIMELINE_PATH)).willReturn(okJson(TIMELINE_JSON)))

        val timeline = client.documents().retrieveTimeline(DOCUMENT_ID)

        verify(
            getRequestedFor(urlPathEqualTo(TIMELINE_PATH))
                .withHeader("Authorization", equalTo("Bearer My API Key"))
        )
        assertTimeline(timeline)
    }

    @Test
    fun retrieveTimelineWithParams() {
        stubFor(get(urlPathEqualTo(TIMELINE_PATH)).willReturn(okJson(TIMELINE_JSON)))

        val timeline =
            client
                .documents()
                .retrieveTimeline(
                    DocumentRetrieveTimelineParams.builder()
                        .documentId(DOCUMENT_ID)
                        .putAdditionalQueryParam("foo", "bar")
                        .putAdditionalHeader("X-Test", "1")
                        .build()
                )

        verify(
            getRequestedFor(urlPathEqualTo(TIMELINE_PATH))
                .withQueryParam("foo", equalTo("bar"))
                .withHeader("X-Test", equalTo("1"))
        )
        assertTimeline(timeline)
    }

    @Test
    fun retrieveTimelineWithRawResponse() {
        stubFor(get(urlPathEqualTo(TIMELINE_PATH)).willReturn(okJson(TIMELINE_JSON)))

        client.documents().withRawResponse().retrieveTimeline(DOCUMENT_ID).use { response ->
            assertThat(response.statusCode()).isEqualTo(200)
            assertTimeline(response.parse())
        }
    }

    @Test
    fun retrieveTimelineAsync() {
        stubFor(get(urlPathEqualTo(TIMELINE_PATH)).willReturn(okJson(TIMELINE_JSON)))

        val timeline = clientAsync.documents().retrieveTimeline(DOCUMENT_ID).get()

        verify(getRequestedFor(urlPathEqualTo(TIMELINE_PATH)))
        assertTimeline(timeline)
    }

    @Test
    fun retrieveTimelineNotFound() {
        stubFor(
            get(urlPathEqualTo(TIMELINE_PATH))
                .willReturn(notFound().withBody("{\"detail\":\"Document not found\"}"))
        )

        assertThatThrownBy { client.documents().retrieveTimeline(DOCUMENT_ID) }
            .isInstanceOf(NotFoundException::class.java)
    }

    @Test
    fun retrieveLifecycle() {
        stubFor(get(urlPathEqualTo(LIFECYCLE_PATH)).willReturn(okJson(LIFECYCLE_JSON)))

        val lifecycle = client.documents().retrieveLifecycle(DOCUMENT_ID)

        verify(
            getRequestedFor(urlPathEqualTo(LIFECYCLE_PATH))
                .withHeader("Authorization", equalTo("Bearer My API Key"))
        )
        assertLifecycle(lifecycle)
    }

    @Test
    fun retrieveLifecycleWithParams() {
        stubFor(get(urlPathEqualTo(LIFECYCLE_PATH)).willReturn(okJson(LIFECYCLE_JSON)))

        val lifecycle =
            client
                .documents()
                .retrieveLifecycle(
                    DocumentRetrieveLifecycleParams.builder()
                        .documentId(DOCUMENT_ID)
                        .putAdditionalQueryParam("foo", "bar")
                        .build()
                )

        verify(
            getRequestedFor(urlPathEqualTo(LIFECYCLE_PATH)).withQueryParam("foo", equalTo("bar"))
        )
        assertLifecycle(lifecycle)
    }

    @Test
    fun retrieveLifecycleWithRawResponse() {
        stubFor(get(urlPathEqualTo(LIFECYCLE_PATH)).willReturn(okJson(LIFECYCLE_JSON)))

        client.documents().withRawResponse().retrieveLifecycle(DOCUMENT_ID).use { response ->
            assertThat(response.statusCode()).isEqualTo(200)
            assertLifecycle(response.parse())
        }
    }

    @Test
    fun retrieveLifecycleAsync() {
        stubFor(get(urlPathEqualTo(LIFECYCLE_PATH)).willReturn(okJson(LIFECYCLE_JSON)))

        val lifecycle = clientAsync.documents().retrieveLifecycle(DOCUMENT_ID).get()

        verify(getRequestedFor(urlPathEqualTo(LIFECYCLE_PATH)))
        assertLifecycle(lifecycle)
    }

    @Test
    fun retrieveLifecycleAsyncWithRawResponse() {
        stubFor(get(urlPathEqualTo(LIFECYCLE_PATH)).willReturn(okJson(LIFECYCLE_JSON)))

        clientAsync.documents().withRawResponse().retrieveLifecycle(DOCUMENT_ID).get().use {
            response ->
            assertThat(response.statusCode()).isEqualTo(200)
            assertLifecycle(response.parse())
        }
    }

    private fun assertTimeline(timeline: DocumentTimeline) {
        timeline.validate()
        assertThat(timeline.documentId()).isEqualTo(DOCUMENT_ID)
        assertThat(timeline.events()).hasSize(2)
        val created = timeline.events()[0]
        assertThat(created.eventType())
            .isEqualTo(DocumentTimeline.TimelineEvent.EventType.DOCUMENT_CREATED)
        assertThat(created.timestamp()).isEqualTo(OffsetDateTime.parse("2026-01-02T03:04:05Z"))
        assertThat(created.id()).contains("evt_1")
        assertThat(created.details()).isEmpty
        val sent = timeline.events()[1]
        assertThat(sent.eventType())
            .isEqualTo(DocumentTimeline.TimelineEvent.EventType.SEND_SUCCESS)
        assertThat(sent.details().get()._additionalProperties())
            .containsEntry("transport", JsonValue.from("peppol"))
    }

    private fun assertLifecycle(lifecycle: DocumentLifecycle) {
        lifecycle.validate()
        assertThat(lifecycle.documentId()).isEqualTo(DOCUMENT_ID)
        assertThat(lifecycle.events()).hasSize(2)
        val accepted = lifecycle.events()[0]
        assertThat(accepted.level()).isEqualTo(DocumentLifecycle.LifecycleEvent.Level.BUSINESS)
        assertThat(accepted.canonicalStatus())
            .contains(DocumentLifecycle.LifecycleEvent.CanonicalStatus.APPROVED)
        assertThat(accepted.nativeCode()).contains("AP")
        assertThat(accepted.source()).isEqualTo(DocumentLifecycle.LifecycleEvent.Source.PEPPOL_IMR)
        assertThat(accepted.direction()).isEqualTo(DocumentLifecycle.LifecycleEvent.Direction.IN)
        assertThat(accepted.occurredAt()).isEqualTo(OffsetDateTime.parse("2026-01-02T03:04:05Z"))
        val unmapped = lifecycle.events()[1]
        assertThat(unmapped.canonicalStatus()).isEmpty
        assertThat(unmapped.reasonCode()).contains("BV")
        assertThat(unmapped.reason()).contains("Missing buyer reference")
    }

    companion object {
        private const val DOCUMENT_ID = "doc_123"
        private const val TIMELINE_PATH = "/api/documents/doc_123/timeline"
        private const val LIFECYCLE_PATH = "/api/documents/doc_123/lifecycle"

        private val TIMELINE_JSON =
            """
            {
              "document_id": "doc_123",
              "events": [
                {
                  "event_type": "document_created",
                  "timestamp": "2026-01-02T03:04:05Z",
                  "id": "evt_1",
                  "details": null
                },
                {
                  "event_type": "send_success",
                  "timestamp": "2026-01-02T03:05:00Z",
                  "details": {"transport": "peppol"}
                }
              ]
            }
            """
                .trimIndent()

        private val LIFECYCLE_JSON =
            """
            {
              "document_id": "doc_123",
              "events": [
                {
                  "level": "business",
                  "canonical_status": "approved",
                  "native_code": "AP",
                  "source": "peppol:imr",
                  "direction": "in",
                  "reason_code": null,
                  "reason": null,
                  "occurred_at": "2026-01-02T03:04:05Z"
                },
                {
                  "level": "business",
                  "canonical_status": null,
                  "native_code": "XX",
                  "source": "peppol:imr",
                  "direction": "in",
                  "reason_code": "BV",
                  "reason": "Missing buyer reference",
                  "occurred_at": "2026-01-03T03:04:05Z"
                }
              ]
            }
            """
                .trimIndent()
    }
}
