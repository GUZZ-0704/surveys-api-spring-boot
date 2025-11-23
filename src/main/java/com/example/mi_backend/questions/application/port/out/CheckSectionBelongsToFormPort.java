package com.example.mi_backend.questions.application.port.out;

public interface CheckSectionBelongsToFormPort {
    boolean belongs(Long formId, Long sectionId);
}
