package com.example.mi_backend.campaigns.application.port.in;

import com.example.mi_backend.campaigns.application.dto.CampaignListQuery;
import com.example.mi_backend.campaigns.domain.model.Campaign;
import com.example.mi_backend.common.dto.PagedResult;

public interface ListCampaignsUseCase {
    PagedResult<Campaign> handle(CampaignListQuery query);
}
