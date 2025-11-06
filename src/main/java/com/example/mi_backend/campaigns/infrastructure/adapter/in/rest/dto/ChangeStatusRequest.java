package com.example.mi_backend.campaigns.infrastructure.adapter.in.rest.dto;

import com.example.mi_backend.campaigns.domain.model.CampaignStatus;
import jakarta.validation.constraints.NotNull;

public record ChangeStatusRequest(@NotNull CampaignStatus status) {}
