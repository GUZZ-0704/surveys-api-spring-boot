package com.example.mi_backend.responses.infrastructure.adapter.in.rest.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public record SaveMatchingAnswerRequest(
        @NotNull Long questionId,
        List<Pair> pairs
) {
    public record Pair(Long leftId, Long rightId) {}
}
