package com.e_invoice.api.models.documents

import com.e_invoice.api.core.JsonValue
import com.e_invoice.api.core.jsonMapper
import com.e_invoice.api.errors.EInvoiceInvalidDataException
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.Test

internal class UnitOfMeasureCodeTest {

    @Test
    fun allKnownMembersMapToTheirWireValue() {
        assertThat(UnitOfMeasureCode.Known.values()).hasSize(2380)
        UnitOfMeasureCode.Known.values().forEach { known ->
            val code = UnitOfMeasureCode.of(known.name.replace("_", ""))
            assertThat(code.known()).isEqualTo(known)
            assertThat(code.value().name).isEqualTo(known.name)
            assertThat(code.isValid()).isTrue()
        }
    }

    @Test
    fun constantsResolve() {
        assertThat(UnitOfMeasureCode._10.known()).isEqualTo(UnitOfMeasureCode.Known._10)
        assertThat(UnitOfMeasureCode._1_I.asString()).isEqualTo("1I")
        assertThat(UnitOfMeasureCode.H87.value()).isEqualTo(UnitOfMeasureCode.Value.H87)
        assertThat(UnitOfMeasureCode.KGS.known()).isEqualTo(UnitOfMeasureCode.Known.KGS)
        assertThat(UnitOfMeasureCode.XT1.value()).isEqualTo(UnitOfMeasureCode.Value.XT1)
    }

    @Test
    fun unknownValue() {
        val code = UnitOfMeasureCode.of("NOT_A_CODE")
        assertThat(code.value()).isEqualTo(UnitOfMeasureCode.Value._UNKNOWN)
        assertThat(code.isValid()).isFalse()
        assertThatThrownBy { code.known() }.isInstanceOf(EInvoiceInvalidDataException::class.java)
    }

    @Test
    fun deserializesFromJson() {
        val jsonMapper = jsonMapper()
        val code =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(JsonValue.from("MTQ")),
                jacksonTypeRef<UnitOfMeasureCode>(),
            )
        assertThat(code).isEqualTo(UnitOfMeasureCode.MTQ)
        assertThat(code.known()).isEqualTo(UnitOfMeasureCode.Known.MTQ)
    }
}
