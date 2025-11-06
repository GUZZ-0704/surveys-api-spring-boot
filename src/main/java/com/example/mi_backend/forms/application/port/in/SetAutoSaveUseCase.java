package com.example.mi_backend.forms.application.port.in;

import com.example.mi_backend.forms.domain.model.Form;

public interface SetAutoSaveUseCase {
    Form handle(Long formId, boolean enabled);
}
