package com.example.mi_backend.responses.application.port.in;

import com.example.mi_backend.responses.application.dto.SubmitSubmissionCommand;
import com.example.mi_backend.responses.domain.model.Submission;

public interface SubmitSubmissionUseCase {
    Submission handle(SubmitSubmissionCommand cmd);
}
