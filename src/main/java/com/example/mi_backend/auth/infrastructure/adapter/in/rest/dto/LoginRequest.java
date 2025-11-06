package com.example.mi_backend.auth.infrastructure.adapter.in.rest.dto;

import com.example.mi_backend.common.validation.NoWhitespace;
import com.example.mi_backend.common.validation.ValidEmail;
import jakarta.validation.constraints.NotBlank;

public record LoginRequest(
        @NotBlank @ValidEmail @NoWhitespace String email,
        @NotBlank String password
) {}
