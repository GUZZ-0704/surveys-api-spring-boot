package com.example.mi_backend.responses.application.usecase;

import com.example.mi_backend.responses.application.dto.SaveTrueFalseAnswerCommand;
import com.example.mi_backend.responses.application.port.in.SaveTrueFalseAnswerUseCase;
import com.example.mi_backend.responses.application.port.out.FindSubmissionPort;
import com.example.mi_backend.responses.application.port.out.SaveSubmissionPort;
import com.example.mi_backend.responses.domain.model.Submission;
import com.example.mi_backend.responses.domain.model.TrueFalseAnswer;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SaveTrueFalseAnswerService implements SaveTrueFalseAnswerUseCase {

    private final FindSubmissionPort findPort;
    private final SaveSubmissionPort savePort;

    public SaveTrueFalseAnswerService(FindSubmissionPort findPort, SaveSubmissionPort savePort) {
        this.findPort = findPort;
        this.savePort = savePort;
    }

    @Override
    public Submission handle(SaveTrueFalseAnswerCommand cmd) {
        Submission s = findPort.findById(cmd.submissionId())
                .orElseThrow(() -> new IllegalArgumentException("Submission no encontrada"));
        s.addOrReplaceAnswer(new TrueFalseAnswer(cmd.questionId(), null, cmd.value()));
        return savePort.save(s);
    }
}
