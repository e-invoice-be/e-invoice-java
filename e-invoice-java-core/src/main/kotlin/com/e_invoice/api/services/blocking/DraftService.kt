package com.e_invoice.api.services.blocking

import com.e_invoice.api.core.ClientOptions
import com.e_invoice.api.core.RequestOptions
import com.e_invoice.api.core.http.HttpResponseFor
import com.e_invoice.api.models.drafts.DraftListPage
import com.e_invoice.api.models.drafts.DraftListParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface DraftService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DraftService

    /**
     * Retrieve a paginated list of draft documents with filtering options including state and text
     * search.
     */
    fun list(): DraftListPage = list(DraftListParams.none())

    /** @see list */
    fun list(
        params: DraftListParams = DraftListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DraftListPage

    /** @see list */
    fun list(params: DraftListParams = DraftListParams.none()): DraftListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): DraftListPage =
        list(DraftListParams.none(), requestOptions)

    /** A view of [DraftService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): DraftService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/drafts/`, but is otherwise the same as
         * [DraftService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<DraftListPage> = list(DraftListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: DraftListParams = DraftListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DraftListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: DraftListParams = DraftListParams.none()): HttpResponseFor<DraftListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<DraftListPage> =
            list(DraftListParams.none(), requestOptions)
    }
}
