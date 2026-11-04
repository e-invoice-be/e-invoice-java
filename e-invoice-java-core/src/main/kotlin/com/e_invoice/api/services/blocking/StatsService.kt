package com.e_invoice.api.services.blocking

import com.e_invoice.api.core.ClientOptions
import com.e_invoice.api.core.RequestOptions
import com.e_invoice.api.core.http.HttpResponseFor
import com.e_invoice.api.models.stats.StatsResponse
import com.e_invoice.api.models.stats.StatsRetrieveParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface StatsService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): StatsService

    /**
     * Retrieve usage statistics for billing purposes. Returns statistics for document sent and
     * document received actions, grouped by aggregation period (day/week/month). If no date
     * parameters are provided, returns daily stats for all available data.
     */
    fun retrieve(): StatsResponse = retrieve(StatsRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        params: StatsRetrieveParams = StatsRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StatsResponse

    /** @see retrieve */
    fun retrieve(params: StatsRetrieveParams = StatsRetrieveParams.none()): StatsResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(requestOptions: RequestOptions): StatsResponse =
        retrieve(StatsRetrieveParams.none(), requestOptions)

    /** A view of [StatsService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): StatsService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/stats`, but is otherwise the same as
         * [StatsService.retrieve].
         */
        @MustBeClosed
        fun retrieve(): HttpResponseFor<StatsResponse> = retrieve(StatsRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: StatsRetrieveParams = StatsRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StatsResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: StatsRetrieveParams = StatsRetrieveParams.none()
        ): HttpResponseFor<StatsResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(requestOptions: RequestOptions): HttpResponseFor<StatsResponse> =
            retrieve(StatsRetrieveParams.none(), requestOptions)
    }
}
