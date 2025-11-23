package com.example.mi_backend.responses.infrastructure.adapter.in.rest.dto;

import jakarta.validation.constraints.NotNull;

public record SaveTextAnswerRequest(
        @NotNull Long questionId,
        String text
) {}
