// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.services.async

import com.e_invoice.api.client.okhttp.EInvoiceOkHttpClientAsync
import com.e_invoice.api.models.lookup.LookupRetrieveParams
import com.e_invoice.api.models.lookup.LookupRetrieveParticipantsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class LookupServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = EInvoiceOkHttpClientAsync.builder().apiKey("My API Key").build()
        val lookupServiceAsync = client.lookup()

        val lookupFuture =
            lookupServiceAsync.retrieve(
                LookupRetrieveParams.builder().peppolId("peppol_id").build()
            )

        val lookup = lookupFuture.get()
        lookup.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveParticipants() {
        val client = EInvoiceOkHttpClientAsync.builder().apiKey("My API Key").build()
        val lookupServiceAsync = client.lookup()

        val responseFuture =
            lookupServiceAsync.retrieveParticipants(
                LookupRetrieveParticipantsParams.builder()
                    .query("query")
                    .countryCode("country_code")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
