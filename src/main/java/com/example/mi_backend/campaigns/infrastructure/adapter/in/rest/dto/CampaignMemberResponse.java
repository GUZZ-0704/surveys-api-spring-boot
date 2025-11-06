package com.example.mi_backend.campaigns.infrastructure.adapter.in.rest.dto;

import com.example.mi_backend.campaigns.domain.model.CampaignMemberRole;

import java.time.Instant;

public record CampaignMemberResponse(
        Long campaignId,
        Long userId,
        CampaignMemberRole role,
        Instant createdAt
) {}
