// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.models.outbox

import com.e_invoice.api.core.Enum
import com.e_invoice.api.core.JsonField
import com.e_invoice.api.core.Params
import com.e_invoice.api.core.http.Headers
import com.e_invoice.api.core.http.QueryParams
import com.e_invoice.api.errors.EInvoiceInvalidDataException
import com.e_invoice.api.models.documents.DocumentType
import com.e_invoice.api.models.inbox.DocumentState
import com.fasterxml.jackson.annotation.JsonCreator
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieve a paginated list of draft documents with filtering options including state and text
 * search.
 */
@Deprecated("deprecated")
class OutboxListDraftDocumentsParams
private constructor(
    private val page: Long?,
    private val pageSize: Long?,
    private val search: String?,
    private val sortBy: SortBy?,
    private val sortOrder: SortOrder?,
    private val state: DocumentState?,
    private val type: DocumentType?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Page number */
    fun page(): Optional<Long> = Optional.ofNullable(page)

    /** Number of items per page */
    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /** Search in invoice number, seller/buyer names */
    fun search(): Optional<String> = Optional.ofNullable(search)

    /** Field to sort by */
    fun sortBy(): Optional<SortBy> = Optional.ofNullable(sortBy)

    /** Sort direction (asc/desc) */
    fun sortOrder(): Optional<SortOrder> = Optional.ofNullable(sortOrder)

    /** Filter by document state */
    fun state(): Optional<DocumentState> = Optional.ofNullable(state)

    /** Filter by document type */
    fun type(): Optional<DocumentType> = Optional.ofNullable(type)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): OutboxListDraftDocumentsParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [OutboxListDraftDocumentsParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OutboxListDraftDocumentsParams]. */
    class Builder internal constructor() {

        private var page: Long? = null
        private var pageSize: Long? = null
        private var search: String? = null
        private var sortBy: SortBy? = null
        private var sortOrder: SortOrder? = null
        private var state: DocumentState? = null
        private var type: DocumentType? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(outboxListDraftDocumentsParams: OutboxListDraftDocumentsParams) = apply {
            page = outboxListDraftDocumentsParams.page
            pageSize = outboxListDraftDocumentsParams.pageSize
            search = outboxListDraftDocumentsParams.search
            sortBy = outboxListDraftDocumentsParams.sortBy
            sortOrder = outboxListDraftDocumentsParams.sortOrder
            state = outboxListDraftDocumentsParams.state
            type = outboxListDraftDocumentsParams.type
            additionalHeaders = outboxListDraftDocumentsParams.additionalHeaders.toBuilder()
            additionalQueryParams = outboxListDraftDocumentsParams.additionalQueryParams.toBuilder()
        }

        /** Page number */
        fun page(page: Long?) = apply { this.page = page }

        /**
         * Alias for [Builder.page].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun page(page: Long) = page(page as Long?)

        /** Alias for calling [Builder.page] with `page.orElse(null)`. */
        fun page(page: Optional<Long>) = page(page.getOrNull())

        /** Number of items per page */
        fun pageSize(pageSize: Long?) = apply { this.pageSize = pageSize }

        /**
         * Alias for [Builder.pageSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageSize(pageSize: Long) = pageSize(pageSize as Long?)

        /** Alias for calling [Builder.pageSize] with `pageSize.orElse(null)`. */
        fun pageSize(pageSize: Optional<Long>) = pageSize(pageSize.getOrNull())

        /** Search in invoice number, seller/buyer names */
        fun search(search: String?) = apply { this.search = search }

        /** Alias for calling [Builder.search] with `search.orElse(null)`. */
        fun search(search: Optional<String>) = search(search.getOrNull())

        /** Field to sort by */
        fun sortBy(sortBy: SortBy?) = apply { this.sortBy = sortBy }

        /** Alias for calling [Builder.sortBy] with `sortBy.orElse(null)`. */
        fun sortBy(sortBy: Optional<SortBy>) = sortBy(sortBy.getOrNull())

        /** Sort direction (asc/desc) */
        fun sortOrder(sortOrder: SortOrder?) = apply { this.sortOrder = sortOrder }

        /** Alias for calling [Builder.sortOrder] with `sortOrder.orElse(null)`. */
        fun sortOrder(sortOrder: Optional<SortOrder>) = sortOrder(sortOrder.getOrNull())

        /** Filter by document state */
        fun state(state: DocumentState?) = apply { this.state = state }

        /** Alias for calling [Builder.state] with `state.orElse(null)`. */
        fun state(state: Optional<DocumentState>) = state(state.getOrNull())

        /** Filter by document type */
        fun type(type: DocumentType?) = apply { this.type = type }

        /** Alias for calling [Builder.type] with `type.orElse(null)`. */
        fun type(type: Optional<DocumentType>) = type(type.getOrNull())

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

        /**
         * Returns an immutable instance of [OutboxListDraftDocumentsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): OutboxListDraftDocumentsParams =
            OutboxListDraftDocumentsParams(
                page,
                pageSize,
                search,
                sortBy,
                sortOrder,
                state,
                type,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                page?.let { put("page", it.toString()) }
                pageSize?.let { put("page_size", it.toString()) }
                search?.let { put("search", it) }
                sortBy?.let { put("sort_by", it.toString()) }
                sortOrder?.let { put("sort_order", it.toString()) }
                state?.let { put("state", it.toString()) }
                type?.let { put("type", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /** Field to sort by */
    class SortBy @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val CREATED_AT = of("created_at")

            @JvmField val INVOICE_DATE = of("invoice_date")

            @JvmField val DUE_DATE = of("due_date")

            @JvmField val INVOICE_TOTAL = of("invoice_total")

            @JvmField val CUSTOMER_NAME = of("customer_name")

            @JvmField val VENDOR_NAME = of("vendor_name")

            @JvmField val INVOICE_ID = of("invoice_id")

            @JvmStatic fun of(value: String) = SortBy(JsonField.of(value))
        }

        /** An enum containing [SortBy]'s known values. */
        enum class Known {
            CREATED_AT,
            INVOICE_DATE,
            DUE_DATE,
            INVOICE_TOTAL,
            CUSTOMER_NAME,
            VENDOR_NAME,
            INVOICE_ID,
        }

        /**
         * An enum containing [SortBy]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [SortBy] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CREATED_AT,
            INVOICE_DATE,
            DUE_DATE,
            INVOICE_TOTAL,
            CUSTOMER_NAME,
            VENDOR_NAME,
            INVOICE_ID,
            /** An enum member indicating that [SortBy] was instantiated with an unknown value. */
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
                CREATED_AT -> Value.CREATED_AT
                INVOICE_DATE -> Value.INVOICE_DATE
                DUE_DATE -> Value.DUE_DATE
                INVOICE_TOTAL -> Value.INVOICE_TOTAL
                CUSTOMER_NAME -> Value.CUSTOMER_NAME
                VENDOR_NAME -> Value.VENDOR_NAME
                INVOICE_ID -> Value.INVOICE_ID
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
                CREATED_AT -> Known.CREATED_AT
                INVOICE_DATE -> Known.INVOICE_DATE
                DUE_DATE -> Known.DUE_DATE
                INVOICE_TOTAL -> Known.INVOICE_TOTAL
                CUSTOMER_NAME -> Known.CUSTOMER_NAME
                VENDOR_NAME -> Known.VENDOR_NAME
                INVOICE_ID -> Known.INVOICE_ID
                else -> throw EInvoiceInvalidDataException("Unknown SortBy: $value")
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
        fun validate(): SortBy = apply {
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

            return other is SortBy && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Sort direction (asc/desc) */
    class SortOrder @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ASC = of("asc")

            @JvmField val DESC = of("desc")

            @JvmStatic fun of(value: String) = SortOrder(JsonField.of(value))
        }

        /** An enum containing [SortOrder]'s known values. */
        enum class Known {
            ASC,
            DESC,
        }

        /**
         * An enum containing [SortOrder]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [SortOrder] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ASC,
            DESC,
            /**
             * An enum member indicating that [SortOrder] was instantiated with an unknown value.
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
                ASC -> Value.ASC
                DESC -> Value.DESC
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
                ASC -> Known.ASC
                DESC -> Known.DESC
                else -> throw EInvoiceInvalidDataException("Unknown SortOrder: $value")
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
        fun validate(): SortOrder = apply {
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

            return other is SortOrder && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OutboxListDraftDocumentsParams &&
            page == other.page &&
            pageSize == other.pageSize &&
            search == other.search &&
            sortBy == other.sortBy &&
            sortOrder == other.sortOrder &&
            state == other.state &&
            type == other.type &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            page,
            pageSize,
            search,
            sortBy,
            sortOrder,
            state,
            type,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "OutboxListDraftDocumentsParams{page=$page, pageSize=$pageSize, search=$search, sortBy=$sortBy, sortOrder=$sortOrder, state=$state, type=$type, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
