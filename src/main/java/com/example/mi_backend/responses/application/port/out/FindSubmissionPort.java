package com.example.mi_backend.responses.application.port.out;

import com.example.mi_backend.responses.domain.model.Submission;

import java.util.Optional;

public interface FindSubmissionPort {
    Optional<Submission> findById(Long id);
}
