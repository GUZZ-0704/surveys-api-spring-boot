package com.example.mi_backend.questions.application.port.out;

public interface ComputeNextQuestionPositionPort {
    int nextPosition(Long formId, Long sectionId);
}
