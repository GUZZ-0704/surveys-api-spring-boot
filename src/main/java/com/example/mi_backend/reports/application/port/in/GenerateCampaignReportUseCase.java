package com.example.mi_backend.reports.application.port.in;

import com.example.mi_backend.reports.application.dto.CampaignReportQuery;
import com.example.mi_backend.reports.domain.model.CampaignReport;

public interface GenerateCampaignReportUseCase {
    CampaignReport handle(CampaignReportQuery query);
}
