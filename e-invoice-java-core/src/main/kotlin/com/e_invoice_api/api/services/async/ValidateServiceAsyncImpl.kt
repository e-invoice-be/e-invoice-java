// File generated from our OpenAPI spec by Stainless.

package com.e_invoice_api.api.services.async

import com.e_invoice_api.api.core.ClientOptions
import com.e_invoice_api.api.core.JsonValue
import com.e_invoice_api.api.core.RequestOptions
import com.e_invoice_api.api.core.handlers.errorHandler
import com.e_invoice_api.api.core.handlers.jsonHandler
import com.e_invoice_api.api.core.handlers.withErrorHandler
import com.e_invoice_api.api.core.http.HttpMethod
import com.e_invoice_api.api.core.http.HttpRequest
import com.e_invoice_api.api.core.http.HttpResponse.Handler
import com.e_invoice_api.api.core.http.HttpResponseFor
import com.e_invoice_api.api.core.http.json
import com.e_invoice_api.api.core.http.multipartFormData
import com.e_invoice_api.api.core.http.parseable
import com.e_invoice_api.api.core.prepareAsync
import com.e_invoice_api.api.models.validate.UblDocumentValidation
import com.e_invoice_api.api.models.validate.ValidateValidateJsonParams
import com.e_invoice_api.api.models.validate.ValidateValidatePeppolIdParams
import com.e_invoice_api.api.models.validate.ValidateValidatePeppolIdResponse
import com.e_invoice_api.api.models.validate.ValidateValidateUblParams
import java.util.concurrent.CompletableFuture

class ValidateServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ValidateServiceAsync {

    private val withRawResponse: ValidateServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ValidateServiceAsync.WithRawResponse = withRawResponse

    override fun validateJson(
        params: ValidateValidateJsonParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UblDocumentValidation> =
        // post /api/validate/json
        withRawResponse().validateJson(params, requestOptions).thenApply { it.parse() }

    override fun validatePeppolId(
        params: ValidateValidatePeppolIdParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ValidateValidatePeppolIdResponse> =
        // get /api/validate/peppol-id
        withRawResponse().validatePeppolId(params, requestOptions).thenApply { it.parse() }

    override fun validateUbl(
        params: ValidateValidateUblParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UblDocumentValidation> =
        // post /api/validate/ubl
        withRawResponse().validateUbl(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ValidateServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val validateJsonHandler: Handler<UblDocumentValidation> =
            jsonHandler<UblDocumentValidation>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun validateJson(
            params: ValidateValidateJsonParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UblDocumentValidation>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("api", "validate", "json")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { validateJsonHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val validatePeppolIdHandler: Handler<ValidateValidatePeppolIdResponse> =
            jsonHandler<ValidateValidatePeppolIdResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun validatePeppolId(
            params: ValidateValidatePeppolIdParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ValidateValidatePeppolIdResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("api", "validate", "peppol-id")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { validatePeppolIdHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val validateUblHandler: Handler<UblDocumentValidation> =
            jsonHandler<UblDocumentValidation>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun validateUbl(
            params: ValidateValidateUblParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UblDocumentValidation>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("api", "validate", "ubl")
                    .body(multipartFormData(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
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
}
