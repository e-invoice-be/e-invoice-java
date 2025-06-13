// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.services.async

import com.e_invoice.api.core.ClientOptions
import com.e_invoice.api.core.RequestOptions
import com.e_invoice.api.core.http.HttpResponseFor
import com.e_invoice.api.models.validate.UblDocumentValidation
import com.e_invoice.api.models.validate.ValidateValidateJsonParams
import com.e_invoice.api.models.validate.ValidateValidatePeppolIdParams
import com.e_invoice.api.models.validate.ValidateValidatePeppolIdResponse
import com.e_invoice.api.models.validate.ValidateValidateUblParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ValidateServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ValidateServiceAsync

    /** Validate if the JSON document can be converted to a valid UBL document */
    fun validateJson(params: ValidateValidateJsonParams): CompletableFuture<UblDocumentValidation> =
        validateJson(params, RequestOptions.none())

    /** @see [validateJson] */
    fun validateJson(
        params: ValidateValidateJsonParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UblDocumentValidation>

    /**
     * Validate if a Peppol ID exists in the Peppol network and retrieve supported document types.
     * The peppol_id must be in the form of `<scheme>:<id>`. The scheme is a 4-digit code
     * representing the identifier scheme, and the id is the actual identifier value. For example,
     * for a Belgian company it is `0208:0123456789` (where 0208 is the scheme for Belgian
     * enterprises, followed by the 10 digits of the official BTW / KBO number).
     */
    fun validatePeppolId(
        params: ValidateValidatePeppolIdParams
    ): CompletableFuture<ValidateValidatePeppolIdResponse> =
        validatePeppolId(params, RequestOptions.none())

    /** @see [validatePeppolId] */
    fun validatePeppolId(
        params: ValidateValidatePeppolIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ValidateValidatePeppolIdResponse>

    /** Validate the correctness of a UBL document */
    fun validateUbl(params: ValidateValidateUblParams): CompletableFuture<UblDocumentValidation> =
        validateUbl(params, RequestOptions.none())

    /** @see [validateUbl] */
    fun validateUbl(
        params: ValidateValidateUblParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UblDocumentValidation>

    /**
     * A view of [ValidateServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ValidateServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/validate/json`, but is otherwise the same as
         * [ValidateServiceAsync.validateJson].
         */
        fun validateJson(
            params: ValidateValidateJsonParams
        ): CompletableFuture<HttpResponseFor<UblDocumentValidation>> =
            validateJson(params, RequestOptions.none())

        /** @see [validateJson] */
        fun validateJson(
            params: ValidateValidateJsonParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UblDocumentValidation>>

        /**
         * Returns a raw HTTP response for `get /api/validate/peppol-id`, but is otherwise the same
         * as [ValidateServiceAsync.validatePeppolId].
         */
        fun validatePeppolId(
            params: ValidateValidatePeppolIdParams
        ): CompletableFuture<HttpResponseFor<ValidateValidatePeppolIdResponse>> =
            validatePeppolId(params, RequestOptions.none())

        /** @see [validatePeppolId] */
        fun validatePeppolId(
            params: ValidateValidatePeppolIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ValidateValidatePeppolIdResponse>>

        /**
         * Returns a raw HTTP response for `post /api/validate/ubl`, but is otherwise the same as
         * [ValidateServiceAsync.validateUbl].
         */
        fun validateUbl(
            params: ValidateValidateUblParams
        ): CompletableFuture<HttpResponseFor<UblDocumentValidation>> =
            validateUbl(params, RequestOptions.none())

        /** @see [validateUbl] */
        fun validateUbl(
            params: ValidateValidateUblParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UblDocumentValidation>>
    }
}
