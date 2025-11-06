package com.example.mi_backend.campaigns.application.port.out;

import com.example.mi_backend.campaigns.domain.model.CampaignMember;

import java.util.Optional;

public interface LoadCampaignMemberPort {
    Optional<CampaignMember> loadByCampaignIdAndUserId(Long campaignId, Long userId);
}
