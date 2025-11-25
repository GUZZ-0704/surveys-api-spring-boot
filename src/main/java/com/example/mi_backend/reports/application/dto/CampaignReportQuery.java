package com.example.mi_backend.reports.application.dto;

public record CampaignReportQuery(
        Long campaignId,
        boolean includeDrafts
) { }
