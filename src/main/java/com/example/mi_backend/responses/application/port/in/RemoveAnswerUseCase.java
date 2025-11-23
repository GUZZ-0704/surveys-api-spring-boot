package com.example.mi_backend.responses.application.port.in;

import com.example.mi_backend.responses.domain.model.Submission;

public interface RemoveAnswerUseCase {
    Submission handle(Long submissionId, Long questionId);
}
