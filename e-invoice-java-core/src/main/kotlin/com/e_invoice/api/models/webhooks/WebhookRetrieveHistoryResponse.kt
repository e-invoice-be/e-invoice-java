package com.e_invoice.api.models.webhooks

import com.e_invoice.api.core.ExcludeMissing
import com.e_invoice.api.core.JsonField
import com.e_invoice.api.core.JsonMissing
import com.e_invoice.api.core.JsonValue
import com.e_invoice.api.core.checkKnown
import com.e_invoice.api.core.checkRequired
import com.e_invoice.api.core.toImmutable
import com.e_invoice.api.errors.EInvoiceInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/** The event delivery history of a webhook. */
class WebhookRetrieveHistoryResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val history: JsonField<List<History>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("history")
        @ExcludeMissing
        history: JsonField<List<History>> = JsonMissing.of()
    ) : this(history, mutableMapOf())

    /**
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun history(): List<History> = history.getRequired("history")

    /**
     * Returns the raw JSON value of [history].
     *
     * Unlike [history], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("history") @ExcludeMissing fun _history(): JsonField<List<History>> = history

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

        /**
         * Returns a mutable builder for constructing an instance of
         * [WebhookRetrieveHistoryResponse].
         *
         * The following fields are required:
         * ```java
         * .history()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WebhookRetrieveHistoryResponse]. */
    class Builder internal constructor() {

        private var history: JsonField<MutableList<History>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(webhookRetrieveHistoryResponse: WebhookRetrieveHistoryResponse) = apply {
            history = webhookRetrieveHistoryResponse.history.map { it.toMutableList() }
            additionalProperties =
                webhookRetrieveHistoryResponse.additionalProperties.toMutableMap()
        }

        fun history(history: List<History>) = history(JsonField.of(history))

        /**
         * Sets [Builder.history] to an arbitrary JSON value.
         *
         * You should usually call [Builder.history] with a well-typed `List<History>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun history(history: JsonField<List<History>>) = apply {
            this.history = history.map { it.toMutableList() }
        }

        /**
         * Adds a single [History] to [Builder.history].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addHistory(history: History) = apply {
            this.history =
                (this.history ?: JsonField.of(mutableListOf())).also {
                    checkKnown("history", it).add(history)
                }
        }

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
         * Returns an immutable instance of [WebhookRetrieveHistoryResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .history()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): WebhookRetrieveHistoryResponse =
            WebhookRetrieveHistoryResponse(
                checkRequired("history", history).map { it.toImmutable() },
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
    fun validate(): WebhookRetrieveHistoryResponse = apply {
        if (validated) {
            return@apply
        }

        history().forEach { it.validate() }
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
        (history.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    /** A single webhook event history entry. The API does not specify its shape. */
    class History
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [History]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [History]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(history: History) = apply {
                additionalProperties = history.additionalProperties.toMutableMap()
            }

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
             * Returns an immutable instance of [History].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): History = History(additionalProperties.toImmutable())
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
        fun validate(): History = apply {
            if (validated) {
                return@apply
            }

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
        @JvmSynthetic
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is History && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "History{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WebhookRetrieveHistoryResponse &&
            history == other.history &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(history, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "WebhookRetrieveHistoryResponse{history=$history, additionalProperties=$additionalProperties}"
}
