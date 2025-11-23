package com.example.mi_backend.responses.application.port.in;

import com.example.mi_backend.responses.application.dto.SaveTrueFalseAnswerCommand;
import com.example.mi_backend.responses.domain.model.Submission;

public interface SaveTrueFalseAnswerUseCase {
    Submission handle(SaveTrueFalseAnswerCommand cmd);
}
