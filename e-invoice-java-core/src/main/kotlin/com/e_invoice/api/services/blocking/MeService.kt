// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.services.blocking

import com.e_invoice.api.core.ClientOptions
import com.e_invoice.api.core.RequestOptions
import com.e_invoice.api.core.http.HttpResponseFor
import com.e_invoice.api.models.me.MeRetrieveParams
import com.e_invoice.api.models.me.MeRetrieveResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface MeService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MeService

    /** Retrieve information about your account. */
    fun retrieve(): MeRetrieveResponse = retrieve(MeRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        params: MeRetrieveParams = MeRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MeRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: MeRetrieveParams = MeRetrieveParams.none()): MeRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(requestOptions: RequestOptions): MeRetrieveResponse =
        retrieve(MeRetrieveParams.none(), requestOptions)

    /** A view of [MeService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): MeService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/me/`, but is otherwise the same as
         * [MeService.retrieve].
         */
        @MustBeClosed
        fun retrieve(): HttpResponseFor<MeRetrieveResponse> = retrieve(MeRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: MeRetrieveParams = MeRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MeRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: MeRetrieveParams = MeRetrieveParams.none()
        ): HttpResponseFor<MeRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(requestOptions: RequestOptions): HttpResponseFor<MeRetrieveResponse> =
            retrieve(MeRetrieveParams.none(), requestOptions)
    }
}
