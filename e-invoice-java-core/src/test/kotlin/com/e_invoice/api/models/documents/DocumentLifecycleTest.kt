package com.e_invoice.api.models.documents

import com.e_invoice.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.Test

internal class DocumentLifecycleTest {

    private fun event() =
        DocumentLifecycle.LifecycleEvent.builder()
            .level(DocumentLifecycle.LifecycleEvent.Level.TRANSPORT)
            .canonicalStatus(DocumentLifecycle.LifecycleEvent.CanonicalStatus.DEPOSITED)
            .nativeCode("native_code")
            .source(DocumentLifecycle.LifecycleEvent.Source.PEPPOL_MLR)
            .direction(DocumentLifecycle.LifecycleEvent.Direction.IN)
            .reasonCode("reason_code")
            .reason("reason")
            .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()

    @Test
    fun create() {
        val documentLifecycle =
            DocumentLifecycle.builder().documentId("document_id").addEvent(event()).build()

        assertThat(documentLifecycle.documentId()).isEqualTo("document_id")
        assertThat(documentLifecycle.events()).containsExactly(event())
        val e = documentLifecycle.events()[0]
        assertThat(e.level()).isEqualTo(DocumentLifecycle.LifecycleEvent.Level.TRANSPORT)
        assertThat(e.canonicalStatus())
            .contains(DocumentLifecycle.LifecycleEvent.CanonicalStatus.DEPOSITED)
        assertThat(e.nativeCode()).contains("native_code")
        assertThat(e.source()).isEqualTo(DocumentLifecycle.LifecycleEvent.Source.PEPPOL_MLR)
        assertThat(e.direction()).isEqualTo(DocumentLifecycle.LifecycleEvent.Direction.IN)
        assertThat(e.reasonCode()).contains("reason_code")
        assertThat(e.reason()).contains("reason")
        assertThat(e.occurredAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val documentLifecycle =
            DocumentLifecycle.builder().documentId("document_id").addEvent(event()).build()

        val roundtrippedDocumentLifecycle =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(documentLifecycle),
                jacksonTypeRef<DocumentLifecycle>(),
            )

        assertThat(roundtrippedDocumentLifecycle).isEqualTo(documentLifecycle)
    }

    @Test
    fun deserializeNullableRequiredFields() {
        val json =
            """
            {
              "document_id": "doc_123",
              "events": [
                {
                  "level": "business",
                  "canonical_status": null,
                  "native_code": "UQ",
                  "source": "fr:superpdp",
                  "direction": "out",
                  "reason_code": null,
                  "reason": null,
                  "occurred_at": "2026-01-02T03:04:05Z"
                }
              ]
            }
            """
                .trimIndent()

        val lifecycle = jsonMapper().readValue(json, jacksonTypeRef<DocumentLifecycle>())

        lifecycle.validate()
        val e = lifecycle.events()[0]
        assertThat(e.level()).isEqualTo(DocumentLifecycle.LifecycleEvent.Level.BUSINESS)
        assertThat(e.canonicalStatus()).isEmpty
        assertThat(e.nativeCode()).contains("UQ")
        assertThat(e.source()).isEqualTo(DocumentLifecycle.LifecycleEvent.Source.FR_SUPERPDP)
        assertThat(e.direction()).isEqualTo(DocumentLifecycle.LifecycleEvent.Direction.OUT)
        assertThat(e.reasonCode()).isEmpty
        assertThat(e.reason()).isEmpty
    }

    @Test
    fun buildRequiresNullableRequiredFields() {
        assertThatThrownBy {
                DocumentLifecycle.LifecycleEvent.builder()
                    .level(DocumentLifecycle.LifecycleEvent.Level.TRANSPORT)
                    .source(DocumentLifecycle.LifecycleEvent.Source.LOCAL)
                    .direction(DocumentLifecycle.LifecycleEvent.Direction.IN)
                    .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            }
            .isInstanceOf(IllegalStateException::class.java)
    }
}
