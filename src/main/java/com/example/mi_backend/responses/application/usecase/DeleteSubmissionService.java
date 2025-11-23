package com.example.mi_backend.responses.application.usecase;

import com.example.mi_backend.responses.application.port.in.DeleteSubmissionUseCase;
import com.example.mi_backend.responses.application.port.out.DeleteSubmissionPort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DeleteSubmissionService implements DeleteSubmissionUseCase {

    private final DeleteSubmissionPort deletePort;

    public DeleteSubmissionService(DeleteSubmissionPort deletePort) {
        this.deletePort = deletePort;
    }

    @Override
    public void handle(Long id) {
        deletePort.deleteById(id);
    }
}
