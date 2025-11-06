package com.example.mi_backend.campaigns.application.port.out;

import com.example.mi_backend.campaigns.application.dto.MemberListQuery;
import com.example.mi_backend.campaigns.domain.model.CampaignMember;
import com.example.mi_backend.common.dto.PagedResult;

public interface SearchCampaignMembersPort {
    PagedResult<CampaignMember> search(MemberListQuery query);
}
