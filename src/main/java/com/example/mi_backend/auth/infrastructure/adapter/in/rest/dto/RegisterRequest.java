package com.example.mi_backend.auth.infrastructure.adapter.in.rest.dto;

import com.example.mi_backend.common.validation.NoWhitespace;
import com.example.mi_backend.common.validation.StrongPassword;
import com.example.mi_backend.common.validation.ValidEmail;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record RegisterRequest(
        @NotBlank @ValidEmail @NoWhitespace String email,
        @NotBlank @NoWhitespace @Size(max = 255) String fullName,
        @NotBlank @StrongPassword String password,
        Boolean systemAdmin
) {}
