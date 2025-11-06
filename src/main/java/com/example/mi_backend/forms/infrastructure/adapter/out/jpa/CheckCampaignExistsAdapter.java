package com.example.mi_backend.forms.infrastructure.adapter.out.jpa;

import com.example.mi_backend.campaigns.infrastructure.adapter.out.jpa.repository.CampaignJpaRepository;
import com.example.mi_backend.forms.application.port.out.CheckCampaignExistsPort;
import org.springframework.stereotype.Component;

@Component
public class CheckCampaignExistsAdapter implements CheckCampaignExistsPort {
    private final CampaignJpaRepository campaigns;
    public CheckCampaignExistsAdapter(CampaignJpaRepository campaigns) { this.campaigns = campaigns; }
    @Override public boolean existsById(Long campaignId) { return campaigns.existsById(campaignId); }
}
