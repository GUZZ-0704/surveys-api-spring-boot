package com.example.mi_backend.questions.infrastructure.adapter.in.rest.dto;

import java.util.Map;

public record SetMatchingKeyRequest(Map<Long, Long> key) {}
