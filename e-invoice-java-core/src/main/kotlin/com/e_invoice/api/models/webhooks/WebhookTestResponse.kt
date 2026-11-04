package com.e_invoice.api.models.webhooks

import com.e_invoice.api.core.ExcludeMissing
import com.e_invoice.api.core.JsonField
import com.e_invoice.api.core.JsonMissing
import com.e_invoice.api.core.JsonValue
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

/** Schema for webhook test response. */
class WebhookTestResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val message: JsonField<String>,
    private val success: JsonField<Boolean>,
    private val webhookDeliveryResult: JsonField<WebhookDeliveryResult>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("message") @ExcludeMissing message: JsonField<String> = JsonMissing.of(),
        @JsonProperty("success") @ExcludeMissing success: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("webhook_delivery_result")
        @ExcludeMissing
        webhookDeliveryResult: JsonField<WebhookDeliveryResult> = JsonMissing.of(),
    ) : this(message, success, webhookDeliveryResult, mutableMapOf())

    /**
     * Descriptive message about the test result
     *
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun message(): String = message.getRequired("message")

    /**
     * Whether the test completed successfully
     *
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun success(): Boolean = success.getRequired("success")

    /**
     * Result from process_webhook_task
     *
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun webhookDeliveryResult(): WebhookDeliveryResult =
        webhookDeliveryResult.getRequired("webhook_delivery_result")

    /**
     * Returns the raw JSON value of [message].
     *
     * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

    /**
     * Returns the raw JSON value of [success].
     *
     * Unlike [success], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("success") @ExcludeMissing fun _success(): JsonField<Boolean> = success

    /**
     * Returns the raw JSON value of [webhookDeliveryResult].
     *
     * Unlike [webhookDeliveryResult], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("webhook_delivery_result")
    @ExcludeMissing
    fun _webhookDeliveryResult(): JsonField<WebhookDeliveryResult> = webhookDeliveryResult

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
         * Returns a mutable builder for constructing an instance of [WebhookTestResponse].
         *
         * The following fields are required:
         * ```java
         * .message()
         * .success()
         * .webhookDeliveryResult()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WebhookTestResponse]. */
    class Builder internal constructor() {

        private var message: JsonField<String>? = null
        private var success: JsonField<Boolean>? = null
        private var webhookDeliveryResult: JsonField<WebhookDeliveryResult>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(webhookTestResponse: WebhookTestResponse) = apply {
            message = webhookTestResponse.message
            success = webhookTestResponse.success
            webhookDeliveryResult = webhookTestResponse.webhookDeliveryResult
            additionalProperties = webhookTestResponse.additionalProperties.toMutableMap()
        }

        /** Descriptive message about the test result */
        fun message(message: String) = message(JsonField.of(message))

        /**
         * Sets [Builder.message] to an arbitrary JSON value.
         *
         * You should usually call [Builder.message] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun message(message: JsonField<String>) = apply { this.message = message }

        /** Whether the test completed successfully */
        fun success(success: Boolean) = success(JsonField.of(success))

        /**
         * Sets [Builder.success] to an arbitrary JSON value.
         *
         * You should usually call [Builder.success] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun success(success: JsonField<Boolean>) = apply { this.success = success }

        /** Result from process_webhook_task */
        fun webhookDeliveryResult(webhookDeliveryResult: WebhookDeliveryResult) =
            webhookDeliveryResult(JsonField.of(webhookDeliveryResult))

        /**
         * Sets [Builder.webhookDeliveryResult] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhookDeliveryResult] with a well-typed
         * [WebhookDeliveryResult] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun webhookDeliveryResult(webhookDeliveryResult: JsonField<WebhookDeliveryResult>) = apply {
            this.webhookDeliveryResult = webhookDeliveryResult
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
         * Returns an immutable instance of [WebhookTestResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .message()
         * .success()
         * .webhookDeliveryResult()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): WebhookTestResponse =
            WebhookTestResponse(
                checkRequired("message", message),
                checkRequired("success", success),
                checkRequired("webhookDeliveryResult", webhookDeliveryResult),
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
    fun validate(): WebhookTestResponse = apply {
        if (validated) {
            return@apply
        }

        message()
        success()
        webhookDeliveryResult().validate()
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
        (if (message.asKnown().isPresent) 1 else 0) +
            (if (success.asKnown().isPresent) 1 else 0) +
            (webhookDeliveryResult.asKnown().getOrNull()?.validity() ?: 0)

    /** Result from process_webhook_task */
    class WebhookDeliveryResult
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

            /**
             * Returns a mutable builder for constructing an instance of [WebhookDeliveryResult].
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [WebhookDeliveryResult]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(webhookDeliveryResult: WebhookDeliveryResult) = apply {
                additionalProperties = webhookDeliveryResult.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [WebhookDeliveryResult].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): WebhookDeliveryResult =
                WebhookDeliveryResult(additionalProperties.toImmutable())
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
        fun validate(): WebhookDeliveryResult = apply {
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

            return other is WebhookDeliveryResult &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "WebhookDeliveryResult{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WebhookTestResponse &&
            message == other.message &&
            success == other.success &&
            webhookDeliveryResult == other.webhookDeliveryResult &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(message, success, webhookDeliveryResult, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "WebhookTestResponse{message=$message, success=$success, webhookDeliveryResult=$webhookDeliveryResult, additionalProperties=$additionalProperties}"
}
