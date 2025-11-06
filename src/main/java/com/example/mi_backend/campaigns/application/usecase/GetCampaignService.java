package com.example.mi_backend.campaigns.application.usecase;

import com.example.mi_backend.campaigns.application.port.in.GetCampaignUseCase;
import com.example.mi_backend.campaigns.application.port.out.LoadCampaignPort;
import com.example.mi_backend.campaigns.domain.exception.CampaignNotFoundException;
import com.example.mi_backend.campaigns.domain.model.Campaign;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class GetCampaignService implements GetCampaignUseCase {

    private final LoadCampaignPort loadPort;

    public GetCampaignService(LoadCampaignPort loadPort) { this.loadPort = loadPort; }

    @Override
    public Campaign handle(Long id) {
        return loadPort.loadById(id).orElseThrow(() -> new CampaignNotFoundException(id));
    }
}
