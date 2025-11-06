package com.example.mi_backend.forms.infrastructure.adapter.in.rest.dto;

import com.example.mi_backend.forms.domain.model.FormStatus;
import jakarta.validation.constraints.NotNull;

public record ChangeStatusRequest(@NotNull FormStatus status) {}
