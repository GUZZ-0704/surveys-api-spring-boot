package com.example.mi_backend.campaigns.application.dto;

import com.example.mi_backend.campaigns.domain.model.CampaignMemberRole;

public record MemberListQuery(
        Long campaignId,
        CampaignMemberRole role,
        int page,
        int size
) {
    public MemberListQuery {
        if (campaignId == null) throw new IllegalArgumentException("campaignId requerido");
        if (page < 0) throw new IllegalArgumentException("page debe ser >= 0");
        if (size <= 0 || size > 200) throw new IllegalArgumentException("size inválido");
    }
}
