package com.example.mi_backend.campaigns.infrastructure.adapter.in.rest.dto;

import com.example.mi_backend.campaigns.domain.model.CampaignMemberRole;
import jakarta.validation.constraints.NotNull;

public record ChangeMemberRoleRequest(@NotNull CampaignMemberRole role) {}
