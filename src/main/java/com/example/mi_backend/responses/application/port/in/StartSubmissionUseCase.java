package com.example.mi_backend.responses.application.port.in;

import com.example.mi_backend.responses.application.dto.StartSubmissionCommand;
import com.example.mi_backend.responses.domain.model.Submission;

public interface StartSubmissionUseCase {
    Submission handle(StartSubmissionCommand cmd);
}
