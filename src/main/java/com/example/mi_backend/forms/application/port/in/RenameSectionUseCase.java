package com.example.mi_backend.forms.application.port.in;

import com.example.mi_backend.forms.domain.model.Section;

public interface RenameSectionUseCase {
    Section handle(Long formId, Long sectionId, String newTitle);
}
