package com.example.mi_backend.reports.application.port.out;

import java.util.List;

public interface ListFormsByCampaignPort {
    List<Long> findFormIdsByCampaign(Long campaignId);
}
