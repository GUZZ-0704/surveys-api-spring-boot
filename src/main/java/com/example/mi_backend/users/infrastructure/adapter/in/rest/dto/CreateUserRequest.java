package com.example.mi_backend.users.infrastructure.adapter.in.rest.dto;

import com.example.mi_backend.common.validation.MinWords;
import com.example.mi_backend.common.validation.NoWhitespace;
import com.example.mi_backend.common.validation.ValidEmail;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record CreateUserRequest(
        @NotBlank @ValidEmail @NoWhitespace String email,
        @NotBlank @NoWhitespace @Size(max = 255) @MinWords(2) String fullName,
        Boolean systemAdmin
) {}
