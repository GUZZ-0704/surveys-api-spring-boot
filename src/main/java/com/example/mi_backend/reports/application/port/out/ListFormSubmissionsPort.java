package com.example.mi_backend.reports.application.port.out;

import com.example.mi_backend.responses.domain.model.Submission;

import java.util.List;

public interface ListFormSubmissionsPort {
    List<Submission> findByFormId(Long formId);
}
