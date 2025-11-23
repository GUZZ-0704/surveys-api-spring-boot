package com.example.mi_backend.responses.application.exception;

public class ResponsePolicyViolationException extends RuntimeException {
    public ResponsePolicyViolationException(String message) { super(message); }
}
