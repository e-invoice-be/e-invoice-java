// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.models.validate

import com.e_invoice.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UblDocumentValidationTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val ublDocumentValidation =
            UblDocumentValidation.builder()
                .id("id")
                .fileName("file_name")
                .isValid(true)
                .addIssue(
                    UblDocumentValidation.Issue.builder()
                        .message("message")
                        .schematron("schematron")
                        .type(UblDocumentValidation.Issue.Type.ERROR)
                        .flag("flag")
                        .location("location")
                        .ruleId("rule_id")
                        .test("test")
                        .build()
                )
                .ublDocument("ubl_document")
                .build()

        assertThat(ublDocumentValidation.id()).isEqualTo("id")
        assertThat(ublDocumentValidation.fileName()).contains("file_name")
        assertThat(ublDocumentValidation.isValid()).isEqualTo(true)
        assertThat(ublDocumentValidation.issues())
            .containsExactly(
                UblDocumentValidation.Issue.builder()
                    .message("message")
                    .schematron("schematron")
                    .type(UblDocumentValidation.Issue.Type.ERROR)
                    .flag("flag")
                    .location("location")
                    .ruleId("rule_id")
                    .test("test")
                    .build()
            )
        assertThat(ublDocumentValidation.ublDocument()).contains("ubl_document")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ublDocumentValidation =
            UblDocumentValidation.builder()
                .id("id")
                .fileName("file_name")
                .isValid(true)
                .addIssue(
                    UblDocumentValidation.Issue.builder()
                        .message("message")
                        .schematron("schematron")
                        .type(UblDocumentValidation.Issue.Type.ERROR)
                        .flag("flag")
                        .location("location")
                        .ruleId("rule_id")
                        .test("test")
                        .build()
                )
                .ublDocument("ubl_document")
                .build()

        val roundtrippedUblDocumentValidation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ublDocumentValidation),
                jacksonTypeRef<UblDocumentValidation>(),
            )

        assertThat(roundtrippedUblDocumentValidation).isEqualTo(ublDocumentValidation)
    }
}
