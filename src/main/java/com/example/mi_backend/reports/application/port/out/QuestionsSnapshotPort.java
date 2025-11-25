package com.example.mi_backend.reports.application.port.out;

import com.example.mi_backend.responses.domain.valueobject.QuestionSnapshot;

import java.util.Map;

public interface QuestionsSnapshotPort {
    Map<Long, QuestionSnapshot> byFormId(Long formId);
}
