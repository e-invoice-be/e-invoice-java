// File generated from our OpenAPI spec by Stainless.

package com.e_invoice_api.api.models.inbox

import com.e_invoice_api.api.core.Enum
import com.e_invoice_api.api.core.JsonField
import com.e_invoice_api.api.errors.EInvoiceInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator

class DocumentState @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val DRAFT = of("DRAFT")

        @JvmField val TRANSIT = of("TRANSIT")

        @JvmField val FAILED = of("FAILED")

        @JvmField val SENT = of("SENT")

        @JvmField val RECEIVED = of("RECEIVED")

        @JvmStatic fun of(value: String) = DocumentState(JsonField.of(value))
    }

    /** An enum containing [DocumentState]'s known values. */
    enum class Known {
        DRAFT,
        TRANSIT,
        FAILED,
        SENT,
        RECEIVED,
    }

    /**
     * An enum containing [DocumentState]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [DocumentState] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        DRAFT,
        TRANSIT,
        FAILED,
        SENT,
        RECEIVED,
        /**
         * An enum member indicating that [DocumentState] was instantiated with an unknown value.
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
            DRAFT -> Value.DRAFT
            TRANSIT -> Value.TRANSIT
            FAILED -> Value.FAILED
            SENT -> Value.SENT
            RECEIVED -> Value.RECEIVED
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
            DRAFT -> Known.DRAFT
            TRANSIT -> Known.TRANSIT
            FAILED -> Known.FAILED
            SENT -> Known.SENT
            RECEIVED -> Known.RECEIVED
            else -> throw EInvoiceInvalidDataException("Unknown DocumentState: $value")
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

    fun validate(): DocumentState = apply {
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

        return /* spotless:off */ other is DocumentState && value == other.value /* spotless:on */
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
