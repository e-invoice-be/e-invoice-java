// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.services.async.documents

import com.e_invoice.api.core.ClientOptions
import com.e_invoice.api.core.JsonValue
import com.e_invoice.api.core.RequestOptions
import com.e_invoice.api.core.checkRequired
import com.e_invoice.api.core.handlers.errorHandler
import com.e_invoice.api.core.handlers.jsonHandler
import com.e_invoice.api.core.handlers.withErrorHandler
import com.e_invoice.api.core.http.HttpMethod
import com.e_invoice.api.core.http.HttpRequest
import com.e_invoice.api.core.http.HttpResponse.Handler
import com.e_invoice.api.core.http.HttpResponseFor
import com.e_invoice.api.core.http.parseable
import com.e_invoice.api.core.prepareAsync
import com.e_invoice.api.models.documents.ubl.UblGetParams
import com.e_invoice.api.models.documents.ubl.UblGetResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class UblServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    UblServiceAsync {

    private val withRawResponse: UblServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): UblServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): UblServiceAsync =
        UblServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun get(
        params: UblGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UblGetResponse> =
        // get /api/documents/{document_id}/ubl
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        UblServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): UblServiceAsync.WithRawResponse =
            UblServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getHandler: Handler<UblGetResponse> =
            jsonHandler<UblGetResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun get(
            params: UblGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UblGetResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("documentId", params.documentId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "documents", params._pathParam(0), "ubl")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { getHandler.handle(it) }
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
