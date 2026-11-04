package com.e_invoice.api.models.documents

import com.e_invoice.api.core.JsonValue
import com.e_invoice.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DocumentTimelineTest {

    @Test
    fun create() {
        val documentTimeline =
            DocumentTimeline.builder()
                .documentId("document_id")
                .addEvent(
                    DocumentTimeline.TimelineEvent.builder()
                        .eventType(DocumentTimeline.TimelineEvent.EventType.EMAIL_RECEIVED)
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .id("id")
                        .details(
                            DocumentTimeline.TimelineEvent.Details.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(documentTimeline.documentId()).isEqualTo("document_id")
        assertThat(documentTimeline.events())
            .containsExactly(
                DocumentTimeline.TimelineEvent.builder()
                    .eventType(DocumentTimeline.TimelineEvent.EventType.EMAIL_RECEIVED)
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .id("id")
                    .details(
                        DocumentTimeline.TimelineEvent.Details.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val documentTimeline =
            DocumentTimeline.builder()
                .documentId("document_id")
                .addEvent(
                    DocumentTimeline.TimelineEvent.builder()
                        .eventType(DocumentTimeline.TimelineEvent.EventType.EMAIL_RECEIVED)
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .id("id")
                        .details(
                            DocumentTimeline.TimelineEvent.Details.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedDocumentTimeline =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(documentTimeline),
                jacksonTypeRef<DocumentTimeline>(),
            )

        assertThat(roundtrippedDocumentTimeline).isEqualTo(documentTimeline)
    }

    @Test
    fun deserializeFromApiJson() {
        val json =
            """
            {
              "document_id": "doc_123",
              "events": [
                {
                  "event_type": "send_success",
                  "timestamp": "2026-01-02T03:04:05Z",
                  "id": null,
                  "details": {"transport": "peppol", "attempt": 1}
                },
                {"event_type": "some_future_event", "timestamp": "2026-01-02T03:04:06Z"}
              ]
            }
            """
                .trimIndent()

        val timeline = jsonMapper().readValue(json, jacksonTypeRef<DocumentTimeline>())

        assertThat(timeline.documentId()).isEqualTo("doc_123")
        val first = timeline.events()[0]
        assertThat(first.eventType())
            .isEqualTo(DocumentTimeline.TimelineEvent.EventType.SEND_SUCCESS)
        assertThat(first.id()).isEmpty
        assertThat(first.details().get()._additionalProperties())
            .containsEntry("transport", JsonValue.from("peppol"))
            .containsEntry("attempt", JsonValue.from(1))
        first.validate()
        val second = timeline.events()[1]
        assertThat(second.eventType().value())
            .isEqualTo(DocumentTimeline.TimelineEvent.EventType.Value._UNKNOWN)
        assertThat(second.details()).isEmpty
        assertThat(timeline.isValid()).isFalse()
    }
}
