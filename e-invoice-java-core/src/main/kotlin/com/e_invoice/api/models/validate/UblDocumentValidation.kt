// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.models.validate

import com.e_invoice.api.core.Enum
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
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class UblDocumentValidation
private constructor(
    private val id: JsonField<String>,
    private val fileName: JsonField<String>,
    private val isValid: JsonField<Boolean>,
    private val issues: JsonField<List<Issue>>,
    private val ublDocument: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("file_name") @ExcludeMissing fileName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("is_valid") @ExcludeMissing isValid: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("issues") @ExcludeMissing issues: JsonField<List<Issue>> = JsonMissing.of(),
        @JsonProperty("ubl_document")
        @ExcludeMissing
        ublDocument: JsonField<String> = JsonMissing.of(),
    ) : this(id, fileName, isValid, issues, ublDocument, mutableMapOf())

    /**
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fileName(): Optional<String> = fileName.getOptional("file_name")

    /**
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isValid(): Boolean = isValid.getRequired("is_valid")

    /**
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun issues(): List<Issue> = issues.getRequired("issues")

    /**
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ublDocument(): Optional<String> = ublDocument.getOptional("ubl_document")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [fileName].
     *
     * Unlike [fileName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("file_name") @ExcludeMissing fun _fileName(): JsonField<String> = fileName

    /**
     * Returns the raw JSON value of [isValid].
     *
     * Unlike [isValid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_valid") @ExcludeMissing fun _isValid(): JsonField<Boolean> = isValid

    /**
     * Returns the raw JSON value of [issues].
     *
     * Unlike [issues], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("issues") @ExcludeMissing fun _issues(): JsonField<List<Issue>> = issues

    /**
     * Returns the raw JSON value of [ublDocument].
     *
     * Unlike [ublDocument], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ubl_document")
    @ExcludeMissing
    fun _ublDocument(): JsonField<String> = ublDocument

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
         * Returns a mutable builder for constructing an instance of [UblDocumentValidation].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .fileName()
         * .isValid()
         * .issues()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UblDocumentValidation]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var fileName: JsonField<String>? = null
        private var isValid: JsonField<Boolean>? = null
        private var issues: JsonField<MutableList<Issue>>? = null
        private var ublDocument: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(ublDocumentValidation: UblDocumentValidation) = apply {
            id = ublDocumentValidation.id
            fileName = ublDocumentValidation.fileName
            isValid = ublDocumentValidation.isValid
            issues = ublDocumentValidation.issues.map { it.toMutableList() }
            ublDocument = ublDocumentValidation.ublDocument
            additionalProperties = ublDocumentValidation.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun fileName(fileName: String?) = fileName(JsonField.ofNullable(fileName))

        /** Alias for calling [Builder.fileName] with `fileName.orElse(null)`. */
        fun fileName(fileName: Optional<String>) = fileName(fileName.getOrNull())

        /**
         * Sets [Builder.fileName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fileName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fileName(fileName: JsonField<String>) = apply { this.fileName = fileName }

        fun isValid(isValid: Boolean) = isValid(JsonField.of(isValid))

        /**
         * Sets [Builder.isValid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isValid] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun isValid(isValid: JsonField<Boolean>) = apply { this.isValid = isValid }

        fun issues(issues: List<Issue>) = issues(JsonField.of(issues))

        /**
         * Sets [Builder.issues] to an arbitrary JSON value.
         *
         * You should usually call [Builder.issues] with a well-typed `List<Issue>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun issues(issues: JsonField<List<Issue>>) = apply {
            this.issues = issues.map { it.toMutableList() }
        }

        /**
         * Adds a single [Issue] to [issues].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addIssue(issue: Issue) = apply {
            issues =
                (issues ?: JsonField.of(mutableListOf())).also {
                    checkKnown("issues", it).add(issue)
                }
        }

        fun ublDocument(ublDocument: String?) = ublDocument(JsonField.ofNullable(ublDocument))

        /** Alias for calling [Builder.ublDocument] with `ublDocument.orElse(null)`. */
        fun ublDocument(ublDocument: Optional<String>) = ublDocument(ublDocument.getOrNull())

        /**
         * Sets [Builder.ublDocument] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ublDocument] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ublDocument(ublDocument: JsonField<String>) = apply { this.ublDocument = ublDocument }

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
         * Returns an immutable instance of [UblDocumentValidation].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .fileName()
         * .isValid()
         * .issues()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): UblDocumentValidation =
            UblDocumentValidation(
                checkRequired("id", id),
                checkRequired("fileName", fileName),
                checkRequired("isValid", isValid),
                checkRequired("issues", issues).map { it.toImmutable() },
                ublDocument,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): UblDocumentValidation = apply {
        if (validated) {
            return@apply
        }

        id()
        fileName()
        isValid()
        issues().forEach { it.validate() }
        ublDocument()
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (fileName.asKnown().isPresent) 1 else 0) +
            (if (isValid.asKnown().isPresent) 1 else 0) +
            (issues.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (ublDocument.asKnown().isPresent) 1 else 0)

    class Issue
    private constructor(
        private val message: JsonField<String>,
        private val schematron: JsonField<String>,
        private val type: JsonField<Type>,
        private val flag: JsonField<String>,
        private val location: JsonField<String>,
        private val ruleId: JsonField<String>,
        private val test: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("message") @ExcludeMissing message: JsonField<String> = JsonMissing.of(),
            @JsonProperty("schematron")
            @ExcludeMissing
            schematron: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("flag") @ExcludeMissing flag: JsonField<String> = JsonMissing.of(),
            @JsonProperty("location")
            @ExcludeMissing
            location: JsonField<String> = JsonMissing.of(),
            @JsonProperty("rule_id") @ExcludeMissing ruleId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("test") @ExcludeMissing test: JsonField<String> = JsonMissing.of(),
        ) : this(message, schematron, type, flag, location, ruleId, test, mutableMapOf())

        /**
         * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun message(): String = message.getRequired("message")

        /**
         * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun schematron(): String = schematron.getRequired("schematron")

        /**
         * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun flag(): Optional<String> = flag.getOptional("flag")

        /**
         * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun location(): Optional<String> = location.getOptional("location")

        /**
         * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun ruleId(): Optional<String> = ruleId.getOptional("rule_id")

        /**
         * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun test(): Optional<String> = test.getOptional("test")

        /**
         * Returns the raw JSON value of [message].
         *
         * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

        /**
         * Returns the raw JSON value of [schematron].
         *
         * Unlike [schematron], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("schematron")
        @ExcludeMissing
        fun _schematron(): JsonField<String> = schematron

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /**
         * Returns the raw JSON value of [flag].
         *
         * Unlike [flag], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("flag") @ExcludeMissing fun _flag(): JsonField<String> = flag

        /**
         * Returns the raw JSON value of [location].
         *
         * Unlike [location], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("location") @ExcludeMissing fun _location(): JsonField<String> = location

        /**
         * Returns the raw JSON value of [ruleId].
         *
         * Unlike [ruleId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rule_id") @ExcludeMissing fun _ruleId(): JsonField<String> = ruleId

        /**
         * Returns the raw JSON value of [test].
         *
         * Unlike [test], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("test") @ExcludeMissing fun _test(): JsonField<String> = test

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
             * Returns a mutable builder for constructing an instance of [Issue].
             *
             * The following fields are required:
             * ```java
             * .message()
             * .schematron()
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Issue]. */
        class Builder internal constructor() {

            private var message: JsonField<String>? = null
            private var schematron: JsonField<String>? = null
            private var type: JsonField<Type>? = null
            private var flag: JsonField<String> = JsonMissing.of()
            private var location: JsonField<String> = JsonMissing.of()
            private var ruleId: JsonField<String> = JsonMissing.of()
            private var test: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(issue: Issue) = apply {
                message = issue.message
                schematron = issue.schematron
                type = issue.type
                flag = issue.flag
                location = issue.location
                ruleId = issue.ruleId
                test = issue.test
                additionalProperties = issue.additionalProperties.toMutableMap()
            }

            fun message(message: String) = message(JsonField.of(message))

            /**
             * Sets [Builder.message] to an arbitrary JSON value.
             *
             * You should usually call [Builder.message] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun message(message: JsonField<String>) = apply { this.message = message }

            fun schematron(schematron: String) = schematron(JsonField.of(schematron))

            /**
             * Sets [Builder.schematron] to an arbitrary JSON value.
             *
             * You should usually call [Builder.schematron] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun schematron(schematron: JsonField<String>) = apply { this.schematron = schematron }

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            fun flag(flag: String?) = flag(JsonField.ofNullable(flag))

            /** Alias for calling [Builder.flag] with `flag.orElse(null)`. */
            fun flag(flag: Optional<String>) = flag(flag.getOrNull())

            /**
             * Sets [Builder.flag] to an arbitrary JSON value.
             *
             * You should usually call [Builder.flag] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun flag(flag: JsonField<String>) = apply { this.flag = flag }

            fun location(location: String?) = location(JsonField.ofNullable(location))

            /** Alias for calling [Builder.location] with `location.orElse(null)`. */
            fun location(location: Optional<String>) = location(location.getOrNull())

            /**
             * Sets [Builder.location] to an arbitrary JSON value.
             *
             * You should usually call [Builder.location] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun location(location: JsonField<String>) = apply { this.location = location }

            fun ruleId(ruleId: String?) = ruleId(JsonField.ofNullable(ruleId))

            /** Alias for calling [Builder.ruleId] with `ruleId.orElse(null)`. */
            fun ruleId(ruleId: Optional<String>) = ruleId(ruleId.getOrNull())

            /**
             * Sets [Builder.ruleId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ruleId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ruleId(ruleId: JsonField<String>) = apply { this.ruleId = ruleId }

            fun test(test: String?) = test(JsonField.ofNullable(test))

            /** Alias for calling [Builder.test] with `test.orElse(null)`. */
            fun test(test: Optional<String>) = test(test.getOrNull())

            /**
             * Sets [Builder.test] to an arbitrary JSON value.
             *
             * You should usually call [Builder.test] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun test(test: JsonField<String>) = apply { this.test = test }

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
             * Returns an immutable instance of [Issue].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .message()
             * .schematron()
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Issue =
                Issue(
                    checkRequired("message", message),
                    checkRequired("schematron", schematron),
                    checkRequired("type", type),
                    flag,
                    location,
                    ruleId,
                    test,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Issue = apply {
            if (validated) {
                return@apply
            }

            message()
            schematron()
            type().validate()
            flag()
            location()
            ruleId()
            test()
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
            (if (message.asKnown().isPresent) 1 else 0) +
                (if (schematron.asKnown().isPresent) 1 else 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0) +
                (if (flag.asKnown().isPresent) 1 else 0) +
                (if (location.asKnown().isPresent) 1 else 0) +
                (if (ruleId.asKnown().isPresent) 1 else 0) +
                (if (test.asKnown().isPresent) 1 else 0)

        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val ERROR = of("error")

                @JvmField val WARNING = of("warning")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                ERROR,
                WARNING,
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ERROR,
                WARNING,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    ERROR -> Value.ERROR
                    WARNING -> Value.WARNING
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws EInvoiceInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    ERROR -> Known.ERROR
                    WARNING -> Known.WARNING
                    else -> throw EInvoiceInvalidDataException("Unknown Type: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws EInvoiceInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    EInvoiceInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): Type = apply {
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

                return /* spotless:off */ other is Type && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Issue && message == other.message && schematron == other.schematron && type == other.type && flag == other.flag && location == other.location && ruleId == other.ruleId && test == other.test && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(message, schematron, type, flag, location, ruleId, test, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Issue{message=$message, schematron=$schematron, type=$type, flag=$flag, location=$location, ruleId=$ruleId, test=$test, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is UblDocumentValidation && id == other.id && fileName == other.fileName && isValid == other.isValid && issues == other.issues && ublDocument == other.ublDocument && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, fileName, isValid, issues, ublDocument, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UblDocumentValidation{id=$id, fileName=$fileName, isValid=$isValid, issues=$issues, ublDocument=$ublDocument, additionalProperties=$additionalProperties}"
}
