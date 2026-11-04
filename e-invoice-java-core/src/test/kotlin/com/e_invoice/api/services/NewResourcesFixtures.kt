package com.e_invoice.api.services

/** Canned JSON responses shared by the mailbox, drafts, stats and conversion service tests. */
internal object NewResourcesFixtures {

    const val INBOUND_EMAIL =
        """
        {
          "id": "ie_123",
          "message_id": "<msg@example.com>",
          "sender_email": "sender@example.com",
          "sender_name": "Sender",
          "to_addresses": "inbox@example.com",
          "cc_addresses": null,
          "bcc_addresses": null,
          "subject": "Invoice",
          "attachments": [
            {"filename": "invoice.pdf", "size": 1024, "content_type": "application/pdf"}
          ],
          "attachment_count": 1,
          "processed": true,
          "error_message": null,
          "document_id": "doc_123",
          "received_at": "2025-01-01T10:00:00Z",
          "processed_at": "2025-01-01T10:01:00Z",
          "created_at": "2025-01-01T10:00:00Z"
        }
        """

    val INBOUND_EMAIL_PAGE =
        """
        {
          "items": [$INBOUND_EMAIL],
          "total": 1,
          "page": 1,
          "page_size": 20,
          "pages": 1,
          "has_next_page": false
        }
        """

    const val DRAFTS_PAGE =
        """
        {
          "items": [{"id": "doc_123", "created_at": "2025-01-01T10:00:00Z", "state": "DRAFT"}],
          "total": 1,
          "page": 1,
          "page_size": 20,
          "pages": 1,
          "has_next_page": false
        }
        """

    const val STATS =
        """
        {
          "tenant_id": "tenant_123",
          "period_start": "2025-01-01",
          "period_end": "2025-01-31",
          "aggregation": "DAY",
          "actions": [
            {"action": "DOCUMENT_SENT", "stat_date": "2025-01-02", "count": 4},
            {"action": "DOCUMENT_RECEIVED", "stat_date": "2025-01-02", "count": 2}
          ],
          "total_days": 31,
          "average_daily_usage": 0.19,
          "budget_estimation_days": 120.5
        }
        """

    const val TASK = """{"task_id": "task_123", "status": "pending"}"""

    const val PDF_RESULT =
        """
        {
          "invoice_id": "INV-1",
          "success": true,
          "ubl_document": "<Invoice/>"
        }
        """
}
