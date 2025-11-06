package com.example.mi_backend.forms.infrastructure.adapter.in.rest.dto;

import java.time.Instant;

public record RescheduleRequest(Instant openAt, Instant closeAt) {}
