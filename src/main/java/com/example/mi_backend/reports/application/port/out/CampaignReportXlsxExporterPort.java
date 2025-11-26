package com.example.mi_backend.reports.application.port.out;

import com.example.mi_backend.reports.domain.model.CampaignReport;

public interface CampaignReportXlsxExporterPort {
    byte[] export(CampaignReport report);
}