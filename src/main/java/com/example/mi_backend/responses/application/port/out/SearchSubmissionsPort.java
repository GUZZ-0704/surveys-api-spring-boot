package com.example.mi_backend.responses.application.port.out;

import com.example.mi_backend.common.dto.PagedResult;
import com.example.mi_backend.responses.domain.model.Submission;
import com.example.mi_backend.responses.domain.model.SubmissionStatus;

public interface SearchSubmissionsPort {
    PagedResult<Submission> findByForm(Long formId, SubmissionStatus status, int page, int size);
}
