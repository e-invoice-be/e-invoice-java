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
import com.e_invoice.api.core.http.parseable
import com.e_invoice.api.core.prepare
import com.e_invoice.api.models.stats.StatsResponse
import com.e_invoice.api.models.stats.StatsRetrieveParams
import java.util.function.Consumer

class StatsServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    StatsService {

    private val withRawResponse: StatsService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): StatsService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): StatsService =
        StatsServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: StatsRetrieveParams,
        requestOptions: RequestOptions,
    ): StatsResponse =
        // get /api/stats
        withRawResponse().retrieve(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        StatsService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): StatsService.WithRawResponse =
            StatsServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<StatsResponse> =
            jsonHandler<StatsResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: StatsRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<StatsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "stats")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
}
