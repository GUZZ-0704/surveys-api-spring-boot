package com.example.mi_backend.responses.application.port.in;

import com.example.mi_backend.common.dto.PagedResult;
import com.example.mi_backend.responses.application.dto.ListSubmissionsQuery;
import com.example.mi_backend.responses.domain.model.Submission;

public interface GetSubmissionUseCase { Submission handle(Long id); }

