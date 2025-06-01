// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.models.documents

import com.e_invoice.api.core.Enum
import com.e_invoice.api.core.JsonField
import com.e_invoice.api.errors.EInvoiceInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator

/** Unit of Measure Codes from UNECERec20 used in Peppol BIS Billing 3.0. */
class UnitOfMeasureCode @JsonCreator private constructor(private val value: JsonField<String>) :
    Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val _10 = of("10")

        @JvmField val _11 = of("11")

        @JvmField val _13 = of("13")

        @JvmField val _14 = of("14")

        @JvmField val _15 = of("15")

        @JvmField val _20 = of("20")

        @JvmField val _21 = of("21")

        @JvmField val _22 = of("22")

        @JvmField val _23 = of("23")

        @JvmField val _24 = of("24")

        @JvmField val _25 = of("25")

        @JvmField val _27 = of("27")

        @JvmField val _28 = of("28")

        @JvmField val _33 = of("33")

        @JvmField val _34 = of("34")

        @JvmField val _35 = of("35")

        @JvmField val _37 = of("37")

        @JvmField val _38 = of("38")

        @JvmField val _40 = of("40")

        @JvmField val _41 = of("41")

        @JvmField val _56 = of("56")

        @JvmField val _57 = of("57")

        @JvmField val _58 = of("58")

        @JvmField val _59 = of("59")

        @JvmField val _60 = of("60")

        @JvmField val _61 = of("61")

        @JvmField val _74 = of("74")

        @JvmField val _77 = of("77")

        @JvmField val _80 = of("80")

        @JvmField val _81 = of("81")

        @JvmField val _85 = of("85")

        @JvmField val _87 = of("87")

        @JvmField val _89 = of("89")

        @JvmField val _91 = of("91")

        @JvmField val _1_I = of("1I")

        @JvmField val EA = of("EA")

        @JvmField val E01 = of("E01")

        @JvmField val E07 = of("E07")

        @JvmField val E09 = of("E09")

        @JvmField val E10 = of("E10")

        @JvmField val E12 = of("E12")

        @JvmField val E14 = of("E14")

        @JvmField val E17 = of("E17")

        @JvmField val E20 = of("E20")

        @JvmField val E23 = of("E23")

        @JvmField val E25 = of("E25")

        @JvmField val E27 = of("E27")

        @JvmField val E31 = of("E31")

        @JvmField val E34 = of("E34")

        @JvmField val E35 = of("E35")

        @JvmField val E36 = of("E36")

        @JvmField val E37 = of("E37")

        @JvmField val E38 = of("E38")

        @JvmField val E39 = of("E39")

        @JvmField val E40 = of("E40")

        @JvmField val E41 = of("E41")

        @JvmField val E42 = of("E42")

        @JvmField val E43 = of("E43")

        @JvmField val E44 = of("E44")

        @JvmField val E45 = of("E45")

        @JvmField val E46 = of("E46")

        @JvmField val E47 = of("E47")

        @JvmField val E48 = of("E48")

        @JvmField val E49 = of("E49")

        @JvmField val E50 = of("E50")

        @JvmField val E51 = of("E51")

        @JvmField val E52 = of("E52")

        @JvmField val E53 = of("E53")

        @JvmField val E54 = of("E54")

        @JvmField val E55 = of("E55")

        @JvmField val E56 = of("E56")

        @JvmField val E57 = of("E57")

        @JvmField val E58 = of("E58")

        @JvmField val E60 = of("E60")

        @JvmField val E62 = of("E62")

        @JvmField val E65 = of("E65")

        @JvmField val E66 = of("E66")

        @JvmField val E67 = of("E67")

        @JvmField val E69 = of("E69")

        @JvmField val E70 = of("E70")

        @JvmField val E71 = of("E71")

        @JvmField val E73 = of("E73")

        @JvmField val E75 = of("E75")

        @JvmField val E76 = of("E76")

        @JvmField val _2_A = of("2A")

        @JvmField val _2_B = of("2B")

        @JvmField val _2_C = of("2C")

        @JvmField val ZZ = of("ZZ")

        @JvmField val NAR = of("NAR")

        @JvmField val C62 = of("C62")

        @JvmStatic fun of(value: String) = UnitOfMeasureCode(JsonField.of(value))
    }

    /** An enum containing [UnitOfMeasureCode]'s known values. */
    enum class Known {
        _10,
        _11,
        _13,
        _14,
        _15,
        _20,
        _21,
        _22,
        _23,
        _24,
        _25,
        _27,
        _28,
        _33,
        _34,
        _35,
        _37,
        _38,
        _40,
        _41,
        _56,
        _57,
        _58,
        _59,
        _60,
        _61,
        _74,
        _77,
        _80,
        _81,
        _85,
        _87,
        _89,
        _91,
        _1_I,
        EA,
        E01,
        E07,
        E09,
        E10,
        E12,
        E14,
        E17,
        E20,
        E23,
        E25,
        E27,
        E31,
        E34,
        E35,
        E36,
        E37,
        E38,
        E39,
        E40,
        E41,
        E42,
        E43,
        E44,
        E45,
        E46,
        E47,
        E48,
        E49,
        E50,
        E51,
        E52,
        E53,
        E54,
        E55,
        E56,
        E57,
        E58,
        E60,
        E62,
        E65,
        E66,
        E67,
        E69,
        E70,
        E71,
        E73,
        E75,
        E76,
        _2_A,
        _2_B,
        _2_C,
        ZZ,
        NAR,
        C62,
    }

    /**
     * An enum containing [UnitOfMeasureCode]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [UnitOfMeasureCode] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        _10,
        _11,
        _13,
        _14,
        _15,
        _20,
        _21,
        _22,
        _23,
        _24,
        _25,
        _27,
        _28,
        _33,
        _34,
        _35,
        _37,
        _38,
        _40,
        _41,
        _56,
        _57,
        _58,
        _59,
        _60,
        _61,
        _74,
        _77,
        _80,
        _81,
        _85,
        _87,
        _89,
        _91,
        _1_I,
        EA,
        E01,
        E07,
        E09,
        E10,
        E12,
        E14,
        E17,
        E20,
        E23,
        E25,
        E27,
        E31,
        E34,
        E35,
        E36,
        E37,
        E38,
        E39,
        E40,
        E41,
        E42,
        E43,
        E44,
        E45,
        E46,
        E47,
        E48,
        E49,
        E50,
        E51,
        E52,
        E53,
        E54,
        E55,
        E56,
        E57,
        E58,
        E60,
        E62,
        E65,
        E66,
        E67,
        E69,
        E70,
        E71,
        E73,
        E75,
        E76,
        _2_A,
        _2_B,
        _2_C,
        ZZ,
        NAR,
        C62,
        /**
         * An enum member indicating that [UnitOfMeasureCode] was instantiated with an unknown
         * value.
         */
        _UNKNOWN,
    }

    /**
     * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN] if
     * the class was instantiated with an unknown value.
     *
     * Use the [known] method instead if you're certain the value is always known or if you want to
     * throw for the unknown case.
     */
    fun value(): Value =
        when (this) {
            _10 -> Value._10
            _11 -> Value._11
            _13 -> Value._13
            _14 -> Value._14
            _15 -> Value._15
            _20 -> Value._20
            _21 -> Value._21
            _22 -> Value._22
            _23 -> Value._23
            _24 -> Value._24
            _25 -> Value._25
            _27 -> Value._27
            _28 -> Value._28
            _33 -> Value._33
            _34 -> Value._34
            _35 -> Value._35
            _37 -> Value._37
            _38 -> Value._38
            _40 -> Value._40
            _41 -> Value._41
            _56 -> Value._56
            _57 -> Value._57
            _58 -> Value._58
            _59 -> Value._59
            _60 -> Value._60
            _61 -> Value._61
            _74 -> Value._74
            _77 -> Value._77
            _80 -> Value._80
            _81 -> Value._81
            _85 -> Value._85
            _87 -> Value._87
            _89 -> Value._89
            _91 -> Value._91
            _1_I -> Value._1_I
            EA -> Value.EA
            E01 -> Value.E01
            E07 -> Value.E07
            E09 -> Value.E09
            E10 -> Value.E10
            E12 -> Value.E12
            E14 -> Value.E14
            E17 -> Value.E17
            E20 -> Value.E20
            E23 -> Value.E23
            E25 -> Value.E25
            E27 -> Value.E27
            E31 -> Value.E31
            E34 -> Value.E34
            E35 -> Value.E35
            E36 -> Value.E36
            E37 -> Value.E37
            E38 -> Value.E38
            E39 -> Value.E39
            E40 -> Value.E40
            E41 -> Value.E41
            E42 -> Value.E42
            E43 -> Value.E43
            E44 -> Value.E44
            E45 -> Value.E45
            E46 -> Value.E46
            E47 -> Value.E47
            E48 -> Value.E48
            E49 -> Value.E49
            E50 -> Value.E50
            E51 -> Value.E51
            E52 -> Value.E52
            E53 -> Value.E53
            E54 -> Value.E54
            E55 -> Value.E55
            E56 -> Value.E56
            E57 -> Value.E57
            E58 -> Value.E58
            E60 -> Value.E60
            E62 -> Value.E62
            E65 -> Value.E65
            E66 -> Value.E66
            E67 -> Value.E67
            E69 -> Value.E69
            E70 -> Value.E70
            E71 -> Value.E71
            E73 -> Value.E73
            E75 -> Value.E75
            E76 -> Value.E76
            _2_A -> Value._2_A
            _2_B -> Value._2_B
            _2_C -> Value._2_C
            ZZ -> Value.ZZ
            NAR -> Value.NAR
            C62 -> Value.C62
            else -> Value._UNKNOWN
        }

    /**
     * Returns an enum member corresponding to this class instance's value.
     *
     * Use the [value] method instead if you're uncertain the value is always known and don't want
     * to throw for the unknown case.
     *
     * @throws EInvoiceInvalidDataException if this class instance's value is a not a known member.
     */
    fun known(): Known =
        when (this) {
            _10 -> Known._10
            _11 -> Known._11
            _13 -> Known._13
            _14 -> Known._14
            _15 -> Known._15
            _20 -> Known._20
            _21 -> Known._21
            _22 -> Known._22
            _23 -> Known._23
            _24 -> Known._24
            _25 -> Known._25
            _27 -> Known._27
            _28 -> Known._28
            _33 -> Known._33
            _34 -> Known._34
            _35 -> Known._35
            _37 -> Known._37
            _38 -> Known._38
            _40 -> Known._40
            _41 -> Known._41
            _56 -> Known._56
            _57 -> Known._57
            _58 -> Known._58
            _59 -> Known._59
            _60 -> Known._60
            _61 -> Known._61
            _74 -> Known._74
            _77 -> Known._77
            _80 -> Known._80
            _81 -> Known._81
            _85 -> Known._85
            _87 -> Known._87
            _89 -> Known._89
            _91 -> Known._91
            _1_I -> Known._1_I
            EA -> Known.EA
            E01 -> Known.E01
            E07 -> Known.E07
            E09 -> Known.E09
            E10 -> Known.E10
            E12 -> Known.E12
            E14 -> Known.E14
            E17 -> Known.E17
            E20 -> Known.E20
            E23 -> Known.E23
            E25 -> Known.E25
            E27 -> Known.E27
            E31 -> Known.E31
            E34 -> Known.E34
            E35 -> Known.E35
            E36 -> Known.E36
            E37 -> Known.E37
            E38 -> Known.E38
            E39 -> Known.E39
            E40 -> Known.E40
            E41 -> Known.E41
            E42 -> Known.E42
            E43 -> Known.E43
            E44 -> Known.E44
            E45 -> Known.E45
            E46 -> Known.E46
            E47 -> Known.E47
            E48 -> Known.E48
            E49 -> Known.E49
            E50 -> Known.E50
            E51 -> Known.E51
            E52 -> Known.E52
            E53 -> Known.E53
            E54 -> Known.E54
            E55 -> Known.E55
            E56 -> Known.E56
            E57 -> Known.E57
            E58 -> Known.E58
            E60 -> Known.E60
            E62 -> Known.E62
            E65 -> Known.E65
            E66 -> Known.E66
            E67 -> Known.E67
            E69 -> Known.E69
            E70 -> Known.E70
            E71 -> Known.E71
            E73 -> Known.E73
            E75 -> Known.E75
            E76 -> Known.E76
            _2_A -> Known._2_A
            _2_B -> Known._2_B
            _2_C -> Known._2_C
            ZZ -> Known.ZZ
            NAR -> Known.NAR
            C62 -> Known.C62
            else -> throw EInvoiceInvalidDataException("Unknown UnitOfMeasureCode: $value")
        }

    /**
     * Returns this class instance's primitive wire representation.
     *
     * This differs from the [toString] method because that method is primarily for debugging and
     * generally doesn't throw.
     *
     * @throws EInvoiceInvalidDataException if this class instance's value does not have the
     *   expected primitive type.
     */
    fun asString(): String =
        _value().asString().orElseThrow { EInvoiceInvalidDataException("Value is not a String") }

    private var validated: Boolean = false

    fun validate(): UnitOfMeasureCode = apply {
        if (validated) {
            return@apply
        }

        known()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: EInvoiceInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is UnitOfMeasureCode && value == other.value /* spotless:on */
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
