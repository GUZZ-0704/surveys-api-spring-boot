package com.example.mi_backend.responses.application.port.out;

import com.example.mi_backend.responses.domain.valueobject.QuestionSnapshot;

import java.util.Map;

public interface BuildQuestionSnapshotsPort {
    Map<Long, QuestionSnapshot> byFormId(Long formId);
}
