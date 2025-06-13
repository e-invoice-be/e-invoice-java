// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.services.blocking

import com.e_invoice.api.core.ClientOptions
import com.e_invoice.api.core.RequestOptions
import com.e_invoice.api.core.http.HttpResponseFor
import com.e_invoice.api.models.validate.UblDocumentValidation
import com.e_invoice.api.models.validate.ValidateValidateJsonParams
import com.e_invoice.api.models.validate.ValidateValidatePeppolIdParams
import com.e_invoice.api.models.validate.ValidateValidatePeppolIdResponse
import com.e_invoice.api.models.validate.ValidateValidateUblParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface ValidateService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ValidateService

    /** Validate if the JSON document can be converted to a valid UBL document */
    fun validateJson(params: ValidateValidateJsonParams): UblDocumentValidation =
        validateJson(params, RequestOptions.none())

    /** @see [validateJson] */
    fun validateJson(
        params: ValidateValidateJsonParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UblDocumentValidation

    /**
     * Validate if a Peppol ID exists in the Peppol network and retrieve supported document types.
     * The peppol_id must be in the form of `<scheme>:<id>`. The scheme is a 4-digit code
     * representing the identifier scheme, and the id is the actual identifier value. For example,
     * for a Belgian company it is `0208:0123456789` (where 0208 is the scheme for Belgian
     * enterprises, followed by the 10 digits of the official BTW / KBO number).
     */
    fun validatePeppolId(params: ValidateValidatePeppolIdParams): ValidateValidatePeppolIdResponse =
        validatePeppolId(params, RequestOptions.none())

    /** @see [validatePeppolId] */
    fun validatePeppolId(
        params: ValidateValidatePeppolIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ValidateValidatePeppolIdResponse

    /** Validate the correctness of a UBL document */
    fun validateUbl(params: ValidateValidateUblParams): UblDocumentValidation =
        validateUbl(params, RequestOptions.none())

    /** @see [validateUbl] */
    fun validateUbl(
        params: ValidateValidateUblParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UblDocumentValidation

    /** A view of [ValidateService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ValidateService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/validate/json`, but is otherwise the same as
         * [ValidateService.validateJson].
         */
        @MustBeClosed
        fun validateJson(
            params: ValidateValidateJsonParams
        ): HttpResponseFor<UblDocumentValidation> = validateJson(params, RequestOptions.none())

        /** @see [validateJson] */
        @MustBeClosed
        fun validateJson(
            params: ValidateValidateJsonParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UblDocumentValidation>

        /**
         * Returns a raw HTTP response for `get /api/validate/peppol-id`, but is otherwise the same
         * as [ValidateService.validatePeppolId].
         */
        @MustBeClosed
        fun validatePeppolId(
            params: ValidateValidatePeppolIdParams
        ): HttpResponseFor<ValidateValidatePeppolIdResponse> =
            validatePeppolId(params, RequestOptions.none())

        /** @see [validatePeppolId] */
        @MustBeClosed
        fun validatePeppolId(
            params: ValidateValidatePeppolIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ValidateValidatePeppolIdResponse>

        /**
         * Returns a raw HTTP response for `post /api/validate/ubl`, but is otherwise the same as
         * [ValidateService.validateUbl].
         */
        @MustBeClosed
        fun validateUbl(params: ValidateValidateUblParams): HttpResponseFor<UblDocumentValidation> =
            validateUbl(params, RequestOptions.none())

        /** @see [validateUbl] */
        @MustBeClosed
        fun validateUbl(
            params: ValidateValidateUblParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UblDocumentValidation>
    }
}
