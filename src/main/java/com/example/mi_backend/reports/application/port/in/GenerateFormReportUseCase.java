package com.example.mi_backend.reports.application.port.in;

import com.example.mi_backend.reports.application.dto.FormReportQuery;
import com.example.mi_backend.reports.domain.model.FormReport;

public interface GenerateFormReportUseCase {
    FormReport handle(FormReportQuery query);
}
