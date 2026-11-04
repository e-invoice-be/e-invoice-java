package com.e_invoice.api.models.drafts

import com.e_invoice.api.core.AutoPager
import com.e_invoice.api.core.Page
import com.e_invoice.api.core.checkRequired
import com.e_invoice.api.models.documents.DocumentResponse
import com.e_invoice.api.models.inbox.PaginatedDocumentResponse
import com.e_invoice.api.services.blocking.DraftService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see DraftService.list */
class DraftListPage
private constructor(
    private val service: DraftService,
    private val params: DraftListParams,
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

    override fun nextPage(): DraftListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<DocumentResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): DraftListParams = params

    /** The response that this page was parsed from. */
    fun response(): PaginatedDocumentResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DraftListPage].
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

    /** A builder for [DraftListPage]. */
    class Builder internal constructor() {

        private var service: DraftService? = null
        private var params: DraftListParams? = null
        private var response: PaginatedDocumentResponse? = null

        @JvmSynthetic
        internal fun from(draftListPage: DraftListPage) = apply {
            service = draftListPage.service
            params = draftListPage.params
            response = draftListPage.response
        }

        fun service(service: DraftService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: DraftListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PaginatedDocumentResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [DraftListPage].
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
        fun build(): DraftListPage =
            DraftListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DraftListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "DraftListPage{service=$service, params=$params, response=$response}"
}
