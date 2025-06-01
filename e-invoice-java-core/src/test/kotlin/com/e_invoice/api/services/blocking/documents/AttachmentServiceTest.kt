// File generated from our OpenAPI spec by Stainless.

package com.e_invoice.api.services.blocking.documents

import com.e_invoice.api.TestServerExtension
import com.e_invoice.api.client.okhttp.EInvoiceOkHttpClient
import com.e_invoice.api.models.documents.attachments.AttachmentAddParams
import com.e_invoice.api.models.documents.attachments.AttachmentDeleteParams
import com.e_invoice.api.models.documents.attachments.AttachmentRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AttachmentServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieve() {
        val client =
            EInvoiceOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val attachmentService = client.documents().attachments()

        val documentAttachment =
            attachmentService.retrieve(
                AttachmentRetrieveParams.builder()
                    .documentId("document_id")
                    .attachmentId("attachment_id")
                    .build()
            )

        documentAttachment.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun list() {
        val client =
            EInvoiceOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val attachmentService = client.documents().attachments()

        val documentAttachments = attachmentService.list("document_id")

        documentAttachments.forEach { it.validate() }
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun delete() {
        val client =
            EInvoiceOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val attachmentService = client.documents().attachments()

        val attachment =
            attachmentService.delete(
                AttachmentDeleteParams.builder()
                    .documentId("document_id")
                    .attachmentId("attachment_id")
                    .build()
            )

        attachment.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun add() {
        val client =
            EInvoiceOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val attachmentService = client.documents().attachments()

        val documentAttachment =
            attachmentService.add(
                AttachmentAddParams.builder()
                    .documentId("document_id")
                    .file("some content".byteInputStream())
                    .build()
            )

        documentAttachment.validate()
    }
}
