// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.services.blocking

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
import com.e_invoice.api.core.http.json
import com.e_invoice.api.core.http.parseable
import com.e_invoice.api.core.prepare
import com.e_invoice.api.models.documents.DocumentCreateParams
import com.e_invoice.api.models.documents.DocumentDeleteParams
import com.e_invoice.api.models.documents.DocumentDeleteResponse
import com.e_invoice.api.models.documents.DocumentResponse
import com.e_invoice.api.models.documents.DocumentRetrieveParams
import com.e_invoice.api.models.documents.DocumentSendParams
import com.e_invoice.api.services.blocking.documents.AttachmentService
import com.e_invoice.api.services.blocking.documents.AttachmentServiceImpl
import com.e_invoice.api.services.blocking.documents.UblService
import com.e_invoice.api.services.blocking.documents.UblServiceImpl
import kotlin.jvm.optionals.getOrNull

class DocumentServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    DocumentService {

    private val withRawResponse: DocumentService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val attachments: AttachmentService by lazy { AttachmentServiceImpl(clientOptions) }

    private val ubl: UblService by lazy { UblServiceImpl(clientOptions) }

    override fun withRawResponse(): DocumentService.WithRawResponse = withRawResponse

    override fun attachments(): AttachmentService = attachments

    override fun ubl(): UblService = ubl

    override fun create(
        params: DocumentCreateParams,
        requestOptions: RequestOptions,
    ): DocumentResponse =
        // post /api/documents/
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: DocumentRetrieveParams,
        requestOptions: RequestOptions,
    ): DocumentResponse =
        // get /api/documents/{document_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun delete(
        params: DocumentDeleteParams,
        requestOptions: RequestOptions,
    ): DocumentDeleteResponse =
        // delete /api/documents/{document_id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun send(
        params: DocumentSendParams,
        requestOptions: RequestOptions,
    ): DocumentResponse =
        // post /api/documents/{document_id}/send
        withRawResponse().send(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DocumentService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val attachments: AttachmentService.WithRawResponse by lazy {
            AttachmentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val ubl: UblService.WithRawResponse by lazy {
            UblServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun attachments(): AttachmentService.WithRawResponse = attachments

        override fun ubl(): UblService.WithRawResponse = ubl

        private val createHandler: Handler<DocumentResponse> =
            jsonHandler<DocumentResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: DocumentCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DocumentResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("api", "documents", "")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<DocumentResponse> =
            jsonHandler<DocumentResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: DocumentRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DocumentResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("documentId", params.documentId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("api", "documents", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteHandler: Handler<DocumentDeleteResponse> =
            jsonHandler<DocumentDeleteResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun delete(
            params: DocumentDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DocumentDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("documentId", params.documentId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("api", "documents", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { deleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val sendHandler: Handler<DocumentResponse> =
            jsonHandler<DocumentResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun send(
            params: DocumentSendParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DocumentResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("documentId", params.documentId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("api", "documents", params._pathParam(0), "send")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { sendHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
