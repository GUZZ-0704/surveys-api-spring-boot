package com.example.mi_backend.campaigns.domain.exception;

import com.example.mi_backend.campaigns.domain.model.CampaignStatus;

public class InvalidCampaignStatusTransitionException extends RuntimeException {
    public InvalidCampaignStatusTransitionException(CampaignStatus from, CampaignStatus to) {
        super("Transición de estado inválida: " + from + " → " + to);
    }
}
