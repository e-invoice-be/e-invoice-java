// File generated from our OpenAPI spec by Stainless.

package com.e_invoice_api.api.errors

import com.e_invoice_api.api.core.JsonValue
import com.e_invoice_api.api.core.http.Headers

abstract class EInvoiceServiceException
protected constructor(message: String, cause: Throwable? = null) :
    EInvoiceException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
