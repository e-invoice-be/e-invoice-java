package com.e_invoice.api.services.async

import com.e_invoice.api.core.ClientOptions
import com.e_invoice.api.core.RequestOptions
import com.e_invoice.api.core.http.HttpResponseFor
import com.e_invoice.api.models.drafts.DraftListPageAsync
import com.e_invoice.api.models.drafts.DraftListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface DraftServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DraftServiceAsync

    /**
     * Retrieve a paginated list of draft documents with filtering options including state and text
     * search.
     */
    fun list(): CompletableFuture<DraftListPageAsync> = list(DraftListParams.none())

    /** @see list */
    fun list(
        params: DraftListParams = DraftListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DraftListPageAsync>

    /** @see list */
    fun list(
        params: DraftListParams = DraftListParams.none()
    ): CompletableFuture<DraftListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<DraftListPageAsync> =
        list(DraftListParams.none(), requestOptions)

    /** A view of [DraftServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DraftServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/drafts/`, but is otherwise the same as
         * [DraftServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<DraftListPageAsync>> =
            list(DraftListParams.none())

        /** @see list */
        fun list(
            params: DraftListParams = DraftListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DraftListPageAsync>>

        /** @see list */
        fun list(
            params: DraftListParams = DraftListParams.none()
        ): CompletableFuture<HttpResponseFor<DraftListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<DraftListPageAsync>> =
            list(DraftListParams.none(), requestOptions)
    }
}
