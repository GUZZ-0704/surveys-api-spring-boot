package com.example.mi_backend.campaigns.domain.exception;

public class CampaignNotFoundException extends RuntimeException {
    public CampaignNotFoundException(Long id) {
        super("Campaign id=" + id + " no encontrada");
    }
}
