// File generated from our OpenAPI spec by Stainless.

package com.e_invoice_api.api.models.validate

import com.e_invoice_api.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ValidateValidatePeppolIdParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        ValidateValidatePeppolIdParams.builder().peppolId("peppol_id").build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParams() {
        val params = ValidateValidatePeppolIdParams.builder().peppolId("peppol_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("peppol_id", "peppol_id").build())
    }
}
