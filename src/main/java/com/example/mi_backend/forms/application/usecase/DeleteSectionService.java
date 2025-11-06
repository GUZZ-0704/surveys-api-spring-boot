package com.example.mi_backend.forms.application.usecase;

import com.example.mi_backend.forms.application.port.in.DeleteSectionUseCase;
import com.example.mi_backend.forms.application.port.out.DeleteSectionPort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DeleteSectionService implements DeleteSectionUseCase {

    private final DeleteSectionPort deletePort;

    public DeleteSectionService(DeleteSectionPort deletePort) { this.deletePort = deletePort; }

    @Override
    public void handle(Long formId, Long sectionId) {
        deletePort.delete(formId, sectionId);
    }
}
