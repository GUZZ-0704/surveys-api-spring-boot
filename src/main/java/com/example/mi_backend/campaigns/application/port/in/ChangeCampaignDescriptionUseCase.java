package com.example.mi_backend.campaigns.application.port.in;

import com.example.mi_backend.campaigns.domain.model.Campaign;

public interface ChangeCampaignDescriptionUseCase {
    Campaign handle(Long id, String newDescription);
}
