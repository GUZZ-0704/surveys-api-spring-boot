package com.example.mi_backend.campaigns.application.port.out;

import com.example.mi_backend.campaigns.domain.model.Campaign;

public interface SaveCampaignPort {
    Campaign save(Campaign campaign);
}
