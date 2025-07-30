// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.models.lookup

import com.e_invoice.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LookupRetrieveParticipantsResponseTest {

    @Test
    fun create() {
        val lookupRetrieveParticipantsResponse =
            LookupRetrieveParticipantsResponse.builder()
                .queryTerms("query_terms")
                .searchDate("search_date")
                .totalCount(0L)
                .usedCount(0L)
                .addParticipant(
                    LookupRetrieveParticipantsResponse.Participant.builder()
                        .peppolId("peppol_id")
                        .peppolScheme("peppol_scheme")
                        .addDocumentType(
                            LookupRetrieveParticipantsResponse.Participant.DocumentType.builder()
                                .scheme("scheme")
                                .value("value")
                                .build()
                        )
                        .addEntity(
                            LookupRetrieveParticipantsResponse.Participant.Entity.builder()
                                .additionalInfo("additional_info")
                                .countryCode("country_code")
                                .geoInfo("geo_info")
                                .addIdentifier(
                                    LookupRetrieveParticipantsResponse.Participant.Entity.Identifier
                                        .builder()
                                        .scheme("scheme")
                                        .value("value")
                                        .build()
                                )
                                .name("name")
                                .registrationDate("registration_date")
                                .website("website")
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(lookupRetrieveParticipantsResponse.queryTerms()).isEqualTo("query_terms")
        assertThat(lookupRetrieveParticipantsResponse.searchDate()).isEqualTo("search_date")
        assertThat(lookupRetrieveParticipantsResponse.totalCount()).isEqualTo(0L)
        assertThat(lookupRetrieveParticipantsResponse.usedCount()).isEqualTo(0L)
        assertThat(lookupRetrieveParticipantsResponse.participants().getOrNull())
            .containsExactly(
                LookupRetrieveParticipantsResponse.Participant.builder()
                    .peppolId("peppol_id")
                    .peppolScheme("peppol_scheme")
                    .addDocumentType(
                        LookupRetrieveParticipantsResponse.Participant.DocumentType.builder()
                            .scheme("scheme")
                            .value("value")
                            .build()
                    )
                    .addEntity(
                        LookupRetrieveParticipantsResponse.Participant.Entity.builder()
                            .additionalInfo("additional_info")
                            .countryCode("country_code")
                            .geoInfo("geo_info")
                            .addIdentifier(
                                LookupRetrieveParticipantsResponse.Participant.Entity.Identifier
                                    .builder()
                                    .scheme("scheme")
                                    .value("value")
                                    .build()
                            )
                            .name("name")
                            .registrationDate("registration_date")
                            .website("website")
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val lookupRetrieveParticipantsResponse =
            LookupRetrieveParticipantsResponse.builder()
                .queryTerms("query_terms")
                .searchDate("search_date")
                .totalCount(0L)
                .usedCount(0L)
                .addParticipant(
                    LookupRetrieveParticipantsResponse.Participant.builder()
                        .peppolId("peppol_id")
                        .peppolScheme("peppol_scheme")
                        .addDocumentType(
                            LookupRetrieveParticipantsResponse.Participant.DocumentType.builder()
                                .scheme("scheme")
                                .value("value")
                                .build()
                        )
                        .addEntity(
                            LookupRetrieveParticipantsResponse.Participant.Entity.builder()
                                .additionalInfo("additional_info")
                                .countryCode("country_code")
                                .geoInfo("geo_info")
                                .addIdentifier(
                                    LookupRetrieveParticipantsResponse.Participant.Entity.Identifier
                                        .builder()
                                        .scheme("scheme")
                                        .value("value")
                                        .build()
                                )
                                .name("name")
                                .registrationDate("registration_date")
                                .website("website")
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedLookupRetrieveParticipantsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(lookupRetrieveParticipantsResponse),
                jacksonTypeRef<LookupRetrieveParticipantsResponse>(),
            )

        assertThat(roundtrippedLookupRetrieveParticipantsResponse)
            .isEqualTo(lookupRetrieveParticipantsResponse)
    }
}
