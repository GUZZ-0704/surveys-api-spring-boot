package com.example.mi_backend.campaigns.application.usecase;

import com.example.mi_backend.campaigns.application.dto.MemberListQuery;
import com.example.mi_backend.campaigns.application.port.in.ListCampaignMembersUseCase;
import com.example.mi_backend.campaigns.application.port.out.SearchCampaignMembersPort;
import com.example.mi_backend.campaigns.domain.model.CampaignMember;
import com.example.mi_backend.common.dto.PagedResult;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class ListCampaignMembersService implements ListCampaignMembersUseCase {

    private final SearchCampaignMembersPort searchPort;

    public ListCampaignMembersService(SearchCampaignMembersPort searchPort) {
        this.searchPort = searchPort;
    }

    @Override
    public PagedResult<CampaignMember> handle(MemberListQuery query) {
        return searchPort.search(query);
    }
}
