package com.example.mi_backend.responses.infrastructure.adapter.in.rest.dto;

import jakarta.validation.constraints.NotNull;

public record SaveTrueFalseAnswerRequest(
        @NotNull Long questionId,
        boolean value
) {}
