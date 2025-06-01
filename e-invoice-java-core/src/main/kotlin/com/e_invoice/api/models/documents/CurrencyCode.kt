// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.models.documents

import com.e_invoice.api.core.Enum
import com.e_invoice.api.core.JsonField
import com.e_invoice.api.errors.EInvoiceInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator

class CurrencyCode @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val EUR = of("EUR")

        @JvmField val USD = of("USD")

        @JvmField val GBP = of("GBP")

        @JvmField val JPY = of("JPY")

        @JvmField val CHF = of("CHF")

        @JvmField val CAD = of("CAD")

        @JvmField val AUD = of("AUD")

        @JvmField val NZD = of("NZD")

        @JvmField val CNY = of("CNY")

        @JvmField val INR = of("INR")

        @JvmField val SEK = of("SEK")

        @JvmField val NOK = of("NOK")

        @JvmField val DKK = of("DKK")

        @JvmField val SGD = of("SGD")

        @JvmField val HKD = of("HKD")

        @JvmStatic fun of(value: String) = CurrencyCode(JsonField.of(value))
    }

    /** An enum containing [CurrencyCode]'s known values. */
    enum class Known {
        EUR,
        USD,
        GBP,
        JPY,
        CHF,
        CAD,
        AUD,
        NZD,
        CNY,
        INR,
        SEK,
        NOK,
        DKK,
        SGD,
        HKD,
    }

    /**
     * An enum containing [CurrencyCode]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [CurrencyCode] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        EUR,
        USD,
        GBP,
        JPY,
        CHF,
        CAD,
        AUD,
        NZD,
        CNY,
        INR,
        SEK,
        NOK,
        DKK,
        SGD,
        HKD,
        /** An enum member indicating that [CurrencyCode] was instantiated with an unknown value. */
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
            EUR -> Value.EUR
            USD -> Value.USD
            GBP -> Value.GBP
            JPY -> Value.JPY
            CHF -> Value.CHF
            CAD -> Value.CAD
            AUD -> Value.AUD
            NZD -> Value.NZD
            CNY -> Value.CNY
            INR -> Value.INR
            SEK -> Value.SEK
            NOK -> Value.NOK
            DKK -> Value.DKK
            SGD -> Value.SGD
            HKD -> Value.HKD
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
            EUR -> Known.EUR
            USD -> Known.USD
            GBP -> Known.GBP
            JPY -> Known.JPY
            CHF -> Known.CHF
            CAD -> Known.CAD
            AUD -> Known.AUD
            NZD -> Known.NZD
            CNY -> Known.CNY
            INR -> Known.INR
            SEK -> Known.SEK
            NOK -> Known.NOK
            DKK -> Known.DKK
            SGD -> Known.SGD
            HKD -> Known.HKD
            else -> throw EInvoiceInvalidDataException("Unknown CurrencyCode: $value")
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

    fun validate(): CurrencyCode = apply {
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

        return /* spotless:off */ other is CurrencyCode && value == other.value /* spotless:on */
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
