// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.services.blocking

import com.e_invoice.api.core.ClientOptions
import com.e_invoice.api.core.RequestOptions
import com.e_invoice.api.core.http.HttpResponseFor
import com.e_invoice.api.models.lookup.LookupRetrieveParams
import com.e_invoice.api.models.lookup.LookupRetrieveParticipantsParams
import com.e_invoice.api.models.lookup.LookupRetrieveParticipantsResponse
import com.e_invoice.api.models.lookup.LookupRetrieveResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface LookupService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LookupService

    /**
     * Lookup Peppol ID. The peppol_id must be in the form of `<scheme>:<id>`. The scheme is a
     * 4-digit code representing the identifier scheme, and the id is the actual identifier value.
     * For example, for a Belgian company it is `0208:0123456789` (where 0208 is the scheme for
     * Belgian enterprises, followed by the 10 digits of the official BTW / KBO number).
     */
    fun retrieve(params: LookupRetrieveParams): LookupRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: LookupRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LookupRetrieveResponse

    /**
     * Lookup Peppol participants by name or other identifiers. You can limit the search to a
     * specific country by providing the country code.
     */
    fun retrieveParticipants(
        params: LookupRetrieveParticipantsParams
    ): LookupRetrieveParticipantsResponse = retrieveParticipants(params, RequestOptions.none())

    /** @see retrieveParticipants */
    fun retrieveParticipants(
        params: LookupRetrieveParticipantsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LookupRetrieveParticipantsResponse

    /** A view of [LookupService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): LookupService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/lookup`, but is otherwise the same as
         * [LookupService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: LookupRetrieveParams): HttpResponseFor<LookupRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: LookupRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LookupRetrieveResponse>

        /**
         * Returns a raw HTTP response for `get /api/lookup/participants`, but is otherwise the same
         * as [LookupService.retrieveParticipants].
         */
        @MustBeClosed
        fun retrieveParticipants(
            params: LookupRetrieveParticipantsParams
        ): HttpResponseFor<LookupRetrieveParticipantsResponse> =
            retrieveParticipants(params, RequestOptions.none())

        /** @see retrieveParticipants */
        @MustBeClosed
        fun retrieveParticipants(
            params: LookupRetrieveParticipantsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LookupRetrieveParticipantsResponse>
    }
}
