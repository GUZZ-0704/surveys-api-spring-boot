package com.example.mi_backend.campaigns.application.port.out;

import com.example.mi_backend.campaigns.domain.model.Campaign;

import java.util.Optional;

public interface LoadCampaignPort {
    Optional<Campaign> loadById(Long id);
}
