// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.services.blocking.documents

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
import com.e_invoice.api.core.http.multipartFormData
import com.e_invoice.api.core.http.parseable
import com.e_invoice.api.core.prepare
import com.e_invoice.api.models.documents.attachments.AttachmentAddParams
import com.e_invoice.api.models.documents.attachments.AttachmentDeleteParams
import com.e_invoice.api.models.documents.attachments.AttachmentDeleteResponse
import com.e_invoice.api.models.documents.attachments.AttachmentListParams
import com.e_invoice.api.models.documents.attachments.AttachmentRetrieveParams
import com.e_invoice.api.models.documents.attachments.DocumentAttachment
import kotlin.jvm.optionals.getOrNull

class AttachmentServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AttachmentService {

    private val withRawResponse: AttachmentService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AttachmentService.WithRawResponse = withRawResponse

    override fun retrieve(
        params: AttachmentRetrieveParams,
        requestOptions: RequestOptions,
    ): DocumentAttachment =
        // get /api/documents/{document_id}/attachments/{attachment_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: AttachmentListParams,
        requestOptions: RequestOptions,
    ): List<DocumentAttachment> =
        // get /api/documents/{document_id}/attachments
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: AttachmentDeleteParams,
        requestOptions: RequestOptions,
    ): AttachmentDeleteResponse =
        // delete /api/documents/{document_id}/attachments/{attachment_id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun add(
        params: AttachmentAddParams,
        requestOptions: RequestOptions,
    ): DocumentAttachment =
        // post /api/documents/{document_id}/attachments
        withRawResponse().add(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AttachmentService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<DocumentAttachment> =
            jsonHandler<DocumentAttachment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: AttachmentRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DocumentAttachment> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("attachmentId", params.attachmentId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "api",
                        "documents",
                        params._pathParam(0),
                        "attachments",
                        params._pathParam(1),
                    )
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

        private val listHandler: Handler<List<DocumentAttachment>> =
            jsonHandler<List<DocumentAttachment>>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: AttachmentListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<DocumentAttachment>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("documentId", params.documentId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("api", "documents", params._pathParam(0), "attachments")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val deleteHandler: Handler<AttachmentDeleteResponse> =
            jsonHandler<AttachmentDeleteResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun delete(
            params: AttachmentDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AttachmentDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("attachmentId", params.attachmentId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments(
                        "api",
                        "documents",
                        params._pathParam(0),
                        "attachments",
                        params._pathParam(1),
                    )
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

        private val addHandler: Handler<DocumentAttachment> =
            jsonHandler<DocumentAttachment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun add(
            params: AttachmentAddParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DocumentAttachment> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("documentId", params.documentId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("api", "documents", params._pathParam(0), "attachments")
                    .body(multipartFormData(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { addHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
