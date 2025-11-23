package com.example.mi_backend.responses.application.dto;

import com.example.mi_backend.responses.domain.model.SubmissionStatus;

public record ListSubmissionsQuery(
        Long formId,
        Long respondentUserId,
        SubmissionStatus status,
        int page,
        int size
) {}
