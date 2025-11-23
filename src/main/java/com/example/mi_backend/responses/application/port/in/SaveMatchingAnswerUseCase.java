package com.example.mi_backend.responses.application.port.in;

import com.example.mi_backend.responses.application.dto.SaveMatchingAnswerCommand;
import com.example.mi_backend.responses.domain.model.Submission;

public interface SaveMatchingAnswerUseCase {
    Submission handle(SaveMatchingAnswerCommand cmd);
}
