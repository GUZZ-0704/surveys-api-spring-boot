package com.example.mi_backend.responses.application.usecase;

import com.example.mi_backend.responses.application.port.in.GetSubmissionUseCase;
import com.example.mi_backend.responses.application.port.out.FindSubmissionPort;
import com.example.mi_backend.responses.domain.model.Submission;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class GetSubmissionService implements GetSubmissionUseCase {

    private final FindSubmissionPort findPort;

    public GetSubmissionService(FindSubmissionPort findPort) {
        this.findPort = findPort;
    }

    @Override
    public Submission handle(Long id) {
        return findPort.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Submission no encontrada"));
    }
}
