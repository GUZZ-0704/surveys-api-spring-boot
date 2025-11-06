package com.example.mi_backend.campaigns.infrastructure.adapter.in.rest.dto;

import com.example.mi_backend.common.validation.MinWords;
import jakarta.validation.constraints.Size;

public record ChangeDescriptionRequest(
        @Size(max = 2000) @MinWords(2) String description
) {}
