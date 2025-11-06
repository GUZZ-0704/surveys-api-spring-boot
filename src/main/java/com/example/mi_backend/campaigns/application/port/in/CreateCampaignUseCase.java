package com.example.mi_backend.campaigns.application.port.in;

import com.example.mi_backend.campaigns.domain.model.Campaign;

import java.time.LocalDate;

public interface CreateCampaignUseCase {
    Campaign handle(String name, String description, LocalDate startDate, LocalDate endDate);
}
