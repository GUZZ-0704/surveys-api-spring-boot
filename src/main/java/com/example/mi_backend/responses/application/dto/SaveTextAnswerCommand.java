package com.example.mi_backend.responses.application.dto;

public record SaveTextAnswerCommand(
        Long submissionId,
        Long questionId,
        String text
) {}
