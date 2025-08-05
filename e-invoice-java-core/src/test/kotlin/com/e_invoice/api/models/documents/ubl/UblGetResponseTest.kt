// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.models.documents.ubl

import com.e_invoice.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UblGetResponseTest {

    @Test
    fun create() {
        val ublGetResponse =
            UblGetResponse.builder()
                .id("id")
                .fileName("file_name")
                .fileHash("file_hash")
                .fileSize(0L)
                .receiverPeppolId("receiver_peppol_id")
                .receiverPeppolScheme("receiver_peppol_scheme")
                .senderPeppolId("sender_peppol_id")
                .senderPeppolScheme("sender_peppol_scheme")
                .signedUrl("signed_url")
                .validatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(ublGetResponse.id()).isEqualTo("id")
        assertThat(ublGetResponse.fileName()).isEqualTo("file_name")
        assertThat(ublGetResponse.fileHash()).contains("file_hash")
        assertThat(ublGetResponse.fileSize()).contains(0L)
        assertThat(ublGetResponse.receiverPeppolId()).contains("receiver_peppol_id")
        assertThat(ublGetResponse.receiverPeppolScheme()).contains("receiver_peppol_scheme")
        assertThat(ublGetResponse.senderPeppolId()).contains("sender_peppol_id")
        assertThat(ublGetResponse.senderPeppolScheme()).contains("sender_peppol_scheme")
        assertThat(ublGetResponse.signedUrl()).contains("signed_url")
        assertThat(ublGetResponse.validatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ublGetResponse =
            UblGetResponse.builder()
                .id("id")
                .fileName("file_name")
                .fileHash("file_hash")
                .fileSize(0L)
                .receiverPeppolId("receiver_peppol_id")
                .receiverPeppolScheme("receiver_peppol_scheme")
                .senderPeppolId("sender_peppol_id")
                .senderPeppolScheme("sender_peppol_scheme")
                .signedUrl("signed_url")
                .validatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedUblGetResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ublGetResponse),
                jacksonTypeRef<UblGetResponse>(),
            )

        assertThat(roundtrippedUblGetResponse).isEqualTo(ublGetResponse)
    }
}
