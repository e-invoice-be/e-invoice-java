// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.models.inbox

import com.e_invoice.api.core.AutoPager
import com.e_invoice.api.core.Page
import com.e_invoice.api.core.checkRequired
import com.e_invoice.api.models.documents.DocumentResponse
import com.e_invoice.api.services.blocking.InboxService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see InboxService.listInvoices */
class InboxListInvoicesPage
private constructor(
    private val service: InboxService,
    private val params: InboxListInvoicesParams,
    private val response: PaginatedDocumentResponse,
) : Page<DocumentResponse> {

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
     * @see PaginatedDocumentResponse.total
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

    override fun nextPage(): InboxListInvoicesPage = service.listInvoices(nextPageParams())

    fun autoPager(): AutoPager<DocumentResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): InboxListInvoicesParams = params

    /** The response that this page was parsed from. */
    fun response(): PaginatedDocumentResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [InboxListInvoicesPage].
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

    /** A builder for [InboxListInvoicesPage]. */
    class Builder internal constructor() {

        private var service: InboxService? = null
        private var params: InboxListInvoicesParams? = null
        private var response: PaginatedDocumentResponse? = null

        @JvmSynthetic
        internal fun from(inboxListInvoicesPage: InboxListInvoicesPage) = apply {
            service = inboxListInvoicesPage.service
            params = inboxListInvoicesPage.params
            response = inboxListInvoicesPage.response
        }

        fun service(service: InboxService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: InboxListInvoicesParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PaginatedDocumentResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [InboxListInvoicesPage].
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
        fun build(): InboxListInvoicesPage =
            InboxListInvoicesPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InboxListInvoicesPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "InboxListInvoicesPage{service=$service, params=$params, response=$response}"
}
