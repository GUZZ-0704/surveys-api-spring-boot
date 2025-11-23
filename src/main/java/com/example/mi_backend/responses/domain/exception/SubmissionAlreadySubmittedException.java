package com.example.mi_backend.responses.domain.exception;

public class SubmissionAlreadySubmittedException extends RuntimeException {
    public SubmissionAlreadySubmittedException(String message) { super(message); }
}
