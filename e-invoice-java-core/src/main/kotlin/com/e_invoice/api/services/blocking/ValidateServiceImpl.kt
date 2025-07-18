// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.services.blocking

import com.e_invoice.api.core.ClientOptions
import com.e_invoice.api.core.RequestOptions
import com.e_invoice.api.core.handlers.errorBodyHandler
import com.e_invoice.api.core.handlers.errorHandler
import com.e_invoice.api.core.handlers.jsonHandler
import com.e_invoice.api.core.http.HttpMethod
import com.e_invoice.api.core.http.HttpRequest
import com.e_invoice.api.core.http.HttpResponse
import com.e_invoice.api.core.http.HttpResponse.Handler
import com.e_invoice.api.core.http.HttpResponseFor
import com.e_invoice.api.core.http.json
import com.e_invoice.api.core.http.multipartFormData
import com.e_invoice.api.core.http.parseable
import com.e_invoice.api.core.prepare
import com.e_invoice.api.models.validate.UblDocumentValidation
import com.e_invoice.api.models.validate.ValidateValidateJsonParams
import com.e_invoice.api.models.validate.ValidateValidatePeppolIdParams
import com.e_invoice.api.models.validate.ValidateValidatePeppolIdResponse
import com.e_invoice.api.models.validate.ValidateValidateUblParams
import java.util.function.Consumer

class ValidateServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ValidateService {

    private val withRawResponse: ValidateService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ValidateService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ValidateService =
        ValidateServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun validateJson(
        params: ValidateValidateJsonParams,
        requestOptions: RequestOptions,
    ): UblDocumentValidation =
        // post /api/validate/json
        withRawResponse().validateJson(params, requestOptions).parse()

    override fun validatePeppolId(
        params: ValidateValidatePeppolIdParams,
        requestOptions: RequestOptions,
    ): ValidateValidatePeppolIdResponse =
        // get /api/validate/peppol-id
        withRawResponse().validatePeppolId(params, requestOptions).parse()

    override fun validateUbl(
        params: ValidateValidateUblParams,
        requestOptions: RequestOptions,
    ): UblDocumentValidation =
        // post /api/validate/ubl
        withRawResponse().validateUbl(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ValidateService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ValidateService.WithRawResponse =
            ValidateServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val validateJsonHandler: Handler<UblDocumentValidation> =
            jsonHandler<UblDocumentValidation>(clientOptions.jsonMapper)

        override fun validateJson(
            params: ValidateValidateJsonParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UblDocumentValidation> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "validate", "json")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { validateJsonHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val validatePeppolIdHandler: Handler<ValidateValidatePeppolIdResponse> =
            jsonHandler<ValidateValidatePeppolIdResponse>(clientOptions.jsonMapper)

        override fun validatePeppolId(
            params: ValidateValidatePeppolIdParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ValidateValidatePeppolIdResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "validate", "peppol-id")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { validatePeppolIdHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val validateUblHandler: Handler<UblDocumentValidation> =
            jsonHandler<UblDocumentValidation>(clientOptions.jsonMapper)

        override fun validateUbl(
            params: ValidateValidateUblParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UblDocumentValidation> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "validate", "ubl")
                    .body(multipartFormData(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { validateUblHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
