// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.models.documents

import com.e_invoice.api.core.JsonValue
import com.e_invoice.api.core.Params
import com.e_invoice.api.core.http.Headers
import com.e_invoice.api.core.http.QueryParams
import com.e_invoice.api.core.toImmutable
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Send an invoice or credit note via Peppol */
class DocumentSendParams
private constructor(
    private val documentId: String?,
    private val email: String?,
    private val receiverPeppolId: String?,
    private val receiverPeppolScheme: String?,
    private val senderPeppolId: String?,
    private val senderPeppolScheme: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) : Params {

    fun documentId(): Optional<String> = Optional.ofNullable(documentId)

    fun email(): Optional<String> = Optional.ofNullable(email)

    fun receiverPeppolId(): Optional<String> = Optional.ofNullable(receiverPeppolId)

    fun receiverPeppolScheme(): Optional<String> = Optional.ofNullable(receiverPeppolScheme)

    fun senderPeppolId(): Optional<String> = Optional.ofNullable(senderPeppolId)

    fun senderPeppolScheme(): Optional<String> = Optional.ofNullable(senderPeppolScheme)

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): DocumentSendParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [DocumentSendParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DocumentSendParams]. */
    class Builder internal constructor() {

        private var documentId: String? = null
        private var email: String? = null
        private var receiverPeppolId: String? = null
        private var receiverPeppolScheme: String? = null
        private var senderPeppolId: String? = null
        private var senderPeppolScheme: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(documentSendParams: DocumentSendParams) = apply {
            documentId = documentSendParams.documentId
            email = documentSendParams.email
            receiverPeppolId = documentSendParams.receiverPeppolId
            receiverPeppolScheme = documentSendParams.receiverPeppolScheme
            senderPeppolId = documentSendParams.senderPeppolId
            senderPeppolScheme = documentSendParams.senderPeppolScheme
            additionalHeaders = documentSendParams.additionalHeaders.toBuilder()
            additionalQueryParams = documentSendParams.additionalQueryParams.toBuilder()
            additionalBodyProperties = documentSendParams.additionalBodyProperties.toMutableMap()
        }

        fun documentId(documentId: String?) = apply { this.documentId = documentId }

        /** Alias for calling [Builder.documentId] with `documentId.orElse(null)`. */
        fun documentId(documentId: Optional<String>) = documentId(documentId.getOrNull())

        fun email(email: String?) = apply { this.email = email }

        /** Alias for calling [Builder.email] with `email.orElse(null)`. */
        fun email(email: Optional<String>) = email(email.getOrNull())

        fun receiverPeppolId(receiverPeppolId: String?) = apply {
            this.receiverPeppolId = receiverPeppolId
        }

        /** Alias for calling [Builder.receiverPeppolId] with `receiverPeppolId.orElse(null)`. */
        fun receiverPeppolId(receiverPeppolId: Optional<String>) =
            receiverPeppolId(receiverPeppolId.getOrNull())

        fun receiverPeppolScheme(receiverPeppolScheme: String?) = apply {
            this.receiverPeppolScheme = receiverPeppolScheme
        }

        /**
         * Alias for calling [Builder.receiverPeppolScheme] with
         * `receiverPeppolScheme.orElse(null)`.
         */
        fun receiverPeppolScheme(receiverPeppolScheme: Optional<String>) =
            receiverPeppolScheme(receiverPeppolScheme.getOrNull())

        fun senderPeppolId(senderPeppolId: String?) = apply { this.senderPeppolId = senderPeppolId }

        /** Alias for calling [Builder.senderPeppolId] with `senderPeppolId.orElse(null)`. */
        fun senderPeppolId(senderPeppolId: Optional<String>) =
            senderPeppolId(senderPeppolId.getOrNull())

        fun senderPeppolScheme(senderPeppolScheme: String?) = apply {
            this.senderPeppolScheme = senderPeppolScheme
        }

        /**
         * Alias for calling [Builder.senderPeppolScheme] with `senderPeppolScheme.orElse(null)`.
         */
        fun senderPeppolScheme(senderPeppolScheme: Optional<String>) =
            senderPeppolScheme(senderPeppolScheme.getOrNull())

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        /**
         * Returns an immutable instance of [DocumentSendParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): DocumentSendParams =
            DocumentSendParams(
                documentId,
                email,
                receiverPeppolId,
                receiverPeppolScheme,
                senderPeppolId,
                senderPeppolScheme,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    fun _body(): Optional<Map<String, JsonValue>> =
        Optional.ofNullable(additionalBodyProperties.ifEmpty { null })

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> documentId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                email?.let { put("email", it) }
                receiverPeppolId?.let { put("receiver_peppol_id", it) }
                receiverPeppolScheme?.let { put("receiver_peppol_scheme", it) }
                senderPeppolId?.let { put("sender_peppol_id", it) }
                senderPeppolScheme?.let { put("sender_peppol_scheme", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DocumentSendParams && documentId == other.documentId && email == other.email && receiverPeppolId == other.receiverPeppolId && receiverPeppolScheme == other.receiverPeppolScheme && senderPeppolId == other.senderPeppolId && senderPeppolScheme == other.senderPeppolScheme && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(documentId, email, receiverPeppolId, receiverPeppolScheme, senderPeppolId, senderPeppolScheme, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "DocumentSendParams{documentId=$documentId, email=$email, receiverPeppolId=$receiverPeppolId, receiverPeppolScheme=$receiverPeppolScheme, senderPeppolId=$senderPeppolId, senderPeppolScheme=$senderPeppolScheme, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
