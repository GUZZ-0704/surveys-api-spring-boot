package com.example.mi_backend.users.infrastructure.adapter.in.rest.dto;

import com.example.mi_backend.users.domain.model.UserStatus;
import jakarta.validation.constraints.NotNull;

public record ChangeStatusRequest(@NotNull UserStatus status) { }
