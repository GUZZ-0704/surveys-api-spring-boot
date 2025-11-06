package com.example.mi_backend.campaigns.infrastructure.adapter.in.rest.dto;

import com.example.mi_backend.common.validation.MinWords;
import com.example.mi_backend.common.validation.NoWhitespace;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public record CreateCampaignRequest(
        @NotBlank @NoWhitespace @Size(max = 200) String name,
        @Size(max = 2000) @MinWords(2) String description,
        LocalDate startDate,
        LocalDate endDate
) {}
