package com.example.mi_backend.reports.application.dto;

public record FormReportQuery(
        Long formId,
        boolean includeDrafts
) { }
