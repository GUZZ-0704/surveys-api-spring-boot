package com.example.mi_backend.reports.application.port.out;

import com.example.mi_backend.reports.domain.model.FormReport;

public interface FormReportPdfExporterPort {
    byte[] export(FormReport report);
}