// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.models.inbox

import com.e_invoice.api.core.Params
import com.e_invoice.api.core.http.Headers
import com.e_invoice.api.core.http.QueryParams
import com.e_invoice.api.models.documents.DocumentType
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Retrieve a paginated list of received documents with filtering options. */
class InboxListParams
private constructor(
    private val dateFrom: OffsetDateTime?,
    private val dateTo: OffsetDateTime?,
    private val page: Long?,
    private val pageSize: Long?,
    private val search: String?,
    private val sender: String?,
    private val state: DocumentState?,
    private val type: DocumentType?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Filter by issue date (from) */
    fun dateFrom(): Optional<OffsetDateTime> = Optional.ofNullable(dateFrom)

    /** Filter by issue date (to) */
    fun dateTo(): Optional<OffsetDateTime> = Optional.ofNullable(dateTo)

    /** Page number */
    fun page(): Optional<Long> = Optional.ofNullable(page)

    /** Number of items per page */
    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /** Search in invoice number, seller/buyer names */
    fun search(): Optional<String> = Optional.ofNullable(search)

    /** Filter by sender ID */
    fun sender(): Optional<String> = Optional.ofNullable(sender)

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

        @JvmStatic fun none(): InboxListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [InboxListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InboxListParams]. */
    class Builder internal constructor() {

        private var dateFrom: OffsetDateTime? = null
        private var dateTo: OffsetDateTime? = null
        private var page: Long? = null
        private var pageSize: Long? = null
        private var search: String? = null
        private var sender: String? = null
        private var state: DocumentState? = null
        private var type: DocumentType? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(inboxListParams: InboxListParams) = apply {
            dateFrom = inboxListParams.dateFrom
            dateTo = inboxListParams.dateTo
            page = inboxListParams.page
            pageSize = inboxListParams.pageSize
            search = inboxListParams.search
            sender = inboxListParams.sender
            state = inboxListParams.state
            type = inboxListParams.type
            additionalHeaders = inboxListParams.additionalHeaders.toBuilder()
            additionalQueryParams = inboxListParams.additionalQueryParams.toBuilder()
        }

        /** Filter by issue date (from) */
        fun dateFrom(dateFrom: OffsetDateTime?) = apply { this.dateFrom = dateFrom }

        /** Alias for calling [Builder.dateFrom] with `dateFrom.orElse(null)`. */
        fun dateFrom(dateFrom: Optional<OffsetDateTime>) = dateFrom(dateFrom.getOrNull())

        /** Filter by issue date (to) */
        fun dateTo(dateTo: OffsetDateTime?) = apply { this.dateTo = dateTo }

        /** Alias for calling [Builder.dateTo] with `dateTo.orElse(null)`. */
        fun dateTo(dateTo: Optional<OffsetDateTime>) = dateTo(dateTo.getOrNull())

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

        /** Filter by sender ID */
        fun sender(sender: String?) = apply { this.sender = sender }

        /** Alias for calling [Builder.sender] with `sender.orElse(null)`. */
        fun sender(sender: Optional<String>) = sender(sender.getOrNull())

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
         * Returns an immutable instance of [InboxListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): InboxListParams =
            InboxListParams(
                dateFrom,
                dateTo,
                page,
                pageSize,
                search,
                sender,
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
                dateFrom?.let {
                    put("date_from", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                dateTo?.let { put("date_to", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)) }
                page?.let { put("page", it.toString()) }
                pageSize?.let { put("page_size", it.toString()) }
                search?.let { put("search", it) }
                sender?.let { put("sender", it) }
                state?.let { put("state", it.toString()) }
                type?.let { put("type", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InboxListParams && dateFrom == other.dateFrom && dateTo == other.dateTo && page == other.page && pageSize == other.pageSize && search == other.search && sender == other.sender && state == other.state && type == other.type && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(dateFrom, dateTo, page, pageSize, search, sender, state, type, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "InboxListParams{dateFrom=$dateFrom, dateTo=$dateTo, page=$page, pageSize=$pageSize, search=$search, sender=$sender, state=$state, type=$type, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
