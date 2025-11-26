package com.example.mi_backend.reports.application.dto;

public record ExportFormReportQuery(
        Long formId,
        boolean includeDrafts,
        ExportFormat format
) { }
