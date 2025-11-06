package com.example.mi_backend.forms.application.port.in;

import com.example.mi_backend.forms.domain.model.AccessMode;
import com.example.mi_backend.forms.domain.model.Form;

public interface SetAccessModeUseCase {
    Form handle(Long formId, AccessMode mode);
}
