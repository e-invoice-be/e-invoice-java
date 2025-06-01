// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.models.outbox

import com.e_invoice.api.core.AutoPagerAsync
import com.e_invoice.api.core.PageAsync
import com.e_invoice.api.core.checkRequired
import com.e_invoice.api.models.documents.DocumentResponse
import com.e_invoice.api.models.inbox.PaginatedDocumentResponse
import com.e_invoice.api.services.async.OutboxServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see [OutboxServiceAsync.listReceivedDocuments] */
class OutboxListReceivedDocumentsPageAsync
private constructor(
    private val service: OutboxServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: OutboxListReceivedDocumentsParams,
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

    fun nextPageParams(): OutboxListReceivedDocumentsParams {
        val pageNumber = params.page().getOrDefault(1)
        return params.toBuilder().page(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<OutboxListReceivedDocumentsPageAsync> =
        service.listReceivedDocuments(nextPageParams())

    fun autoPager(): AutoPagerAsync<DocumentResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): OutboxListReceivedDocumentsParams = params

    /** The response that this page was parsed from. */
    fun response(): PaginatedDocumentResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [OutboxListReceivedDocumentsPageAsync].
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

    /** A builder for [OutboxListReceivedDocumentsPageAsync]. */
    class Builder internal constructor() {

        private var service: OutboxServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: OutboxListReceivedDocumentsParams? = null
        private var response: PaginatedDocumentResponse? = null

        @JvmSynthetic
        internal fun from(
            outboxListReceivedDocumentsPageAsync: OutboxListReceivedDocumentsPageAsync
        ) = apply {
            service = outboxListReceivedDocumentsPageAsync.service
            streamHandlerExecutor = outboxListReceivedDocumentsPageAsync.streamHandlerExecutor
            params = outboxListReceivedDocumentsPageAsync.params
            response = outboxListReceivedDocumentsPageAsync.response
        }

        fun service(service: OutboxServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: OutboxListReceivedDocumentsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PaginatedDocumentResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [OutboxListReceivedDocumentsPageAsync].
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
        fun build(): OutboxListReceivedDocumentsPageAsync =
            OutboxListReceivedDocumentsPageAsync(
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

        return /* spotless:off */ other is OutboxListReceivedDocumentsPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, response) /* spotless:on */

    override fun toString() =
        "OutboxListReceivedDocumentsPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
