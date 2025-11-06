package com.example.mi_backend.forms.application.port.out;

import com.example.mi_backend.forms.domain.model.Section;

public interface ReorderSectionsPort {
    Section moveTo(Long formId, Long sectionId, int newPosition);
}
