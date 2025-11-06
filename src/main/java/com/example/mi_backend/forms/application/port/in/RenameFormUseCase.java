package com.example.mi_backend.forms.application.port.in;

import com.example.mi_backend.forms.domain.model.Form;

public interface RenameFormUseCase {
    Form handle(Long formId, String newTitle);
}
