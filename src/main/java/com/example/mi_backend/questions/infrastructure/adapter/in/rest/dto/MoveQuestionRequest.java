package com.example.mi_backend.questions.infrastructure.adapter.in.rest.dto;

public record MoveQuestionRequest(Long targetSectionId, int newPosition) {}
