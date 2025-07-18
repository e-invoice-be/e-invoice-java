// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.services.async.documents

import com.e_invoice.api.core.ClientOptions
import com.e_invoice.api.core.RequestOptions
import com.e_invoice.api.core.checkRequired
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
import com.e_invoice.api.core.prepareAsync
import com.e_invoice.api.models.documents.attachments.AttachmentAddParams
import com.e_invoice.api.models.documents.attachments.AttachmentDeleteParams
import com.e_invoice.api.models.documents.attachments.AttachmentDeleteResponse
import com.e_invoice.api.models.documents.attachments.AttachmentListParams
import com.e_invoice.api.models.documents.attachments.AttachmentRetrieveParams
import com.e_invoice.api.models.documents.attachments.DocumentAttachment
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AttachmentServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AttachmentServiceAsync {

    private val withRawResponse: AttachmentServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AttachmentServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AttachmentServiceAsync =
        AttachmentServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: AttachmentRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DocumentAttachment> =
        // get /api/documents/{document_id}/attachments/{attachment_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: AttachmentListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<DocumentAttachment>> =
        // get /api/documents/{document_id}/attachments
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: AttachmentDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AttachmentDeleteResponse> =
        // delete /api/documents/{document_id}/attachments/{attachment_id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun add(
        params: AttachmentAddParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DocumentAttachment> =
        // post /api/documents/{document_id}/attachments
        withRawResponse().add(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AttachmentServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AttachmentServiceAsync.WithRawResponse =
            AttachmentServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<DocumentAttachment> =
            jsonHandler<DocumentAttachment>(clientOptions.jsonMapper)

        override fun retrieve(
            params: AttachmentRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DocumentAttachment>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("attachmentId", params.attachmentId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "documents",
                        params._pathParam(0),
                        "attachments",
                        params._pathParam(1),
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<List<DocumentAttachment>> =
            jsonHandler<List<DocumentAttachment>>(clientOptions.jsonMapper)

        override fun list(
            params: AttachmentListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<DocumentAttachment>>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("documentId", params.documentId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "documents", params._pathParam(0), "attachments")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.forEach { it.validate() }
                                }
                            }
                    }
                }
        }

        private val deleteHandler: Handler<AttachmentDeleteResponse> =
            jsonHandler<AttachmentDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: AttachmentDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AttachmentDeleteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("attachmentId", params.attachmentId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "documents",
                        params._pathParam(0),
                        "attachments",
                        params._pathParam(1),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { deleteHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val addHandler: Handler<DocumentAttachment> =
            jsonHandler<DocumentAttachment>(clientOptions.jsonMapper)

        override fun add(
            params: AttachmentAddParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DocumentAttachment>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("documentId", params.documentId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "documents", params._pathParam(0), "attachments")
                    .body(multipartFormData(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
