package com.e_invoice.api.models.mailbox

import com.e_invoice.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaginatedInboundEmailResponseTest {

    private val item =
        InboundEmailResponse.builder()
            .id("id")
            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .messageId("message_id")
            .senderEmail("sender_email")
            .build()

    private fun full() =
        PaginatedInboundEmailResponse.builder()
            .hasNextPage(true)
            .addItem(item)
            .page(1L)
            .pageSize(1L)
            .pages(2L)
            .total(2L)
            .build()

    @Test
    fun create() {
        val response = full()

        assertThat(response.hasNextPage()).isEqualTo(true)
        assertThat(response.items()).containsExactly(item)
        assertThat(response.page()).isEqualTo(1L)
        assertThat(response.pageSize()).isEqualTo(1L)
        assertThat(response.pages()).isEqualTo(2L)
        assertThat(response.total()).isEqualTo(2L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val response = full()

        val roundtripped =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(response),
                jacksonTypeRef<PaginatedInboundEmailResponse>(),
            )

        assertThat(roundtripped).isEqualTo(response)
    }
}
