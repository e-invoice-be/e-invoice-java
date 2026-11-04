package com.e_invoice.api.models.mailbox

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** An inbound email received in the mailbox. */
class InboundEmailResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val createdAt: JsonField<OffsetDateTime>,
    private val id: JsonField<String>,
    private val messageId: JsonField<String>,
    private val senderEmail: JsonField<String>,
    private val attachmentCount: JsonField<Long>,
    private val attachments: JsonField<List<AttachmentInfo>>,
    private val bccAddresses: JsonField<String>,
    private val ccAddresses: JsonField<String>,
    private val documentId: JsonField<String>,
    private val errorMessage: JsonField<String>,
    private val processed: JsonField<Boolean>,
    private val processedAt: JsonField<OffsetDateTime>,
    private val receivedAt: JsonField<OffsetDateTime>,
    private val senderName: JsonField<String>,
    private val subject: JsonField<String>,
    private val toAddresses: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("message_id") @ExcludeMissing messageId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sender_email")
        @ExcludeMissing
        senderEmail: JsonField<String> = JsonMissing.of(),
        @JsonProperty("attachment_count")
        @ExcludeMissing
        attachmentCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("attachments")
        @ExcludeMissing
        attachments: JsonField<List<AttachmentInfo>> = JsonMissing.of(),
        @JsonProperty("bcc_addresses")
        @ExcludeMissing
        bccAddresses: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cc_addresses")
        @ExcludeMissing
        ccAddresses: JsonField<String> = JsonMissing.of(),
        @JsonProperty("document_id")
        @ExcludeMissing
        documentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("error_message")
        @ExcludeMissing
        errorMessage: JsonField<String> = JsonMissing.of(),
        @JsonProperty("processed") @ExcludeMissing processed: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("processed_at")
        @ExcludeMissing
        processedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("received_at")
        @ExcludeMissing
        receivedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("sender_name")
        @ExcludeMissing
        senderName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("subject") @ExcludeMissing subject: JsonField<String> = JsonMissing.of(),
        @JsonProperty("to_addresses")
        @ExcludeMissing
        toAddresses: JsonField<String> = JsonMissing.of(),
    ) : this(
        createdAt,
        id,
        messageId,
        senderEmail,
        attachmentCount,
        attachments,
        bccAddresses,
        ccAddresses,
        documentId,
        errorMessage,
        processed,
        processedAt,
        receivedAt,
        senderName,
        subject,
        toAddresses,
        mutableMapOf(),
    )

    /**
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun messageId(): String = messageId.getRequired("message_id")

    /**
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun senderEmail(): String = senderEmail.getRequired("sender_email")

    /**
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun attachmentCount(): Optional<Long> = attachmentCount.getOptional("attachment_count")

    /**
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun attachments(): Optional<List<AttachmentInfo>> = attachments.getOptional("attachments")

    /**
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun bccAddresses(): Optional<String> = bccAddresses.getOptional("bcc_addresses")

    /**
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ccAddresses(): Optional<String> = ccAddresses.getOptional("cc_addresses")

    /**
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun documentId(): Optional<String> = documentId.getOptional("document_id")

    /**
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun errorMessage(): Optional<String> = errorMessage.getOptional("error_message")

    /**
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun processed(): Optional<Boolean> = processed.getOptional("processed")

    /**
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun processedAt(): Optional<OffsetDateTime> = processedAt.getOptional("processed_at")

    /**
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun receivedAt(): Optional<OffsetDateTime> = receivedAt.getOptional("received_at")

    /**
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun senderName(): Optional<String> = senderName.getOptional("sender_name")

    /**
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun subject(): Optional<String> = subject.getOptional("subject")

    /**
     * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun toAddresses(): Optional<String> = toAddresses.getOptional("to_addresses")

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [messageId].
     *
     * Unlike [messageId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("message_id") @ExcludeMissing fun _messageId(): JsonField<String> = messageId

    /**
     * Returns the raw JSON value of [senderEmail].
     *
     * Unlike [senderEmail], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sender_email")
    @ExcludeMissing
    fun _senderEmail(): JsonField<String> = senderEmail

    /**
     * Returns the raw JSON value of [attachmentCount].
     *
     * Unlike [attachmentCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("attachment_count")
    @ExcludeMissing
    fun _attachmentCount(): JsonField<Long> = attachmentCount

    /**
     * Returns the raw JSON value of [attachments].
     *
     * Unlike [attachments], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("attachments")
    @ExcludeMissing
    fun _attachments(): JsonField<List<AttachmentInfo>> = attachments

    /**
     * Returns the raw JSON value of [bccAddresses].
     *
     * Unlike [bccAddresses], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bcc_addresses")
    @ExcludeMissing
    fun _bccAddresses(): JsonField<String> = bccAddresses

    /**
     * Returns the raw JSON value of [ccAddresses].
     *
     * Unlike [ccAddresses], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cc_addresses")
    @ExcludeMissing
    fun _ccAddresses(): JsonField<String> = ccAddresses

    /**
     * Returns the raw JSON value of [documentId].
     *
     * Unlike [documentId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("document_id") @ExcludeMissing fun _documentId(): JsonField<String> = documentId

    /**
     * Returns the raw JSON value of [errorMessage].
     *
     * Unlike [errorMessage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("error_message")
    @ExcludeMissing
    fun _errorMessage(): JsonField<String> = errorMessage

    /**
     * Returns the raw JSON value of [processed].
     *
     * Unlike [processed], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("processed") @ExcludeMissing fun _processed(): JsonField<Boolean> = processed

    /**
     * Returns the raw JSON value of [processedAt].
     *
     * Unlike [processedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("processed_at")
    @ExcludeMissing
    fun _processedAt(): JsonField<OffsetDateTime> = processedAt

    /**
     * Returns the raw JSON value of [receivedAt].
     *
     * Unlike [receivedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("received_at")
    @ExcludeMissing
    fun _receivedAt(): JsonField<OffsetDateTime> = receivedAt

    /**
     * Returns the raw JSON value of [senderName].
     *
     * Unlike [senderName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sender_name") @ExcludeMissing fun _senderName(): JsonField<String> = senderName

    /**
     * Returns the raw JSON value of [subject].
     *
     * Unlike [subject], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("subject") @ExcludeMissing fun _subject(): JsonField<String> = subject

    /**
     * Returns the raw JSON value of [toAddresses].
     *
     * Unlike [toAddresses], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("to_addresses")
    @ExcludeMissing
    fun _toAddresses(): JsonField<String> = toAddresses

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
         * Returns a mutable builder for constructing an instance of [InboundEmailResponse].
         *
         * The following fields are required:
         * ```java
         * .createdAt()
         * .id()
         * .messageId()
         * .senderEmail()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InboundEmailResponse]. */
    class Builder internal constructor() {

        private var createdAt: JsonField<OffsetDateTime>? = null
        private var id: JsonField<String>? = null
        private var messageId: JsonField<String>? = null
        private var senderEmail: JsonField<String>? = null
        private var attachmentCount: JsonField<Long> = JsonMissing.of()
        private var attachments: JsonField<MutableList<AttachmentInfo>>? = null
        private var bccAddresses: JsonField<String> = JsonMissing.of()
        private var ccAddresses: JsonField<String> = JsonMissing.of()
        private var documentId: JsonField<String> = JsonMissing.of()
        private var errorMessage: JsonField<String> = JsonMissing.of()
        private var processed: JsonField<Boolean> = JsonMissing.of()
        private var processedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var receivedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var senderName: JsonField<String> = JsonMissing.of()
        private var subject: JsonField<String> = JsonMissing.of()
        private var toAddresses: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(inboundEmailResponse: InboundEmailResponse) = apply {
            createdAt = inboundEmailResponse.createdAt
            id = inboundEmailResponse.id
            messageId = inboundEmailResponse.messageId
            senderEmail = inboundEmailResponse.senderEmail
            attachmentCount = inboundEmailResponse.attachmentCount
            attachments = inboundEmailResponse.attachments.map { it.toMutableList() }
            bccAddresses = inboundEmailResponse.bccAddresses
            ccAddresses = inboundEmailResponse.ccAddresses
            documentId = inboundEmailResponse.documentId
            errorMessage = inboundEmailResponse.errorMessage
            processed = inboundEmailResponse.processed
            processedAt = inboundEmailResponse.processedAt
            receivedAt = inboundEmailResponse.receivedAt
            senderName = inboundEmailResponse.senderName
            subject = inboundEmailResponse.subject
            toAddresses = inboundEmailResponse.toAddresses
            additionalProperties = inboundEmailResponse.additionalProperties.toMutableMap()
        }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun messageId(messageId: String) = messageId(JsonField.of(messageId))

        /**
         * Sets [Builder.messageId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.messageId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun messageId(messageId: JsonField<String>) = apply { this.messageId = messageId }

        fun senderEmail(senderEmail: String) = senderEmail(JsonField.of(senderEmail))

        /**
         * Sets [Builder.senderEmail] to an arbitrary JSON value.
         *
         * You should usually call [Builder.senderEmail] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun senderEmail(senderEmail: JsonField<String>) = apply { this.senderEmail = senderEmail }

        fun attachmentCount(attachmentCount: Long) = attachmentCount(JsonField.of(attachmentCount))

        /**
         * Sets [Builder.attachmentCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.attachmentCount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun attachmentCount(attachmentCount: JsonField<Long>) = apply {
            this.attachmentCount = attachmentCount
        }

        fun attachments(attachments: List<AttachmentInfo>) = attachments(JsonField.of(attachments))

        /**
         * Sets [Builder.attachments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.attachments] with a well-typed `List<AttachmentInfo>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun attachments(attachments: JsonField<List<AttachmentInfo>>) = apply {
            this.attachments = attachments.map { it.toMutableList() }
        }

        /**
         * Adds a single [AttachmentInfo] to [attachments].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAttachment(attachment: AttachmentInfo) = apply {
            attachments =
                (attachments ?: JsonField.of(mutableListOf())).also {
                    checkKnown("attachments", it).add(attachment)
                }
        }

        fun bccAddresses(bccAddresses: String?) = bccAddresses(JsonField.ofNullable(bccAddresses))

        /** Alias for calling [Builder.bccAddresses] with `bccAddresses.orElse(null)`. */
        fun bccAddresses(bccAddresses: Optional<String>) = bccAddresses(bccAddresses.getOrNull())

        /**
         * Sets [Builder.bccAddresses] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bccAddresses] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun bccAddresses(bccAddresses: JsonField<String>) = apply {
            this.bccAddresses = bccAddresses
        }

        fun ccAddresses(ccAddresses: String?) = ccAddresses(JsonField.ofNullable(ccAddresses))

        /** Alias for calling [Builder.ccAddresses] with `ccAddresses.orElse(null)`. */
        fun ccAddresses(ccAddresses: Optional<String>) = ccAddresses(ccAddresses.getOrNull())

        /**
         * Sets [Builder.ccAddresses] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ccAddresses] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ccAddresses(ccAddresses: JsonField<String>) = apply { this.ccAddresses = ccAddresses }

        fun documentId(documentId: String?) = documentId(JsonField.ofNullable(documentId))

        /** Alias for calling [Builder.documentId] with `documentId.orElse(null)`. */
        fun documentId(documentId: Optional<String>) = documentId(documentId.getOrNull())

        /**
         * Sets [Builder.documentId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.documentId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun documentId(documentId: JsonField<String>) = apply { this.documentId = documentId }

        fun errorMessage(errorMessage: String?) = errorMessage(JsonField.ofNullable(errorMessage))

        /** Alias for calling [Builder.errorMessage] with `errorMessage.orElse(null)`. */
        fun errorMessage(errorMessage: Optional<String>) = errorMessage(errorMessage.getOrNull())

        /**
         * Sets [Builder.errorMessage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.errorMessage] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun errorMessage(errorMessage: JsonField<String>) = apply {
            this.errorMessage = errorMessage
        }

        fun processed(processed: Boolean) = processed(JsonField.of(processed))

        /**
         * Sets [Builder.processed] to an arbitrary JSON value.
         *
         * You should usually call [Builder.processed] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun processed(processed: JsonField<Boolean>) = apply { this.processed = processed }

        fun processedAt(processedAt: OffsetDateTime?) =
            processedAt(JsonField.ofNullable(processedAt))

        /** Alias for calling [Builder.processedAt] with `processedAt.orElse(null)`. */
        fun processedAt(processedAt: Optional<OffsetDateTime>) =
            processedAt(processedAt.getOrNull())

        /**
         * Sets [Builder.processedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.processedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun processedAt(processedAt: JsonField<OffsetDateTime>) = apply {
            this.processedAt = processedAt
        }

        fun receivedAt(receivedAt: OffsetDateTime?) = receivedAt(JsonField.ofNullable(receivedAt))

        /** Alias for calling [Builder.receivedAt] with `receivedAt.orElse(null)`. */
        fun receivedAt(receivedAt: Optional<OffsetDateTime>) = receivedAt(receivedAt.getOrNull())

        /**
         * Sets [Builder.receivedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.receivedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun receivedAt(receivedAt: JsonField<OffsetDateTime>) = apply {
            this.receivedAt = receivedAt
        }

        fun senderName(senderName: String?) = senderName(JsonField.ofNullable(senderName))

        /** Alias for calling [Builder.senderName] with `senderName.orElse(null)`. */
        fun senderName(senderName: Optional<String>) = senderName(senderName.getOrNull())

        /**
         * Sets [Builder.senderName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.senderName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun senderName(senderName: JsonField<String>) = apply { this.senderName = senderName }

        fun subject(subject: String?) = subject(JsonField.ofNullable(subject))

        /** Alias for calling [Builder.subject] with `subject.orElse(null)`. */
        fun subject(subject: Optional<String>) = subject(subject.getOrNull())

        /**
         * Sets [Builder.subject] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subject] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun subject(subject: JsonField<String>) = apply { this.subject = subject }

        fun toAddresses(toAddresses: String?) = toAddresses(JsonField.ofNullable(toAddresses))

        /** Alias for calling [Builder.toAddresses] with `toAddresses.orElse(null)`. */
        fun toAddresses(toAddresses: Optional<String>) = toAddresses(toAddresses.getOrNull())

        /**
         * Sets [Builder.toAddresses] to an arbitrary JSON value.
         *
         * You should usually call [Builder.toAddresses] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun toAddresses(toAddresses: JsonField<String>) = apply { this.toAddresses = toAddresses }

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
         * Returns an immutable instance of [InboundEmailResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .createdAt()
         * .id()
         * .messageId()
         * .senderEmail()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InboundEmailResponse =
            InboundEmailResponse(
                checkRequired("createdAt", createdAt),
                checkRequired("id", id),
                checkRequired("messageId", messageId),
                checkRequired("senderEmail", senderEmail),
                attachmentCount,
                (attachments ?: JsonMissing.of()).map { it.toImmutable() },
                bccAddresses,
                ccAddresses,
                documentId,
                errorMessage,
                processed,
                processedAt,
                receivedAt,
                senderName,
                subject,
                toAddresses,
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
    fun validate(): InboundEmailResponse = apply {
        if (validated) {
            return@apply
        }

        createdAt()
        id()
        messageId()
        senderEmail()
        attachmentCount()
        attachments().ifPresent { it.forEach { it.validate() } }
        bccAddresses()
        ccAddresses()
        documentId()
        errorMessage()
        processed()
        processedAt()
        receivedAt()
        senderName()
        subject()
        toAddresses()
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
        (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (messageId.asKnown().isPresent) 1 else 0) +
            (if (senderEmail.asKnown().isPresent) 1 else 0) +
            (if (attachmentCount.asKnown().isPresent) 1 else 0) +
            (attachments.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (bccAddresses.asKnown().isPresent) 1 else 0) +
            (if (ccAddresses.asKnown().isPresent) 1 else 0) +
            (if (documentId.asKnown().isPresent) 1 else 0) +
            (if (errorMessage.asKnown().isPresent) 1 else 0) +
            (if (processed.asKnown().isPresent) 1 else 0) +
            (if (processedAt.asKnown().isPresent) 1 else 0) +
            (if (receivedAt.asKnown().isPresent) 1 else 0) +
            (if (senderName.asKnown().isPresent) 1 else 0) +
            (if (subject.asKnown().isPresent) 1 else 0) +
            (if (toAddresses.asKnown().isPresent) 1 else 0)

    /** Metadata for an attachment of an inbound email. */
    class AttachmentInfo
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val filename: JsonField<String>,
        private val contentType: JsonField<String>,
        private val size: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("filename")
            @ExcludeMissing
            filename: JsonField<String> = JsonMissing.of(),
            @JsonProperty("content_type")
            @ExcludeMissing
            contentType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("size") @ExcludeMissing size: JsonField<Long> = JsonMissing.of(),
        ) : this(filename, contentType, size, mutableMapOf())

        /**
         * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun filename(): String = filename.getRequired("filename")

        /**
         * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun contentType(): Optional<String> = contentType.getOptional("content_type")

        /**
         * @throws EInvoiceInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun size(): Optional<Long> = size.getOptional("size")

        /**
         * Returns the raw JSON value of [filename].
         *
         * Unlike [filename], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("filename") @ExcludeMissing fun _filename(): JsonField<String> = filename

        /**
         * Returns the raw JSON value of [contentType].
         *
         * Unlike [contentType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("content_type")
        @ExcludeMissing
        fun _contentType(): JsonField<String> = contentType

        /**
         * Returns the raw JSON value of [size].
         *
         * Unlike [size], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("size") @ExcludeMissing fun _size(): JsonField<Long> = size

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
             * Returns a mutable builder for constructing an instance of [AttachmentInfo].
             *
             * The following fields are required:
             * ```java
             * .filename()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AttachmentInfo]. */
        class Builder internal constructor() {

            private var filename: JsonField<String>? = null
            private var contentType: JsonField<String> = JsonMissing.of()
            private var size: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(attachmentInfo: AttachmentInfo) = apply {
                filename = attachmentInfo.filename
                contentType = attachmentInfo.contentType
                size = attachmentInfo.size
                additionalProperties = attachmentInfo.additionalProperties.toMutableMap()
            }

            fun filename(filename: String) = filename(JsonField.of(filename))

            /**
             * Sets [Builder.filename] to an arbitrary JSON value.
             *
             * You should usually call [Builder.filename] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun filename(filename: JsonField<String>) = apply { this.filename = filename }

            fun contentType(contentType: String?) = contentType(JsonField.ofNullable(contentType))

            /** Alias for calling [Builder.contentType] with `contentType.orElse(null)`. */
            fun contentType(contentType: Optional<String>) = contentType(contentType.getOrNull())

            /**
             * Sets [Builder.contentType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contentType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contentType(contentType: JsonField<String>) = apply {
                this.contentType = contentType
            }

            fun size(size: Long?) = size(JsonField.ofNullable(size))

            /**
             * Alias for [Builder.size].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun size(size: Long) = size(size as Long?)

            /** Alias for calling [Builder.size] with `size.orElse(null)`. */
            fun size(size: Optional<Long>) = size(size.getOrNull())

            /**
             * Sets [Builder.size] to an arbitrary JSON value.
             *
             * You should usually call [Builder.size] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun size(size: JsonField<Long>) = apply { this.size = size }

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
             * Returns an immutable instance of [AttachmentInfo].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .filename()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): AttachmentInfo =
                AttachmentInfo(
                    checkRequired("filename", filename),
                    contentType,
                    size,
                    additionalProperties.toMutableMap(),
                )
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
        fun validate(): AttachmentInfo = apply {
            if (validated) {
                return@apply
            }

            filename()
            contentType()
            size()
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
            (if (filename.asKnown().isPresent) 1 else 0) +
                (if (contentType.asKnown().isPresent) 1 else 0) +
                (if (size.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AttachmentInfo &&
                filename == other.filename &&
                contentType == other.contentType &&
                size == other.size &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(filename, contentType, size, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AttachmentInfo{filename=$filename, contentType=$contentType, size=$size, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InboundEmailResponse &&
            createdAt == other.createdAt &&
            id == other.id &&
            messageId == other.messageId &&
            senderEmail == other.senderEmail &&
            attachmentCount == other.attachmentCount &&
            attachments == other.attachments &&
            bccAddresses == other.bccAddresses &&
            ccAddresses == other.ccAddresses &&
            documentId == other.documentId &&
            errorMessage == other.errorMessage &&
            processed == other.processed &&
            processedAt == other.processedAt &&
            receivedAt == other.receivedAt &&
            senderName == other.senderName &&
            subject == other.subject &&
            toAddresses == other.toAddresses &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            createdAt,
            id,
            messageId,
            senderEmail,
            attachmentCount,
            attachments,
            bccAddresses,
            ccAddresses,
            documentId,
            errorMessage,
            processed,
            processedAt,
            receivedAt,
            senderName,
            subject,
            toAddresses,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InboundEmailResponse{createdAt=$createdAt, id=$id, messageId=$messageId, senderEmail=$senderEmail, attachmentCount=$attachmentCount, attachments=$attachments, bccAddresses=$bccAddresses, ccAddresses=$ccAddresses, documentId=$documentId, errorMessage=$errorMessage, processed=$processed, processedAt=$processedAt, receivedAt=$receivedAt, senderName=$senderName, subject=$subject, toAddresses=$toAddresses, additionalProperties=$additionalProperties}"
}
