// File generated from our OpenAPI spec by Stainless.

package com.e_invoice_api.api.services.blocking.documents

import com.e_invoice_api.api.core.ClientOptions
import com.e_invoice_api.api.core.JsonValue
import com.e_invoice_api.api.core.RequestOptions
import com.e_invoice_api.api.core.checkRequired
import com.e_invoice_api.api.core.handlers.errorHandler
import com.e_invoice_api.api.core.handlers.jsonHandler
import com.e_invoice_api.api.core.handlers.withErrorHandler
import com.e_invoice_api.api.core.http.HttpMethod
import com.e_invoice_api.api.core.http.HttpRequest
import com.e_invoice_api.api.core.http.HttpResponse.Handler
import com.e_invoice_api.api.core.http.HttpResponseFor
import com.e_invoice_api.api.core.http.parseable
import com.e_invoice_api.api.core.prepare
import com.e_invoice_api.api.models.documents.ubl.UblGetParams
import com.e_invoice_api.api.models.documents.ubl.UblGetResponse
import kotlin.jvm.optionals.getOrNull

class UblServiceImpl internal constructor(private val clientOptions: ClientOptions) : UblService {

    private val withRawResponse: UblService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): UblService.WithRawResponse = withRawResponse

    override fun get(params: UblGetParams, requestOptions: RequestOptions): UblGetResponse =
        // get /api/documents/{document_id}/ubl
        withRawResponse().get(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        UblService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val getHandler: Handler<UblGetResponse> =
            jsonHandler<UblGetResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun get(
            params: UblGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UblGetResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("documentId", params.documentId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("api", "documents", params._pathParam(0), "ubl")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
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
