package com.example.mi_backend.campaigns.infrastructure.adapter.in.rest.dto;

import java.time.LocalDate;

public record RescheduleCampaignRequest(
        LocalDate startDate,
        LocalDate endDate
) {}
