package com.example.mi_backend.campaigns.application.port.in;

import com.example.mi_backend.campaigns.domain.model.Campaign;

import java.time.LocalDate;

public interface RescheduleCampaignUseCase {
    Campaign handle(Long id, LocalDate newStart, LocalDate newEnd);
}
