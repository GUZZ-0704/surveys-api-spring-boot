package com.example.mi_backend.forms.application.port.in;

import com.example.mi_backend.forms.domain.model.Form;

public interface ChangeThemeUseCase {
    Form handle(Long formId, String mode, String primaryColor);
}
