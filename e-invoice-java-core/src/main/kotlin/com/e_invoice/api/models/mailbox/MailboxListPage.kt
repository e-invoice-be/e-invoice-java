package com.e_invoice.api.models.mailbox

import com.e_invoice.api.core.AutoPager
import com.e_invoice.api.core.Page
import com.e_invoice.api.core.checkRequired
import com.e_invoice.api.services.blocking.MailboxService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see MailboxService.list */
class MailboxListPage
private constructor(
    private val service: MailboxService,
    private val params: MailboxListParams,
    private val response: PaginatedInboundEmailResponse,
) : Page<InboundEmailResponse> {

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

    override fun nextPage(): MailboxListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<InboundEmailResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): MailboxListParams = params

    /** The response that this page was parsed from. */
    fun response(): PaginatedInboundEmailResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [MailboxListPage].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MailboxListPage]. */
    class Builder internal constructor() {

        private var service: MailboxService? = null
        private var params: MailboxListParams? = null
        private var response: PaginatedInboundEmailResponse? = null

        @JvmSynthetic
        internal fun from(mailboxListPage: MailboxListPage) = apply {
            service = mailboxListPage.service
            params = mailboxListPage.params
            response = mailboxListPage.response
        }

        fun service(service: MailboxService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: MailboxListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PaginatedInboundEmailResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [MailboxListPage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MailboxListPage =
            MailboxListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MailboxListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "MailboxListPage{service=$service, params=$params, response=$response}"
}
