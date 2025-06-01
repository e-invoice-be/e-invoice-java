// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.services.async.documents

import com.e_invoice.api.TestServerExtension
import com.e_invoice.api.client.okhttp.EInvoiceOkHttpClientAsync
import com.e_invoice.api.models.documents.attachments.AttachmentAddParams
import com.e_invoice.api.models.documents.attachments.AttachmentDeleteParams
import com.e_invoice.api.models.documents.attachments.AttachmentRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AttachmentServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieve() {
        val client =
            EInvoiceOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val attachmentServiceAsync = client.documents().attachments()

        val documentAttachmentFuture =
            attachmentServiceAsync.retrieve(
                AttachmentRetrieveParams.builder()
                    .documentId("document_id")
                    .attachmentId("attachment_id")
                    .build()
            )

        val documentAttachment = documentAttachmentFuture.get()
        documentAttachment.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun list() {
        val client =
            EInvoiceOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val attachmentServiceAsync = client.documents().attachments()

        val documentAttachmentsFuture = attachmentServiceAsync.list("document_id")

        val documentAttachments = documentAttachmentsFuture.get()
        documentAttachments.forEach { it.validate() }
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun delete() {
        val client =
            EInvoiceOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val attachmentServiceAsync = client.documents().attachments()

        val attachmentFuture =
            attachmentServiceAsync.delete(
                AttachmentDeleteParams.builder()
                    .documentId("document_id")
                    .attachmentId("attachment_id")
                    .build()
            )

        val attachment = attachmentFuture.get()
        attachment.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun add() {
        val client =
            EInvoiceOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val attachmentServiceAsync = client.documents().attachments()

        val documentAttachmentFuture =
            attachmentServiceAsync.add(
                AttachmentAddParams.builder()
                    .documentId("document_id")
                    .file("some content".byteInputStream())
                    .build()
            )

        val documentAttachment = documentAttachmentFuture.get()
        documentAttachment.validate()
    }
}
