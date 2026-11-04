package com.e_invoice.api.models.drafts

import com.e_invoice.api.core.AutoPagerAsync
import com.e_invoice.api.core.PageAsync
import com.e_invoice.api.core.checkRequired
import com.e_invoice.api.models.documents.DocumentResponse
import com.e_invoice.api.models.inbox.PaginatedDocumentResponse
import com.e_invoice.api.services.async.DraftServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see DraftServiceAsync.list */
class DraftListPageAsync
private constructor(
    private val service: DraftServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: DraftListParams,
    private val response: PaginatedDocumentResponse,
) : PageAsync<DocumentResponse> {

    /**
     * Delegates to [PaginatedDocumentResponse], but gracefully handles missing data.
     *
     * @see PaginatedDocumentResponse.items
     */
    override fun items(): List<DocumentResponse> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [PaginatedDocumentResponse], but gracefully handles missing data.
     *
     * @see PaginatedDocumentResponse.page
     */
    fun page(): Optional<Long> = response._page().getOptional("page")

    /**
     * Delegates to [PaginatedDocumentResponse], but gracefully handles missing data.
     *
     * @see PaginatedDocumentResponse.pageSize
     */
    fun pageSize(): Optional<Long> = response._pageSize().getOptional("page_size")

    /**
     * Delegates to [PaginatedDocumentResponse], but gracefully handles missing data.
     *
     * @see PaginatedDocumentResponse.pages
     */
    fun pages(): Optional<Long> = response._pages().getOptional("pages")

    /**
     * Delegates to [PaginatedDocumentResponse], but gracefully handles missing data.
     *
     * @see PaginatedDocumentResponse.total
     */
    fun total(): Optional<Long> = response._total().getOptional("total")

    /**
     * Delegates to [PaginatedDocumentResponse], but gracefully handles missing data.
     *
     * @see PaginatedDocumentResponse.hasNextPage
     */
    fun hasNextPageField(): Optional<Boolean> = response._hasNextPage().getOptional("has_next_page")

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        hasNextPageField().getOrNull()?.let {
            return it
        }

        val pageNumber = page().getOrDefault(1)
        val pageCount = pages().getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): DraftListParams {
        val pageNumber = page().getOrNull() ?: params.page().getOrDefault(1)
        return params.toBuilder().page(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<DraftListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<DocumentResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): DraftListParams = params

    /** The response that this page was parsed from. */
    fun response(): PaginatedDocumentResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DraftListPageAsync].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DraftListPageAsync]. */
    class Builder internal constructor() {

        private var service: DraftServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: DraftListParams? = null
        private var response: PaginatedDocumentResponse? = null

        @JvmSynthetic
        internal fun from(draftListPageAsync: DraftListPageAsync) = apply {
            service = draftListPageAsync.service
            streamHandlerExecutor = draftListPageAsync.streamHandlerExecutor
            params = draftListPageAsync.params
            response = draftListPageAsync.response
        }

        fun service(service: DraftServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: DraftListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PaginatedDocumentResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [DraftListPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DraftListPageAsync =
            DraftListPageAsync(
                checkRequired("service", service),
                checkRequired("streamHandlerExecutor", streamHandlerExecutor),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DraftListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "DraftListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
