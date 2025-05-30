// File generated from our OpenAPI spec by Stainless.

package com.e_invoice_api.api.services.async

import com.e_invoice_api.api.core.RequestOptions
import com.e_invoice_api.api.core.http.HttpResponseFor
import com.e_invoice_api.api.models.webhooks.WebhookCreateParams
import com.e_invoice_api.api.models.webhooks.WebhookDeleteParams
import com.e_invoice_api.api.models.webhooks.WebhookDeleteResponse
import com.e_invoice_api.api.models.webhooks.WebhookListParams
import com.e_invoice_api.api.models.webhooks.WebhookResponse
import com.e_invoice_api.api.models.webhooks.WebhookRetrieveParams
import com.e_invoice_api.api.models.webhooks.WebhookUpdateParams
import java.util.concurrent.CompletableFuture

interface WebhookServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a new webhook */
    fun create(params: WebhookCreateParams): CompletableFuture<WebhookResponse> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: WebhookCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookResponse>

    /** Get a webhook by ID */
    fun retrieve(webhookId: String): CompletableFuture<WebhookResponse> =
        retrieve(webhookId, WebhookRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        webhookId: String,
        params: WebhookRetrieveParams = WebhookRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookResponse> =
        retrieve(params.toBuilder().webhookId(webhookId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        webhookId: String,
        params: WebhookRetrieveParams = WebhookRetrieveParams.none(),
    ): CompletableFuture<WebhookResponse> = retrieve(webhookId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: WebhookRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookResponse>

    /** @see [retrieve] */
    fun retrieve(params: WebhookRetrieveParams): CompletableFuture<WebhookResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        webhookId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<WebhookResponse> =
        retrieve(webhookId, WebhookRetrieveParams.none(), requestOptions)

    /** Update a webhook by ID */
    fun update(webhookId: String): CompletableFuture<WebhookResponse> =
        update(webhookId, WebhookUpdateParams.none())

    /** @see [update] */
    fun update(
        webhookId: String,
        params: WebhookUpdateParams = WebhookUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookResponse> =
        update(params.toBuilder().webhookId(webhookId).build(), requestOptions)

    /** @see [update] */
    fun update(
        webhookId: String,
        params: WebhookUpdateParams = WebhookUpdateParams.none(),
    ): CompletableFuture<WebhookResponse> = update(webhookId, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: WebhookUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookResponse>

    /** @see [update] */
    fun update(params: WebhookUpdateParams): CompletableFuture<WebhookResponse> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        webhookId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<WebhookResponse> =
        update(webhookId, WebhookUpdateParams.none(), requestOptions)

    /** Get all webhooks for the current tenant */
    fun list(): CompletableFuture<List<WebhookResponse>> = list(WebhookListParams.none())

    /** @see [list] */
    fun list(
        params: WebhookListParams = WebhookListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<WebhookResponse>>

    /** @see [list] */
    fun list(
        params: WebhookListParams = WebhookListParams.none()
    ): CompletableFuture<List<WebhookResponse>> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<List<WebhookResponse>> =
        list(WebhookListParams.none(), requestOptions)

    /** Delete a webhook */
    fun delete(webhookId: String): CompletableFuture<WebhookDeleteResponse> =
        delete(webhookId, WebhookDeleteParams.none())

    /** @see [delete] */
    fun delete(
        webhookId: String,
        params: WebhookDeleteParams = WebhookDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookDeleteResponse> =
        delete(params.toBuilder().webhookId(webhookId).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        webhookId: String,
        params: WebhookDeleteParams = WebhookDeleteParams.none(),
    ): CompletableFuture<WebhookDeleteResponse> = delete(webhookId, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: WebhookDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookDeleteResponse>

    /** @see [delete] */
    fun delete(params: WebhookDeleteParams): CompletableFuture<WebhookDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        webhookId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<WebhookDeleteResponse> =
        delete(webhookId, WebhookDeleteParams.none(), requestOptions)

    /**
     * A view of [WebhookServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /api/webhooks/`, but is otherwise the same as
         * [WebhookServiceAsync.create].
         */
        fun create(
            params: WebhookCreateParams
        ): CompletableFuture<HttpResponseFor<WebhookResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        fun create(
            params: WebhookCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookResponse>>

        /**
         * Returns a raw HTTP response for `get /api/webhooks/{webhook_id}`, but is otherwise the
         * same as [WebhookServiceAsync.retrieve].
         */
        fun retrieve(webhookId: String): CompletableFuture<HttpResponseFor<WebhookResponse>> =
            retrieve(webhookId, WebhookRetrieveParams.none())

        /** @see [retrieve] */
        fun retrieve(
            webhookId: String,
            params: WebhookRetrieveParams = WebhookRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookResponse>> =
            retrieve(params.toBuilder().webhookId(webhookId).build(), requestOptions)

        /** @see [retrieve] */
        fun retrieve(
            webhookId: String,
            params: WebhookRetrieveParams = WebhookRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<WebhookResponse>> =
            retrieve(webhookId, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: WebhookRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookResponse>>

        /** @see [retrieve] */
        fun retrieve(
            params: WebhookRetrieveParams
        ): CompletableFuture<HttpResponseFor<WebhookResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            webhookId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WebhookResponse>> =
            retrieve(webhookId, WebhookRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /api/webhooks/{webhook_id}`, but is otherwise the
         * same as [WebhookServiceAsync.update].
         */
        fun update(webhookId: String): CompletableFuture<HttpResponseFor<WebhookResponse>> =
            update(webhookId, WebhookUpdateParams.none())

        /** @see [update] */
        fun update(
            webhookId: String,
            params: WebhookUpdateParams = WebhookUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookResponse>> =
            update(params.toBuilder().webhookId(webhookId).build(), requestOptions)

        /** @see [update] */
        fun update(
            webhookId: String,
            params: WebhookUpdateParams = WebhookUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<WebhookResponse>> =
            update(webhookId, params, RequestOptions.none())

        /** @see [update] */
        fun update(
            params: WebhookUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookResponse>>

        /** @see [update] */
        fun update(
            params: WebhookUpdateParams
        ): CompletableFuture<HttpResponseFor<WebhookResponse>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        fun update(
            webhookId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WebhookResponse>> =
            update(webhookId, WebhookUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/webhooks/`, but is otherwise the same as
         * [WebhookServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<List<WebhookResponse>>> =
            list(WebhookListParams.none())

        /** @see [list] */
        fun list(
            params: WebhookListParams = WebhookListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<WebhookResponse>>>

        /** @see [list] */
        fun list(
            params: WebhookListParams = WebhookListParams.none()
        ): CompletableFuture<HttpResponseFor<List<WebhookResponse>>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<WebhookResponse>>> =
            list(WebhookListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/webhooks/{webhook_id}`, but is otherwise the
         * same as [WebhookServiceAsync.delete].
         */
        fun delete(webhookId: String): CompletableFuture<HttpResponseFor<WebhookDeleteResponse>> =
            delete(webhookId, WebhookDeleteParams.none())

        /** @see [delete] */
        fun delete(
            webhookId: String,
            params: WebhookDeleteParams = WebhookDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookDeleteResponse>> =
            delete(params.toBuilder().webhookId(webhookId).build(), requestOptions)

        /** @see [delete] */
        fun delete(
            webhookId: String,
            params: WebhookDeleteParams = WebhookDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<WebhookDeleteResponse>> =
            delete(webhookId, params, RequestOptions.none())

        /** @see [delete] */
        fun delete(
            params: WebhookDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookDeleteResponse>>

        /** @see [delete] */
        fun delete(
            params: WebhookDeleteParams
        ): CompletableFuture<HttpResponseFor<WebhookDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        fun delete(
            webhookId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WebhookDeleteResponse>> =
            delete(webhookId, WebhookDeleteParams.none(), requestOptions)
    }
}
