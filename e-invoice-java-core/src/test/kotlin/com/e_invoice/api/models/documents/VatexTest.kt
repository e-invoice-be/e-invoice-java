package com.e_invoice.api.models.documents

import com.e_invoice.api.core.jsonMapper
import com.e_invoice.api.errors.EInvoiceInvalidDataException
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.Test

/**
 * The three `Vatex` copies must each know every value of the spec's `VATExemptionCode` enum, in
 * spec order.
 */
internal class VatexTest {

    private companion object {

        /** `components.schemas.VATExemptionCode.enum` from the OpenAPI spec, in spec order. */
        val WIRE_VALUES =
            listOf(
                "VATEX-EU-79-C",
                "VATEX-EU-132",
                "VATEX-EU-132-1A",
                "VATEX-EU-132-1B",
                "VATEX-EU-132-1C",
                "VATEX-EU-132-1D",
                "VATEX-EU-132-1E",
                "VATEX-EU-132-1F",
                "VATEX-EU-132-1G",
                "VATEX-EU-132-1H",
                "VATEX-EU-132-1I",
                "VATEX-EU-132-1J",
                "VATEX-EU-132-1K",
                "VATEX-EU-132-1L",
                "VATEX-EU-132-1M",
                "VATEX-EU-132-1N",
                "VATEX-EU-132-1O",
                "VATEX-EU-132-1P",
                "VATEX-EU-132-1Q",
                "VATEX-EU-135-1",
                "VATEX-EU-143",
                "VATEX-EU-143-1A",
                "VATEX-EU-143-1B",
                "VATEX-EU-143-1C",
                "VATEX-EU-143-1D",
                "VATEX-EU-143-1E",
                "VATEX-EU-143-1F",
                "VATEX-EU-143-1FA",
                "VATEX-EU-143-1G",
                "VATEX-EU-143-1H",
                "VATEX-EU-143-1I",
                "VATEX-EU-143-1J",
                "VATEX-EU-143-1K",
                "VATEX-EU-143-1L",
                "VATEX-EU-144",
                "VATEX-EU-146-1E",
                "VATEX-EU-148",
                "VATEX-EU-148-A",
                "VATEX-EU-148-B",
                "VATEX-EU-148-C",
                "VATEX-EU-148-D",
                "VATEX-EU-148-E",
                "VATEX-EU-148-F",
                "VATEX-EU-148-G",
                "VATEX-EU-151",
                "VATEX-EU-151-1A",
                "VATEX-EU-151-1AA",
                "VATEX-EU-151-1B",
                "VATEX-EU-151-1C",
                "VATEX-EU-151-1D",
                "VATEX-EU-151-1E",
                "VATEX-EU-153",
                "VATEX-EU-159",
                "VATEX-EU-309",
                "VATEX-EU-AE",
                "VATEX-EU-D",
                "VATEX-EU-F",
                "VATEX-EU-G",
                "VATEX-EU-I",
                "VATEX-EU-IC",
                "VATEX-EU-O",
                "VATEX-EU-J",
                "VATEX-FR-298SEXDECIESA",
                "VATEX-FR-AE",
                "VATEX-FR-CGI261-1",
                "VATEX-FR-CGI261-2",
                "VATEX-FR-CGI261-3",
                "VATEX-FR-CGI261-4",
                "VATEX-FR-CGI261-5",
                "VATEX-FR-CGI261-7",
                "VATEX-FR-CGI261-8",
                "VATEX-FR-CGI261A",
                "VATEX-FR-CGI261B",
                "VATEX-FR-CGI261C-1",
                "VATEX-FR-CGI261C-2",
                "VATEX-FR-CGI261C-3",
                "VATEX-FR-CGI261D-1",
                "VATEX-FR-CGI261D-1BIS",
                "VATEX-FR-CGI261D-2",
                "VATEX-FR-CGI261D-3",
                "VATEX-FR-CGI261D-4",
                "VATEX-FR-CGI261E-1",
                "VATEX-FR-CGI261E-2",
                "VATEX-FR-CGI275",
                "VATEX-FR-CGI277A",
                "VATEX-FR-CGI295",
                "VATEX-FR-FRANCHISE",
                "VATEX-FR-CNWVAT",
            )

        /** The values that were missing from the SDK before the spec sync. */
        val NEW_WIRE_VALUES =
            WIRE_VALUES.filter {
                it == "VATEX-EU-135-1" ||
                    it == "VATEX-EU-153" ||
                    (it.startsWith("VATEX-FR-") &&
                        it != "VATEX-FR-FRANCHISE" &&
                        it != "VATEX-FR-CNWVAT")
            }
    }

    @Test
    fun newWireValuesAreListed() {
        assertThat(WIRE_VALUES).hasSize(88).doesNotHaveDuplicates()
        assertThat(NEW_WIRE_VALUES)
            .hasSize(26)
            .contains(
                "VATEX-EU-135-1",
                "VATEX-EU-153",
                "VATEX-FR-298SEXDECIESA",
                "VATEX-FR-CGI261D-1BIS",
                "VATEX-FR-CGI295",
            )
    }

    @Test
    fun documentCreateVatexKnowsAllSpecValuesInOrder() {
        assertThat(WIRE_VALUES.map { DocumentCreate.Vatex.of(it).known() })
            .containsExactly(*DocumentCreate.Vatex.Known.values())
        assertThat(WIRE_VALUES.map { DocumentCreate.Vatex.of(it).value().name })
            .containsExactlyElementsOf(DocumentCreate.Vatex.Known.values().map { it.name })
        assertThat(DocumentCreate.Vatex.Value.values().map { it.name })
            .containsExactlyElementsOf(
                DocumentCreate.Vatex.Known.values().map { it.name } + "_UNKNOWN"
            )
        NEW_WIRE_VALUES.forEach { wireValue ->
            val vatex = DocumentCreate.Vatex.of(wireValue)
            assertThat(vatex.value()).isNotEqualTo(DocumentCreate.Vatex.Value._UNKNOWN)
            assertThat(vatex.known().name).isEqualTo(vatex.value().name)
            assertThat(vatex.isValid()).isTrue()
            assertThat(vatex.asString()).isEqualTo(wireValue)
        }
    }

    @Test
    fun documentResponseVatexKnowsAllSpecValuesInOrder() {
        assertThat(WIRE_VALUES.map { DocumentResponse.Vatex.of(it).known() })
            .containsExactly(*DocumentResponse.Vatex.Known.values())
        assertThat(WIRE_VALUES.map { DocumentResponse.Vatex.of(it).value().name })
            .containsExactlyElementsOf(DocumentResponse.Vatex.Known.values().map { it.name })
        assertThat(DocumentResponse.Vatex.Value.values().map { it.name })
            .containsExactlyElementsOf(
                DocumentResponse.Vatex.Known.values().map { it.name } + "_UNKNOWN"
            )
        NEW_WIRE_VALUES.forEach { wireValue ->
            val vatex = DocumentResponse.Vatex.of(wireValue)
            assertThat(vatex.value()).isNotEqualTo(DocumentResponse.Vatex.Value._UNKNOWN)
            assertThat(vatex.known().name).isEqualTo(vatex.value().name)
            assertThat(vatex.isValid()).isTrue()
            assertThat(vatex.asString()).isEqualTo(wireValue)
        }
    }

    @Test
    fun documentCreateFromPdfResponseVatexKnowsAllSpecValuesInOrder() {
        assertThat(WIRE_VALUES.map { DocumentCreateFromPdfResponse.Vatex.of(it).known() })
            .containsExactly(*DocumentCreateFromPdfResponse.Vatex.Known.values())
        assertThat(WIRE_VALUES.map { DocumentCreateFromPdfResponse.Vatex.of(it).value().name })
            .containsExactlyElementsOf(
                DocumentCreateFromPdfResponse.Vatex.Known.values().map { it.name }
            )
        assertThat(DocumentCreateFromPdfResponse.Vatex.Value.values().map { it.name })
            .containsExactlyElementsOf(
                DocumentCreateFromPdfResponse.Vatex.Known.values().map { it.name } + "_UNKNOWN"
            )
        NEW_WIRE_VALUES.forEach { wireValue ->
            val vatex = DocumentCreateFromPdfResponse.Vatex.of(wireValue)
            assertThat(vatex.value())
                .isNotEqualTo(DocumentCreateFromPdfResponse.Vatex.Value._UNKNOWN)
            assertThat(vatex.known().name).isEqualTo(vatex.value().name)
            assertThat(vatex.isValid()).isTrue()
            assertThat(vatex.asString()).isEqualTo(wireValue)
        }
    }

    @Test
    fun newConstantsResolve() {
        assertThat(DocumentCreate.Vatex.VATEX_EU_135_1.asString()).isEqualTo("VATEX-EU-135-1")
        assertThat(DocumentCreate.Vatex.VATEX_EU_153.known())
            .isEqualTo(DocumentCreate.Vatex.Known.VATEX_EU_153)
        assertThat(DocumentResponse.Vatex.VATEX_FR_298_SEXDECIESA.asString())
            .isEqualTo("VATEX-FR-298SEXDECIESA")
        assertThat(DocumentResponse.Vatex.VATEX_FR_CGI261_D_1_BIS.value())
            .isEqualTo(DocumentResponse.Vatex.Value.VATEX_FR_CGI261_D_1_BIS)
        assertThat(DocumentCreateFromPdfResponse.Vatex.VATEX_FR_CGI295.asString())
            .isEqualTo("VATEX-FR-CGI295")
        assertThat(DocumentCreateFromPdfResponse.Vatex.VATEX_FR_AE.known())
            .isEqualTo(DocumentCreateFromPdfResponse.Vatex.Known.VATEX_FR_AE)
    }

    @Test
    fun unknownValue() {
        val create = DocumentCreate.Vatex.of("VATEX-NOT-A-CODE")
        assertThat(create.value()).isEqualTo(DocumentCreate.Vatex.Value._UNKNOWN)
        assertThat(create.isValid()).isFalse()
        assertThatThrownBy { create.known() }.isInstanceOf(EInvoiceInvalidDataException::class.java)

        val response = DocumentResponse.Vatex.of("VATEX-NOT-A-CODE")
        assertThat(response.value()).isEqualTo(DocumentResponse.Vatex.Value._UNKNOWN)
        assertThat(response.isValid()).isFalse()
        assertThatThrownBy { response.known() }
            .isInstanceOf(EInvoiceInvalidDataException::class.java)

        val fromPdf = DocumentCreateFromPdfResponse.Vatex.of("VATEX-NOT-A-CODE")
        assertThat(fromPdf.value()).isEqualTo(DocumentCreateFromPdfResponse.Vatex.Value._UNKNOWN)
        assertThat(fromPdf.isValid()).isFalse()
        assertThatThrownBy { fromPdf.known() }
            .isInstanceOf(EInvoiceInvalidDataException::class.java)
    }

    @Test
    fun documentCreateRoundtripsNewValue() {
        val jsonMapper = jsonMapper()
        val documentCreate =
            DocumentCreate.builder().vatex(DocumentCreate.Vatex.VATEX_FR_CGI261_D_1_BIS).build()

        val json = jsonMapper.writeValueAsString(documentCreate)
        assertThat(jsonMapper.readTree(json).get("vatex").asText())
            .isEqualTo("VATEX-FR-CGI261D-1BIS")

        val roundtripped = jsonMapper.readValue(json, jacksonTypeRef<DocumentCreate>())
        assertThat(roundtripped).isEqualTo(documentCreate)
        assertThat(roundtripped.vatex()).contains(DocumentCreate.Vatex.VATEX_FR_CGI261_D_1_BIS)
    }

    @Test
    fun documentResponseRoundtripsNewValue() {
        val jsonMapper = jsonMapper()
        val documentResponse =
            DocumentResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .vatex(DocumentResponse.Vatex.VATEX_EU_135_1)
                .build()

        val json = jsonMapper.writeValueAsString(documentResponse)
        assertThat(jsonMapper.readTree(json).get("vatex").asText()).isEqualTo("VATEX-EU-135-1")

        val roundtripped = jsonMapper.readValue(json, jacksonTypeRef<DocumentResponse>())
        assertThat(roundtripped).isEqualTo(documentResponse)
        assertThat(roundtripped.vatex().get().known())
            .isEqualTo(DocumentResponse.Vatex.Known.VATEX_EU_135_1)
    }

    @Test
    fun documentCreateFromPdfResponseParsesNewValue() {
        val response =
            jsonMapper()
                .readValue(
                    """{"vatex":"VATEX-FR-298SEXDECIESA"}""",
                    jacksonTypeRef<DocumentCreateFromPdfResponse>(),
                )

        assertThat(response.vatex())
            .contains(DocumentCreateFromPdfResponse.Vatex.VATEX_FR_298_SEXDECIESA)
        assertThat(response.vatex().get().value())
            .isEqualTo(DocumentCreateFromPdfResponse.Vatex.Value.VATEX_FR_298_SEXDECIESA)
    }
}
