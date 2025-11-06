package com.example.mi_backend.campaigns.application.port.out;

public interface ExistsCampaignByNamePort {
    boolean existsByNameIgnoreCase(String name);
}
