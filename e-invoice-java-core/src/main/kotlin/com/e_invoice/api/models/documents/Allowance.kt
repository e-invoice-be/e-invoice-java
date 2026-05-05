// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.models.documents

import com.e_invoice.api.core.Enum
import com.e_invoice.api.core.ExcludeMissing
import com.e_invoice.api.core.JsonField
import com.e_invoice.api.core.JsonMissing
import com.e_invoice.api.core.JsonValue
import com.e_invoice.api.errors.EInvoiceInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** An allowance is a discount for example for early payment, volume discount, etc. */
class Allowance
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val amount: JsonField<String>,
    private val baseAmount: JsonField<String>,
    private val multiplierFactor: JsonField<String>,
    private val reason: JsonField<String>,
    private val reasonCode: JsonField<ReasonCode>,
    private val taxCode: JsonField<TaxCode>,
    private val taxRate: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("amount") @ExcludeMissing amount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("base_amount")
        @ExcludeMissing
        baseAmount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("multiplier_factor")
        @ExcludeMissing
        multiplierFactor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reason") @ExcludeMissing reason: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reason_code")
        @ExcludeMissing
        reasonCode: JsonField<ReasonCode> = JsonMissing.of(),
        @JsonProperty("tax_code") @ExcludeMissing taxCode: JsonField<TaxCode> = JsonMissing.of(),
        @JsonProperty("tax_rate") @ExcludeMissing taxRate: JsonField<String> = JsonMissing.of(),
    ) : this(
        amount,
        baseAmount,
        multiplierFactor,
        reason,
        reasonCode,
        taxCode,
        taxRate,
        mutableMapOf(),
    )

    /**
     * The allowance amount, without VAT. Must be rounded to maximum 2 decimals
     *
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun amount(): Optional<String> = amount.getOptional("amount")

    /**
     * The base amount that may be used, in conjunction with the allowance percentage, to calculate
     * the allowance amount. Must be rounded to maximum 2 decimals
     *
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun baseAmount(): Optional<String> = baseAmount.getOptional("base_amount")

    /**
     * The percentage that may be used, in conjunction with the allowance base amount, to calculate
     * the allowance amount. To state 20%, use value 20. Must be rounded to maximum 2 decimals
     *
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun multiplierFactor(): Optional<String> = multiplierFactor.getOptional("multiplier_factor")

    /**
     * The reason for the allowance
     *
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun reason(): Optional<String> = reason.getOptional("reason")

    /**
     * Allowance reason codes for invoice discounts and charges
     *
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun reasonCode(): Optional<ReasonCode> = reasonCode.getOptional("reason_code")

    /**
     * The VAT category code that applies to the allowance
     *
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun taxCode(): Optional<TaxCode> = taxCode.getOptional("tax_code")

    /**
     * The VAT rate, represented as percentage that applies to the allowance. Must be rounded to
     * maximum 2 decimals
     *
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun taxRate(): Optional<String> = taxRate.getOptional("tax_rate")

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

    /**
     * Returns the raw JSON value of [baseAmount].
     *
     * Unlike [baseAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("base_amount") @ExcludeMissing fun _baseAmount(): JsonField<String> = baseAmount

    /**
     * Returns the raw JSON value of [multiplierFactor].
     *
     * Unlike [multiplierFactor], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("multiplier_factor")
    @ExcludeMissing
    fun _multiplierFactor(): JsonField<String> = multiplierFactor

    /**
     * Returns the raw JSON value of [reason].
     *
     * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

    /**
     * Returns the raw JSON value of [reasonCode].
     *
     * Unlike [reasonCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reason_code")
    @ExcludeMissing
    fun _reasonCode(): JsonField<ReasonCode> = reasonCode

    /**
     * Returns the raw JSON value of [taxCode].
     *
     * Unlike [taxCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tax_code") @ExcludeMissing fun _taxCode(): JsonField<TaxCode> = taxCode

    /**
     * Returns the raw JSON value of [taxRate].
     *
     * Unlike [taxRate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tax_rate") @ExcludeMissing fun _taxRate(): JsonField<String> = taxRate

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /** Returns a mutable builder for constructing an instance of [Allowance]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Allowance]. */
    class Builder internal constructor() {

        private var amount: JsonField<String> = JsonMissing.of()
        private var baseAmount: JsonField<String> = JsonMissing.of()
        private var multiplierFactor: JsonField<String> = JsonMissing.of()
        private var reason: JsonField<String> = JsonMissing.of()
        private var reasonCode: JsonField<ReasonCode> = JsonMissing.of()
        private var taxCode: JsonField<TaxCode> = JsonMissing.of()
        private var taxRate: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(allowance: Allowance) = apply {
            amount = allowance.amount
            baseAmount = allowance.baseAmount
            multiplierFactor = allowance.multiplierFactor
            reason = allowance.reason
            reasonCode = allowance.reasonCode
            taxCode = allowance.taxCode
            taxRate = allowance.taxRate
            additionalProperties = allowance.additionalProperties.toMutableMap()
        }

        /** The allowance amount, without VAT. Must be rounded to maximum 2 decimals */
        fun amount(amount: String?) = amount(JsonField.ofNullable(amount))

        /** Alias for calling [Builder.amount] with `amount.orElse(null)`. */
        fun amount(amount: Optional<String>) = amount(amount.getOrNull())

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<String>) = apply { this.amount = amount }

        /**
         * The base amount that may be used, in conjunction with the allowance percentage, to
         * calculate the allowance amount. Must be rounded to maximum 2 decimals
         */
        fun baseAmount(baseAmount: String?) = baseAmount(JsonField.ofNullable(baseAmount))

        /** Alias for calling [Builder.baseAmount] with `baseAmount.orElse(null)`. */
        fun baseAmount(baseAmount: Optional<String>) = baseAmount(baseAmount.getOrNull())

        /**
         * Sets [Builder.baseAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.baseAmount] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun baseAmount(baseAmount: JsonField<String>) = apply { this.baseAmount = baseAmount }

        /**
         * The percentage that may be used, in conjunction with the allowance base amount, to
         * calculate the allowance amount. To state 20%, use value 20. Must be rounded to maximum 2
         * decimals
         */
        fun multiplierFactor(multiplierFactor: String?) =
            multiplierFactor(JsonField.ofNullable(multiplierFactor))

        /** Alias for calling [Builder.multiplierFactor] with `multiplierFactor.orElse(null)`. */
        fun multiplierFactor(multiplierFactor: Optional<String>) =
            multiplierFactor(multiplierFactor.getOrNull())

        /**
         * Sets [Builder.multiplierFactor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.multiplierFactor] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun multiplierFactor(multiplierFactor: JsonField<String>) = apply {
            this.multiplierFactor = multiplierFactor
        }

        /** The reason for the allowance */
        fun reason(reason: String?) = reason(JsonField.ofNullable(reason))

        /** Alias for calling [Builder.reason] with `reason.orElse(null)`. */
        fun reason(reason: Optional<String>) = reason(reason.getOrNull())

        /**
         * Sets [Builder.reason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reason] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun reason(reason: JsonField<String>) = apply { this.reason = reason }

        /** Allowance reason codes for invoice discounts and charges */
        fun reasonCode(reasonCode: ReasonCode?) = reasonCode(JsonField.ofNullable(reasonCode))

        /** Alias for calling [Builder.reasonCode] with `reasonCode.orElse(null)`. */
        fun reasonCode(reasonCode: Optional<ReasonCode>) = reasonCode(reasonCode.getOrNull())

        /**
         * Sets [Builder.reasonCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reasonCode] with a well-typed [ReasonCode] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun reasonCode(reasonCode: JsonField<ReasonCode>) = apply { this.reasonCode = reasonCode }

        /** The VAT category code that applies to the allowance */
        fun taxCode(taxCode: TaxCode) = taxCode(JsonField.of(taxCode))

        /**
         * Sets [Builder.taxCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.taxCode] with a well-typed [TaxCode] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun taxCode(taxCode: JsonField<TaxCode>) = apply { this.taxCode = taxCode }

        /**
         * The VAT rate, represented as percentage that applies to the allowance. Must be rounded to
         * maximum 2 decimals
         */
        fun taxRate(taxRate: String?) = taxRate(JsonField.ofNullable(taxRate))

        /** Alias for calling [Builder.taxRate] with `taxRate.orElse(null)`. */
        fun taxRate(taxRate: Optional<String>) = taxRate(taxRate.getOrNull())

        /**
         * Sets [Builder.taxRate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.taxRate] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun taxRate(taxRate: JsonField<String>) = apply { this.taxRate = taxRate }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [Allowance].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): Allowance =
            Allowance(
                amount,
                baseAmount,
                multiplierFactor,
                reason,
                reasonCode,
                taxCode,
                taxRate,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws EInvoiceInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): Allowance = apply {
        if (validated) {
            return@apply
        }

        amount()
        baseAmount()
        multiplierFactor()
        reason()
        reasonCode().ifPresent { it.validate() }
        taxCode().ifPresent { it.validate() }
        taxRate()
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
    @JvmSynthetic
    internal fun validity(): Int =
        (if (amount.asKnown().isPresent) 1 else 0) +
            (if (baseAmount.asKnown().isPresent) 1 else 0) +
            (if (multiplierFactor.asKnown().isPresent) 1 else 0) +
            (if (reason.asKnown().isPresent) 1 else 0) +
            (reasonCode.asKnown().getOrNull()?.validity() ?: 0) +
            (taxCode.asKnown().getOrNull()?.validity() ?: 0) +
            (if (taxRate.asKnown().isPresent) 1 else 0)

    /** Allowance reason codes for invoice discounts and charges */
    class ReasonCode @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val _41 = of("41")

            @JvmField val _42 = of("42")

            @JvmField val _60 = of("60")

            @JvmField val _62 = of("62")

            @JvmField val _63 = of("63")

            @JvmField val _64 = of("64")

            @JvmField val _65 = of("65")

            @JvmField val _66 = of("66")

            @JvmField val _67 = of("67")

            @JvmField val _68 = of("68")

            @JvmField val _70 = of("70")

            @JvmField val _71 = of("71")

            @JvmField val _88 = of("88")

            @JvmField val _95 = of("95")

            @JvmField val _100 = of("100")

            @JvmField val _102 = of("102")

            @JvmField val _103 = of("103")

            @JvmField val _104 = of("104")

            @JvmField val _105 = of("105")

            @JvmStatic fun of(value: String) = ReasonCode(JsonField.of(value))
        }

        /** An enum containing [ReasonCode]'s known values. */
        enum class Known {
            _41,
            _42,
            _60,
            _62,
            _63,
            _64,
            _65,
            _66,
            _67,
            _68,
            _70,
            _71,
            _88,
            _95,
            _100,
            _102,
            _103,
            _104,
            _105,
        }

        /**
         * An enum containing [ReasonCode]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ReasonCode] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            _41,
            _42,
            _60,
            _62,
            _63,
            _64,
            _65,
            _66,
            _67,
            _68,
            _70,
            _71,
            _88,
            _95,
            _100,
            _102,
            _103,
            _104,
            _105,
            /**
             * An enum member indicating that [ReasonCode] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                _41 -> Value._41
                _42 -> Value._42
                _60 -> Value._60
                _62 -> Value._62
                _63 -> Value._63
                _64 -> Value._64
                _65 -> Value._65
                _66 -> Value._66
                _67 -> Value._67
                _68 -> Value._68
                _70 -> Value._70
                _71 -> Value._71
                _88 -> Value._88
                _95 -> Value._95
                _100 -> Value._100
                _102 -> Value._102
                _103 -> Value._103
                _104 -> Value._104
                _105 -> Value._105
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws EInvoiceInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                _41 -> Known._41
                _42 -> Known._42
                _60 -> Known._60
                _62 -> Known._62
                _63 -> Known._63
                _64 -> Known._64
                _65 -> Known._65
                _66 -> Known._66
                _67 -> Known._67
                _68 -> Known._68
                _70 -> Known._70
                _71 -> Known._71
                _88 -> Known._88
                _95 -> Known._95
                _100 -> Known._100
                _102 -> Known._102
                _103 -> Known._103
                _104 -> Known._104
                _105 -> Known._105
                else -> throw EInvoiceInvalidDataException("Unknown ReasonCode: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws EInvoiceInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                EInvoiceInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws EInvoiceInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): ReasonCode = apply {
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ReasonCode && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The VAT category code that applies to the allowance */
    class TaxCode @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val AE = of("AE")

            @JvmField val E = of("E")

            @JvmField val S = of("S")

            @JvmField val Z = of("Z")

            @JvmField val G = of("G")

            @JvmField val O = of("O")

            @JvmField val K = of("K")

            @JvmField val L = of("L")

            @JvmField val M = of("M")

            @JvmField val B = of("B")

            @JvmStatic fun of(value: String) = TaxCode(JsonField.of(value))
        }

        /** An enum containing [TaxCode]'s known values. */
        enum class Known {
            AE,
            E,
            S,
            Z,
            G,
            O,
            K,
            L,
            M,
            B,
        }

        /**
         * An enum containing [TaxCode]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TaxCode] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AE,
            E,
            S,
            Z,
            G,
            O,
            K,
            L,
            M,
            B,
            /** An enum member indicating that [TaxCode] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                AE -> Value.AE
                E -> Value.E
                S -> Value.S
                Z -> Value.Z
                G -> Value.G
                O -> Value.O
                K -> Value.K
                L -> Value.L
                M -> Value.M
                B -> Value.B
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws EInvoiceInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                AE -> Known.AE
                E -> Known.E
                S -> Known.S
                Z -> Known.Z
                G -> Known.G
                O -> Known.O
                K -> Known.K
                L -> Known.L
                M -> Known.M
                B -> Known.B
                else -> throw EInvoiceInvalidDataException("Unknown TaxCode: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws EInvoiceInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                EInvoiceInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws EInvoiceInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): TaxCode = apply {
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TaxCode && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Allowance &&
            amount == other.amount &&
            baseAmount == other.baseAmount &&
            multiplierFactor == other.multiplierFactor &&
            reason == other.reason &&
            reasonCode == other.reasonCode &&
            taxCode == other.taxCode &&
            taxRate == other.taxRate &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            amount,
            baseAmount,
            multiplierFactor,
            reason,
            reasonCode,
            taxCode,
            taxRate,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Allowance{amount=$amount, baseAmount=$baseAmount, multiplierFactor=$multiplierFactor, reason=$reason, reasonCode=$reasonCode, taxCode=$taxCode, taxRate=$taxRate, additionalProperties=$additionalProperties}"
}
