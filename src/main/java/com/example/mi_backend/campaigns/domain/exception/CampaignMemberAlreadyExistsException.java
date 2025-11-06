package com.example.mi_backend.campaigns.domain.exception;

public class CampaignMemberAlreadyExistsException extends RuntimeException {
    public CampaignMemberAlreadyExistsException(Long campaignId, Long userId) {
        super("El usuario " + userId + " ya es miembro de la campaign " + campaignId);
    }
}
