package com.e_invoice.api.services.async

import com.e_invoice.api.core.ClientOptions
import com.e_invoice.api.core.RequestOptions
import com.e_invoice.api.core.http.HttpResponseFor
import com.e_invoice.api.models.stats.StatsResponse
import com.e_invoice.api.models.stats.StatsRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface StatsServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): StatsServiceAsync

    /**
     * Retrieve usage statistics for billing purposes. Returns statistics for document sent and
     * document received actions, grouped by aggregation period (day/week/month). If no date
     * parameters are provided, returns daily stats for all available data.
     */
    fun retrieve(): CompletableFuture<StatsResponse> = retrieve(StatsRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        params: StatsRetrieveParams = StatsRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<StatsResponse>

    /** @see retrieve */
    fun retrieve(
        params: StatsRetrieveParams = StatsRetrieveParams.none()
    ): CompletableFuture<StatsResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(requestOptions: RequestOptions): CompletableFuture<StatsResponse> =
        retrieve(StatsRetrieveParams.none(), requestOptions)

    /** A view of [StatsServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): StatsServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/stats`, but is otherwise the same as
         * [StatsServiceAsync.retrieve].
         */
        fun retrieve(): CompletableFuture<HttpResponseFor<StatsResponse>> =
            retrieve(StatsRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            params: StatsRetrieveParams = StatsRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StatsResponse>>

        /** @see retrieve */
        fun retrieve(
            params: StatsRetrieveParams = StatsRetrieveParams.none()
        ): CompletableFuture<HttpResponseFor<StatsResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<StatsResponse>> =
            retrieve(StatsRetrieveParams.none(), requestOptions)
    }
}
