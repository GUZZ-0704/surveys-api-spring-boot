package com.example.mi_backend.reports.application.dto;

public record ExportedFile(
        String filename,
        String contentType,
        byte[] bytes
) { }
