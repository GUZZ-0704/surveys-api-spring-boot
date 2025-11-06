package com.example.mi_backend.campaigns.application.port.out;

import com.example.mi_backend.campaigns.domain.model.CampaignMember;

public interface SaveCampaignMemberPort {
    CampaignMember save(CampaignMember member);
}
