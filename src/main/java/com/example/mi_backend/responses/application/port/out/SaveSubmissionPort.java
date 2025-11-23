package com.example.mi_backend.responses.application.port.out;

import com.example.mi_backend.responses.domain.model.Submission;

public interface SaveSubmissionPort {
    Submission save(Submission submission);
}
