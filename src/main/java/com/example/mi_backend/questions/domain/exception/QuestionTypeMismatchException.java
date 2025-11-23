package com.example.mi_backend.questions.domain.exception;
public class QuestionTypeMismatchException extends RuntimeException {
    public QuestionTypeMismatchException(String message){ super(message); }
}
