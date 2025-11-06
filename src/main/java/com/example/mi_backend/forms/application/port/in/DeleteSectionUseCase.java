package com.example.mi_backend.forms.application.port.in;

public interface DeleteSectionUseCase {
    void handle(Long formId, Long sectionId);
}
