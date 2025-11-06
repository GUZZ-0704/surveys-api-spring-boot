package com.example.mi_backend.forms.application.port.out;

public interface ExistsFormByTitleInCampaignPort {
    boolean exists(Long campaignId, String title);
}
