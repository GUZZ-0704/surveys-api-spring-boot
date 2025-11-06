package com.example.mi_backend.users.infrastructure.adapter.in.rest.dto;

import com.example.mi_backend.common.validation.MinWords;
import com.example.mi_backend.common.validation.NoWhitespace;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record RenameUserRequest(
        @NotBlank @NoWhitespace @Size(max = 255) @MinWords(2) String fullName
) {}
