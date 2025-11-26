package com.example.mi_backend.reports.application.dto;

public record ExportCampaignReportQuery(
        Long campaignId,
        boolean includeDrafts,
        ExportFormat format
) { }
