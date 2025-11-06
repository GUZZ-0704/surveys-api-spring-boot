package com.example.mi_backend.forms.application.port.in;

import com.example.mi_backend.forms.domain.model.Section;

public interface AddSectionUseCase {
    Section handle(Long formId, String title);
}
