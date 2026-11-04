package com.e_invoice.api.models.mailbox

import com.e_invoice.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InboundEmailResponseTest {

    private fun full() =
        InboundEmailResponse.builder()
            .id("id")
            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .messageId("message_id")
            .senderEmail("sender_email")
            .attachmentCount(1L)
            .addAttachment(
                InboundEmailResponse.AttachmentInfo.builder()
                    .filename("invoice.pdf")
                    .contentType("application/pdf")
                    .size(1L)
                    .build()
            )
            .bccAddresses("bcc_addresses")
            .ccAddresses("cc_addresses")
            .documentId("document_id")
            .errorMessage("error_message")
            .processed(true)
            .processedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .receivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .senderName("sender_name")
            .subject("subject")
            .toAddresses("to_addresses")
            .build()

    @Test
    fun create() {
        val inboundEmailResponse = full()

        assertThat(inboundEmailResponse.id()).isEqualTo("id")
        assertThat(inboundEmailResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(inboundEmailResponse.messageId()).isEqualTo("message_id")
        assertThat(inboundEmailResponse.senderEmail()).isEqualTo("sender_email")
        assertThat(inboundEmailResponse.attachmentCount()).contains(1L)
        assertThat(inboundEmailResponse.attachments().getOrNull())
            .containsExactly(
                InboundEmailResponse.AttachmentInfo.builder()
                    .filename("invoice.pdf")
                    .contentType("application/pdf")
                    .size(1L)
                    .build()
            )
        assertThat(inboundEmailResponse.bccAddresses()).contains("bcc_addresses")
        assertThat(inboundEmailResponse.ccAddresses()).contains("cc_addresses")
        assertThat(inboundEmailResponse.documentId()).contains("document_id")
        assertThat(inboundEmailResponse.errorMessage()).contains("error_message")
        assertThat(inboundEmailResponse.processed()).contains(true)
        assertThat(inboundEmailResponse.processedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(inboundEmailResponse.receivedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(inboundEmailResponse.senderName()).contains("sender_name")
        assertThat(inboundEmailResponse.subject()).contains("subject")
        assertThat(inboundEmailResponse.toAddresses()).contains("to_addresses")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val inboundEmailResponse = full()

        val roundtrippedInboundEmailResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(inboundEmailResponse),
                jacksonTypeRef<InboundEmailResponse>(),
            )

        assertThat(roundtrippedInboundEmailResponse).isEqualTo(inboundEmailResponse)
    }

    @Test
    fun parsesNullsAndMissingOptionalFields() {
        val jsonMapper = jsonMapper()

        val inboundEmailResponse =
            jsonMapper.readValue(
                """
                {
                  "id": "id",
                  "message_id": "message_id",
                  "sender_email": "sender_email",
                  "created_at": "2019-12-27T18:11:19.117Z",
                  "subject": null,
                  "received_at": null
                }
                """
                    .trimIndent(),
                jacksonTypeRef<InboundEmailResponse>(),
            )

        assertThat(inboundEmailResponse.validate()).isSameAs(inboundEmailResponse)
        assertThat(inboundEmailResponse.subject()).isEmpty
        assertThat(inboundEmailResponse.receivedAt()).isEmpty
        assertThat(inboundEmailResponse.attachments()).isEmpty
    }
}
