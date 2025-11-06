package com.example.mi_backend.campaigns.application.port.in;

import com.example.mi_backend.campaigns.domain.model.Campaign;
import com.example.mi_backend.campaigns.domain.model.CampaignStatus;

public interface ChangeCampaignStatusUseCase {
    Campaign handle(Long id, CampaignStatus targetStatus);
}
