package com.example.mi_backend.users.infrastructure.adapter.in.rest.dto;

import com.example.mi_backend.users.domain.model.UserStatus;

import java.time.Instant;

public record UserResponse(
        Long id,
        String email,
        String fullName,
        boolean systemAdmin,
        UserStatus status,
        Instant createdAt,
        Instant updatedAt
) {}
