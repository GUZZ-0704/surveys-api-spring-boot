package com.example.mi_backend.campaigns.application.port.in;

import com.example.mi_backend.campaigns.application.dto.MemberListQuery;
import com.example.mi_backend.campaigns.domain.model.CampaignMember;
import com.example.mi_backend.common.dto.PagedResult;

public interface ListCampaignMembersUseCase {
    PagedResult<CampaignMember> handle(MemberListQuery query);
}
