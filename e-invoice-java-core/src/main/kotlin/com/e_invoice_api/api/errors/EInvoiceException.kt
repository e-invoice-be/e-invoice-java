package com.e_invoice_api.api.errors

open class EInvoiceException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : RuntimeException(message, cause)
