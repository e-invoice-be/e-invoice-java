// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.models.lookup

import com.e_invoice.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class LookupRetrieveParticipantsParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        LookupRetrieveParticipantsParams.builder()
            .query("query")
            .countryCode("country_code")
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParams() {
        val params =
            LookupRetrieveParticipantsParams.builder()
                .query("query")
                .countryCode("country_code")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("query", "query")
                    .put("country_code", "country_code")
                    .build()
            )
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = LookupRetrieveParticipantsParams.builder().query("query").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("query", "query").build())
    }
}
