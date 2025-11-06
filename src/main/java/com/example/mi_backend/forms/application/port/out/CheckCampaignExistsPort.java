package com.example.mi_backend.forms.application.port.out;

public interface CheckCampaignExistsPort {
    boolean existsById(Long campaignId);
}
