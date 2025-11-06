package com.example.mi_backend.campaigns.application.port.in;

import com.example.mi_backend.campaigns.domain.model.CampaignMember;
import com.example.mi_backend.campaigns.domain.model.CampaignMemberRole;

public interface AddCampaignMemberUseCase {
    CampaignMember handle(Long campaignId, Long userId, CampaignMemberRole role);
}
