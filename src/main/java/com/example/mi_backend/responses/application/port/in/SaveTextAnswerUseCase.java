package com.example.mi_backend.responses.application.port.in;

import com.example.mi_backend.responses.application.dto.SaveTextAnswerCommand;
import com.example.mi_backend.responses.domain.model.Submission;

public interface SaveTextAnswerUseCase {
    Submission handle(SaveTextAnswerCommand cmd);
}
