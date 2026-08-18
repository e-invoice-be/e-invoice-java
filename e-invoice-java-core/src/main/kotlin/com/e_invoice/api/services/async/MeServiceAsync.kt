// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.services.async

import com.e_invoice.api.core.ClientOptions
import com.e_invoice.api.core.RequestOptions
import com.e_invoice.api.core.http.HttpResponseFor
import com.e_invoice.api.models.me.MeRetrieveParams
import com.e_invoice.api.models.me.MeRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface MeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MeServiceAsync

    /** Retrieve information about your account. */
    fun retrieve(): CompletableFuture<MeRetrieveResponse> = retrieve(MeRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        params: MeRetrieveParams = MeRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MeRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: MeRetrieveParams = MeRetrieveParams.none()
    ): CompletableFuture<MeRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(requestOptions: RequestOptions): CompletableFuture<MeRetrieveResponse> =
        retrieve(MeRetrieveParams.none(), requestOptions)

    /** A view of [MeServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): MeServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/me/`, but is otherwise the same as
         * [MeServiceAsync.retrieve].
         */
        fun retrieve(): CompletableFuture<HttpResponseFor<MeRetrieveResponse>> =
            retrieve(MeRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            params: MeRetrieveParams = MeRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MeRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: MeRetrieveParams = MeRetrieveParams.none()
        ): CompletableFuture<HttpResponseFor<MeRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<MeRetrieveResponse>> =
            retrieve(MeRetrieveParams.none(), requestOptions)
    }
}
