package com.example.mi_backend.responses.application.dto;

public record SaveTrueFalseAnswerCommand(
        Long submissionId,
        Long questionId,
        boolean value
) {}
