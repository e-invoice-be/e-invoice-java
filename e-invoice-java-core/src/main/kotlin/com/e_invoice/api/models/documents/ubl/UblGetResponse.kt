// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.models.documents.ubl

import com.e_invoice.api.core.ExcludeMissing
import com.e_invoice.api.core.JsonField
import com.e_invoice.api.core.JsonMissing
import com.e_invoice.api.core.JsonValue
import com.e_invoice.api.core.checkRequired
import com.e_invoice.api.errors.EInvoiceInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class UblGetResponse
private constructor(
    private val id: JsonField<String>,
    private val fileName: JsonField<String>,
    private val fileHash: JsonField<String>,
    private val fileSize: JsonField<Long>,
    private val receiverPeppolId: JsonField<String>,
    private val receiverPeppolScheme: JsonField<String>,
    private val senderPeppolId: JsonField<String>,
    private val senderPeppolScheme: JsonField<String>,
    private val signedUrl: JsonField<String>,
    private val validatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("file_name") @ExcludeMissing fileName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("file_hash") @ExcludeMissing fileHash: JsonField<String> = JsonMissing.of(),
        @JsonProperty("file_size") @ExcludeMissing fileSize: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("receiver_peppol_id")
        @ExcludeMissing
        receiverPeppolId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("receiver_peppol_scheme")
        @ExcludeMissing
        receiverPeppolScheme: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sender_peppol_id")
        @ExcludeMissing
        senderPeppolId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sender_peppol_scheme")
        @ExcludeMissing
        senderPeppolScheme: JsonField<String> = JsonMissing.of(),
        @JsonProperty("signed_url") @ExcludeMissing signedUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("validated_at")
        @ExcludeMissing
        validatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        fileName,
        fileHash,
        fileSize,
        receiverPeppolId,
        receiverPeppolScheme,
        senderPeppolId,
        senderPeppolScheme,
        signedUrl,
        validatedAt,
        mutableMapOf(),
    )

    /**
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fileName(): String = fileName.getRequired("file_name")

    /**
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fileHash(): Optional<String> = fileHash.getOptional("file_hash")

    /**
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fileSize(): Optional<Long> = fileSize.getOptional("file_size")

    /**
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun receiverPeppolId(): Optional<String> = receiverPeppolId.getOptional("receiver_peppol_id")

    /**
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun receiverPeppolScheme(): Optional<String> =
        receiverPeppolScheme.getOptional("receiver_peppol_scheme")

    /**
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun senderPeppolId(): Optional<String> = senderPeppolId.getOptional("sender_peppol_id")

    /**
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun senderPeppolScheme(): Optional<String> =
        senderPeppolScheme.getOptional("sender_peppol_scheme")

    /**
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun signedUrl(): Optional<String> = signedUrl.getOptional("signed_url")

    /**
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun validatedAt(): Optional<OffsetDateTime> = validatedAt.getOptional("validated_at")

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
     * Returns the raw JSON value of [fileHash].
     *
     * Unlike [fileHash], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("file_hash") @ExcludeMissing fun _fileHash(): JsonField<String> = fileHash

    /**
     * Returns the raw JSON value of [fileSize].
     *
     * Unlike [fileSize], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("file_size") @ExcludeMissing fun _fileSize(): JsonField<Long> = fileSize

    /**
     * Returns the raw JSON value of [receiverPeppolId].
     *
     * Unlike [receiverPeppolId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("receiver_peppol_id")
    @ExcludeMissing
    fun _receiverPeppolId(): JsonField<String> = receiverPeppolId

    /**
     * Returns the raw JSON value of [receiverPeppolScheme].
     *
     * Unlike [receiverPeppolScheme], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("receiver_peppol_scheme")
    @ExcludeMissing
    fun _receiverPeppolScheme(): JsonField<String> = receiverPeppolScheme

    /**
     * Returns the raw JSON value of [senderPeppolId].
     *
     * Unlike [senderPeppolId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sender_peppol_id")
    @ExcludeMissing
    fun _senderPeppolId(): JsonField<String> = senderPeppolId

    /**
     * Returns the raw JSON value of [senderPeppolScheme].
     *
     * Unlike [senderPeppolScheme], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("sender_peppol_scheme")
    @ExcludeMissing
    fun _senderPeppolScheme(): JsonField<String> = senderPeppolScheme

    /**
     * Returns the raw JSON value of [signedUrl].
     *
     * Unlike [signedUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("signed_url") @ExcludeMissing fun _signedUrl(): JsonField<String> = signedUrl

    /**
     * Returns the raw JSON value of [validatedAt].
     *
     * Unlike [validatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("validated_at")
    @ExcludeMissing
    fun _validatedAt(): JsonField<OffsetDateTime> = validatedAt

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
         * Returns a mutable builder for constructing an instance of [UblGetResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .fileName()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UblGetResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var fileName: JsonField<String>? = null
        private var fileHash: JsonField<String> = JsonMissing.of()
        private var fileSize: JsonField<Long> = JsonMissing.of()
        private var receiverPeppolId: JsonField<String> = JsonMissing.of()
        private var receiverPeppolScheme: JsonField<String> = JsonMissing.of()
        private var senderPeppolId: JsonField<String> = JsonMissing.of()
        private var senderPeppolScheme: JsonField<String> = JsonMissing.of()
        private var signedUrl: JsonField<String> = JsonMissing.of()
        private var validatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(ublGetResponse: UblGetResponse) = apply {
            id = ublGetResponse.id
            fileName = ublGetResponse.fileName
            fileHash = ublGetResponse.fileHash
            fileSize = ublGetResponse.fileSize
            receiverPeppolId = ublGetResponse.receiverPeppolId
            receiverPeppolScheme = ublGetResponse.receiverPeppolScheme
            senderPeppolId = ublGetResponse.senderPeppolId
            senderPeppolScheme = ublGetResponse.senderPeppolScheme
            signedUrl = ublGetResponse.signedUrl
            validatedAt = ublGetResponse.validatedAt
            additionalProperties = ublGetResponse.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun fileName(fileName: String) = fileName(JsonField.of(fileName))

        /**
         * Sets [Builder.fileName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fileName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fileName(fileName: JsonField<String>) = apply { this.fileName = fileName }

        fun fileHash(fileHash: String?) = fileHash(JsonField.ofNullable(fileHash))

        /** Alias for calling [Builder.fileHash] with `fileHash.orElse(null)`. */
        fun fileHash(fileHash: Optional<String>) = fileHash(fileHash.getOrNull())

        /**
         * Sets [Builder.fileHash] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fileHash] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fileHash(fileHash: JsonField<String>) = apply { this.fileHash = fileHash }

        fun fileSize(fileSize: Long) = fileSize(JsonField.of(fileSize))

        /**
         * Sets [Builder.fileSize] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fileSize] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fileSize(fileSize: JsonField<Long>) = apply { this.fileSize = fileSize }

        fun receiverPeppolId(receiverPeppolId: String?) =
            receiverPeppolId(JsonField.ofNullable(receiverPeppolId))

        /** Alias for calling [Builder.receiverPeppolId] with `receiverPeppolId.orElse(null)`. */
        fun receiverPeppolId(receiverPeppolId: Optional<String>) =
            receiverPeppolId(receiverPeppolId.getOrNull())

        /**
         * Sets [Builder.receiverPeppolId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.receiverPeppolId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun receiverPeppolId(receiverPeppolId: JsonField<String>) = apply {
            this.receiverPeppolId = receiverPeppolId
        }

        fun receiverPeppolScheme(receiverPeppolScheme: String?) =
            receiverPeppolScheme(JsonField.ofNullable(receiverPeppolScheme))

        /**
         * Alias for calling [Builder.receiverPeppolScheme] with
         * `receiverPeppolScheme.orElse(null)`.
         */
        fun receiverPeppolScheme(receiverPeppolScheme: Optional<String>) =
            receiverPeppolScheme(receiverPeppolScheme.getOrNull())

        /**
         * Sets [Builder.receiverPeppolScheme] to an arbitrary JSON value.
         *
         * You should usually call [Builder.receiverPeppolScheme] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun receiverPeppolScheme(receiverPeppolScheme: JsonField<String>) = apply {
            this.receiverPeppolScheme = receiverPeppolScheme
        }

        fun senderPeppolId(senderPeppolId: String?) =
            senderPeppolId(JsonField.ofNullable(senderPeppolId))

        /** Alias for calling [Builder.senderPeppolId] with `senderPeppolId.orElse(null)`. */
        fun senderPeppolId(senderPeppolId: Optional<String>) =
            senderPeppolId(senderPeppolId.getOrNull())

        /**
         * Sets [Builder.senderPeppolId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.senderPeppolId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun senderPeppolId(senderPeppolId: JsonField<String>) = apply {
            this.senderPeppolId = senderPeppolId
        }

        fun senderPeppolScheme(senderPeppolScheme: String?) =
            senderPeppolScheme(JsonField.ofNullable(senderPeppolScheme))

        /**
         * Alias for calling [Builder.senderPeppolScheme] with `senderPeppolScheme.orElse(null)`.
         */
        fun senderPeppolScheme(senderPeppolScheme: Optional<String>) =
            senderPeppolScheme(senderPeppolScheme.getOrNull())

        /**
         * Sets [Builder.senderPeppolScheme] to an arbitrary JSON value.
         *
         * You should usually call [Builder.senderPeppolScheme] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun senderPeppolScheme(senderPeppolScheme: JsonField<String>) = apply {
            this.senderPeppolScheme = senderPeppolScheme
        }

        fun signedUrl(signedUrl: String?) = signedUrl(JsonField.ofNullable(signedUrl))

        /** Alias for calling [Builder.signedUrl] with `signedUrl.orElse(null)`. */
        fun signedUrl(signedUrl: Optional<String>) = signedUrl(signedUrl.getOrNull())

        /**
         * Sets [Builder.signedUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.signedUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun signedUrl(signedUrl: JsonField<String>) = apply { this.signedUrl = signedUrl }

        fun validatedAt(validatedAt: OffsetDateTime?) =
            validatedAt(JsonField.ofNullable(validatedAt))

        /** Alias for calling [Builder.validatedAt] with `validatedAt.orElse(null)`. */
        fun validatedAt(validatedAt: Optional<OffsetDateTime>) =
            validatedAt(validatedAt.getOrNull())

        /**
         * Sets [Builder.validatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.validatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun validatedAt(validatedAt: JsonField<OffsetDateTime>) = apply {
            this.validatedAt = validatedAt
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
         * Returns an immutable instance of [UblGetResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .fileName()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): UblGetResponse =
            UblGetResponse(
                checkRequired("id", id),
                checkRequired("fileName", fileName),
                fileHash,
                fileSize,
                receiverPeppolId,
                receiverPeppolScheme,
                senderPeppolId,
                senderPeppolScheme,
                signedUrl,
                validatedAt,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): UblGetResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        fileName()
        fileHash()
        fileSize()
        receiverPeppolId()
        receiverPeppolScheme()
        senderPeppolId()
        senderPeppolScheme()
        signedUrl()
        validatedAt()
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
            (if (fileHash.asKnown().isPresent) 1 else 0) +
            (if (fileSize.asKnown().isPresent) 1 else 0) +
            (if (receiverPeppolId.asKnown().isPresent) 1 else 0) +
            (if (receiverPeppolScheme.asKnown().isPresent) 1 else 0) +
            (if (senderPeppolId.asKnown().isPresent) 1 else 0) +
            (if (senderPeppolScheme.asKnown().isPresent) 1 else 0) +
            (if (signedUrl.asKnown().isPresent) 1 else 0) +
            (if (validatedAt.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is UblGetResponse && id == other.id && fileName == other.fileName && fileHash == other.fileHash && fileSize == other.fileSize && receiverPeppolId == other.receiverPeppolId && receiverPeppolScheme == other.receiverPeppolScheme && senderPeppolId == other.senderPeppolId && senderPeppolScheme == other.senderPeppolScheme && signedUrl == other.signedUrl && validatedAt == other.validatedAt && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, fileName, fileHash, fileSize, receiverPeppolId, receiverPeppolScheme, senderPeppolId, senderPeppolScheme, signedUrl, validatedAt, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UblGetResponse{id=$id, fileName=$fileName, fileHash=$fileHash, fileSize=$fileSize, receiverPeppolId=$receiverPeppolId, receiverPeppolScheme=$receiverPeppolScheme, senderPeppolId=$senderPeppolId, senderPeppolScheme=$senderPeppolScheme, signedUrl=$signedUrl, validatedAt=$validatedAt, additionalProperties=$additionalProperties}"
}
