package com.example.mi_backend.forms.application.port.in;

import com.example.mi_backend.forms.domain.model.Form;
import com.example.mi_backend.forms.domain.model.FormStatus;

public interface ChangeFormStatusUseCase {
    Form handle(Long formId, FormStatus target);
}
