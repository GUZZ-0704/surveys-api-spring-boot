package com.example.mi_backend.responses.application.usecase;

import com.example.mi_backend.responses.application.port.in.RemoveAnswerUseCase;
import com.example.mi_backend.responses.application.port.out.FindSubmissionPort;
import com.example.mi_backend.responses.application.port.out.SaveSubmissionPort;
import com.example.mi_backend.responses.domain.model.Submission;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RemoveAnswerService implements RemoveAnswerUseCase {

    private final FindSubmissionPort findPort;
    private final SaveSubmissionPort savePort;

    public RemoveAnswerService(FindSubmissionPort findPort, SaveSubmissionPort savePort) {
        this.findPort = findPort;
        this.savePort = savePort;
    }

    @Override
    public Submission handle(Long submissionId, Long questionId) {
        Submission s = findPort.findById(submissionId)
                .orElseThrow(() -> new IllegalArgumentException("Submission no encontrada"));
        s.removeAnswer(questionId);
        return savePort.save(s);
    }
}
