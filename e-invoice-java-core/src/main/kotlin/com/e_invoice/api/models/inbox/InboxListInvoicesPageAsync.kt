// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.models.inbox

import com.e_invoice.api.core.AutoPagerAsync
import com.e_invoice.api.core.PageAsync
import com.e_invoice.api.core.checkRequired
import com.e_invoice.api.models.documents.DocumentResponse
import com.e_invoice.api.services.async.InboxServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see [InboxServiceAsync.listInvoices] */
class InboxListInvoicesPageAsync
private constructor(
    private val service: InboxServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: InboxListInvoicesParams,
    private val response: PaginatedDocumentResponse,
) : PageAsync<DocumentResponse> {

    /**
     * Delegates to [PaginatedDocumentResponse], but gracefully handles missing data.
     *
     * @see [PaginatedDocumentResponse.items]
     */
    override fun items(): List<DocumentResponse> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [PaginatedDocumentResponse], but gracefully handles missing data.
     *
     * @see [PaginatedDocumentResponse.page]
     */
    fun page(): Optional<Long> = response._page().getOptional("page")

    /**
     * Delegates to [PaginatedDocumentResponse], but gracefully handles missing data.
     *
     * @see [PaginatedDocumentResponse.pageSize]
     */
    fun pageSize(): Optional<Long> = response._pageSize().getOptional("page_size")

    /**
     * Delegates to [PaginatedDocumentResponse], but gracefully handles missing data.
     *
     * @see [PaginatedDocumentResponse.total]
     */
    fun total(): Optional<Long> = response._total().getOptional("total")

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber = page().getOrDefault(1)
        val pageCount = total().getOrDefault(Long.MAX_VALUE)
        return pageNumber < pageCount
    }

    fun nextPageParams(): InboxListInvoicesParams {
        val pageNumber = params.page().getOrDefault(1)
        return params.toBuilder().page(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<InboxListInvoicesPageAsync> =
        service.listInvoices(nextPageParams())

    fun autoPager(): AutoPagerAsync<DocumentResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): InboxListInvoicesParams = params

    /** The response that this page was parsed from. */
    fun response(): PaginatedDocumentResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [InboxListInvoicesPageAsync].
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

    /** A builder for [InboxListInvoicesPageAsync]. */
    class Builder internal constructor() {

        private var service: InboxServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: InboxListInvoicesParams? = null
        private var response: PaginatedDocumentResponse? = null

        @JvmSynthetic
        internal fun from(inboxListInvoicesPageAsync: InboxListInvoicesPageAsync) = apply {
            service = inboxListInvoicesPageAsync.service
            streamHandlerExecutor = inboxListInvoicesPageAsync.streamHandlerExecutor
            params = inboxListInvoicesPageAsync.params
            response = inboxListInvoicesPageAsync.response
        }

        fun service(service: InboxServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: InboxListInvoicesParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PaginatedDocumentResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [InboxListInvoicesPageAsync].
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
        fun build(): InboxListInvoicesPageAsync =
            InboxListInvoicesPageAsync(
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

        return /* spotless:off */ other is InboxListInvoicesPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, response) /* spotless:on */

    override fun toString() =
        "InboxListInvoicesPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
