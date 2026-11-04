package com.e_invoice.api.models.mailbox

import com.e_invoice.api.core.AutoPagerAsync
import com.e_invoice.api.core.PageAsync
import com.e_invoice.api.core.checkRequired
import com.e_invoice.api.services.async.MailboxServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see MailboxServiceAsync.list */
class MailboxListPageAsync
private constructor(
    private val service: MailboxServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: MailboxListParams,
    private val response: PaginatedInboundEmailResponse,
) : PageAsync<InboundEmailResponse> {

    /**
     * Delegates to [PaginatedInboundEmailResponse], but gracefully handles missing data.
     *
     * @see PaginatedInboundEmailResponse.items
     */
    override fun items(): List<InboundEmailResponse> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [PaginatedInboundEmailResponse], but gracefully handles missing data.
     *
     * @see PaginatedInboundEmailResponse.page
     */
    fun page(): Optional<Long> = response._page().getOptional("page")

    /**
     * Delegates to [PaginatedInboundEmailResponse], but gracefully handles missing data.
     *
     * @see PaginatedInboundEmailResponse.pageSize
     */
    fun pageSize(): Optional<Long> = response._pageSize().getOptional("page_size")

    /**
     * Delegates to [PaginatedInboundEmailResponse], but gracefully handles missing data.
     *
     * @see PaginatedInboundEmailResponse.pages
     */
    fun pages(): Optional<Long> = response._pages().getOptional("pages")

    /**
     * Delegates to [PaginatedInboundEmailResponse], but gracefully handles missing data.
     *
     * @see PaginatedInboundEmailResponse.total
     */
    fun total(): Optional<Long> = response._total().getOptional("total")

    /**
     * Delegates to [PaginatedInboundEmailResponse], but gracefully handles missing data.
     *
     * @see PaginatedInboundEmailResponse.hasNextPage
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

    fun nextPageParams(): MailboxListParams {
        val pageNumber = page().getOrNull() ?: params.page().getOrDefault(1)
        return params.toBuilder().page(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<MailboxListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<InboundEmailResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): MailboxListParams = params

    /** The response that this page was parsed from. */
    fun response(): PaginatedInboundEmailResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [MailboxListPageAsync].
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

    /** A builder for [MailboxListPageAsync]. */
    class Builder internal constructor() {

        private var service: MailboxServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: MailboxListParams? = null
        private var response: PaginatedInboundEmailResponse? = null

        @JvmSynthetic
        internal fun from(mailboxListPageAsync: MailboxListPageAsync) = apply {
            service = mailboxListPageAsync.service
            streamHandlerExecutor = mailboxListPageAsync.streamHandlerExecutor
            params = mailboxListPageAsync.params
            response = mailboxListPageAsync.response
        }

        fun service(service: MailboxServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: MailboxListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PaginatedInboundEmailResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [MailboxListPageAsync].
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
        fun build(): MailboxListPageAsync =
            MailboxListPageAsync(
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

        return other is MailboxListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "MailboxListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
