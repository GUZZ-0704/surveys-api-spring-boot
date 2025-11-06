package com.example.mi_backend.campaigns.application.usecase;

import com.example.mi_backend.campaigns.application.port.in.DeleteCampaignUseCase;
import com.example.mi_backend.campaigns.application.port.out.DeleteCampaignPort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DeleteCampaignService implements DeleteCampaignUseCase {

    private final DeleteCampaignPort deletePort;

    public DeleteCampaignService(DeleteCampaignPort deletePort) { this.deletePort = deletePort; }

    @Override
    public void handle(Long id) {
        deletePort.deleteById(id);
    }
}
