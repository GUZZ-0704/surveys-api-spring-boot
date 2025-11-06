package com.example.mi_backend.campaigns.infrastructure.adapter.in.rest.mapper;

import com.example.mi_backend.campaigns.domain.model.Campaign;
import com.example.mi_backend.campaigns.domain.model.CampaignMember;
import com.example.mi_backend.campaigns.infrastructure.adapter.in.rest.dto.CampaignMemberResponse;
import com.example.mi_backend.campaigns.infrastructure.adapter.in.rest.dto.CampaignResponse;

public final class CampaignRestMapper {
    private CampaignRestMapper(){}

    public static CampaignResponse toResponse(Campaign c) {
        return new CampaignResponse(
                c.getId(), c.getName().getValue(), c.getDescription(),
                c.getStartDate(), c.getEndDate(), c.getStatus(),
                c.getCreatedAt(), c.getUpdatedAt()
        );
    }

    public static CampaignMemberResponse toResponse(CampaignMember m) {
        return new CampaignMemberResponse(
                m.getCampaignId(), m.getUserId(), m.getRole(), m.getCreatedAt()
        );
    }
}
