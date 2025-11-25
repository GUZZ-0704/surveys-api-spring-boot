package com.example.mi_backend.reports.domain.exception;

public class ReportException extends RuntimeException {
    public ReportException(String message) { super(message); }
    public ReportException(String message, Throwable cause) { super(message, cause); }
}
