// File generated from our OpenAPI spec by Stainless.

package com.e_invoice_api.api.models.documents

import com.e_invoice_api.api.core.ExcludeMissing
import com.e_invoice_api.api.core.JsonField
import com.e_invoice_api.api.core.JsonMissing
import com.e_invoice_api.api.core.JsonValue
import com.e_invoice_api.api.errors.EInvoiceInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PaymentDetailCreate
private constructor(
    private val bankAccountNumber: JsonField<String>,
    private val iban: JsonField<String>,
    private val paymentReference: JsonField<String>,
    private val swift: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("bank_account_number")
        @ExcludeMissing
        bankAccountNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("iban") @ExcludeMissing iban: JsonField<String> = JsonMissing.of(),
        @JsonProperty("payment_reference")
        @ExcludeMissing
        paymentReference: JsonField<String> = JsonMissing.of(),
        @JsonProperty("swift") @ExcludeMissing swift: JsonField<String> = JsonMissing.of(),
    ) : this(bankAccountNumber, iban, paymentReference, swift, mutableMapOf())

    /**
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun bankAccountNumber(): Optional<String> = bankAccountNumber.getOptional("bank_account_number")

    /**
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun iban(): Optional<String> = iban.getOptional("iban")

    /**
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun paymentReference(): Optional<String> = paymentReference.getOptional("payment_reference")

    /**
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun swift(): Optional<String> = swift.getOptional("swift")

    /**
     * Returns the raw JSON value of [bankAccountNumber].
     *
     * Unlike [bankAccountNumber], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("bank_account_number")
    @ExcludeMissing
    fun _bankAccountNumber(): JsonField<String> = bankAccountNumber

    /**
     * Returns the raw JSON value of [iban].
     *
     * Unlike [iban], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("iban") @ExcludeMissing fun _iban(): JsonField<String> = iban

    /**
     * Returns the raw JSON value of [paymentReference].
     *
     * Unlike [paymentReference], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("payment_reference")
    @ExcludeMissing
    fun _paymentReference(): JsonField<String> = paymentReference

    /**
     * Returns the raw JSON value of [swift].
     *
     * Unlike [swift], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("swift") @ExcludeMissing fun _swift(): JsonField<String> = swift

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

        /** Returns a mutable builder for constructing an instance of [PaymentDetailCreate]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PaymentDetailCreate]. */
    class Builder internal constructor() {

        private var bankAccountNumber: JsonField<String> = JsonMissing.of()
        private var iban: JsonField<String> = JsonMissing.of()
        private var paymentReference: JsonField<String> = JsonMissing.of()
        private var swift: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(paymentDetailCreate: PaymentDetailCreate) = apply {
            bankAccountNumber = paymentDetailCreate.bankAccountNumber
            iban = paymentDetailCreate.iban
            paymentReference = paymentDetailCreate.paymentReference
            swift = paymentDetailCreate.swift
            additionalProperties = paymentDetailCreate.additionalProperties.toMutableMap()
        }

        fun bankAccountNumber(bankAccountNumber: String?) =
            bankAccountNumber(JsonField.ofNullable(bankAccountNumber))

        /** Alias for calling [Builder.bankAccountNumber] with `bankAccountNumber.orElse(null)`. */
        fun bankAccountNumber(bankAccountNumber: Optional<String>) =
            bankAccountNumber(bankAccountNumber.getOrNull())

        /**
         * Sets [Builder.bankAccountNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bankAccountNumber] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun bankAccountNumber(bankAccountNumber: JsonField<String>) = apply {
            this.bankAccountNumber = bankAccountNumber
        }

        fun iban(iban: String?) = iban(JsonField.ofNullable(iban))

        /** Alias for calling [Builder.iban] with `iban.orElse(null)`. */
        fun iban(iban: Optional<String>) = iban(iban.getOrNull())

        /**
         * Sets [Builder.iban] to an arbitrary JSON value.
         *
         * You should usually call [Builder.iban] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun iban(iban: JsonField<String>) = apply { this.iban = iban }

        fun paymentReference(paymentReference: String?) =
            paymentReference(JsonField.ofNullable(paymentReference))

        /** Alias for calling [Builder.paymentReference] with `paymentReference.orElse(null)`. */
        fun paymentReference(paymentReference: Optional<String>) =
            paymentReference(paymentReference.getOrNull())

        /**
         * Sets [Builder.paymentReference] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentReference] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun paymentReference(paymentReference: JsonField<String>) = apply {
            this.paymentReference = paymentReference
        }

        fun swift(swift: String?) = swift(JsonField.ofNullable(swift))

        /** Alias for calling [Builder.swift] with `swift.orElse(null)`. */
        fun swift(swift: Optional<String>) = swift(swift.getOrNull())

        /**
         * Sets [Builder.swift] to an arbitrary JSON value.
         *
         * You should usually call [Builder.swift] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun swift(swift: JsonField<String>) = apply { this.swift = swift }

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
         * Returns an immutable instance of [PaymentDetailCreate].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PaymentDetailCreate =
            PaymentDetailCreate(
                bankAccountNumber,
                iban,
                paymentReference,
                swift,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PaymentDetailCreate = apply {
        if (validated) {
            return@apply
        }

        bankAccountNumber()
        iban()
        paymentReference()
        swift()
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
        (if (bankAccountNumber.asKnown().isPresent) 1 else 0) +
            (if (iban.asKnown().isPresent) 1 else 0) +
            (if (paymentReference.asKnown().isPresent) 1 else 0) +
            (if (swift.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PaymentDetailCreate && bankAccountNumber == other.bankAccountNumber && iban == other.iban && paymentReference == other.paymentReference && swift == other.swift && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(bankAccountNumber, iban, paymentReference, swift, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PaymentDetailCreate{bankAccountNumber=$bankAccountNumber, iban=$iban, paymentReference=$paymentReference, swift=$swift, additionalProperties=$additionalProperties}"
}
