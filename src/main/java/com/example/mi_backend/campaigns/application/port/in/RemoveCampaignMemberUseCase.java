package com.example.mi_backend.campaigns.application.port.in;

public interface RemoveCampaignMemberUseCase {
    void handle(Long campaignId, Long userId);
}
