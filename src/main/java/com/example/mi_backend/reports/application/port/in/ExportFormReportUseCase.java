package com.example.mi_backend.reports.application.port.in;

import com.example.mi_backend.reports.application.dto.ExportedFile;
import com.example.mi_backend.reports.application.dto.ExportFormReportQuery;

public interface ExportFormReportUseCase {
    ExportedFile handle(ExportFormReportQuery query);
}
