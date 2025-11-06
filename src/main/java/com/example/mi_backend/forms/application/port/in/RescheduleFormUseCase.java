package com.example.mi_backend.forms.application.port.in;

import com.example.mi_backend.forms.domain.model.Form;

import java.time.Instant;

public interface RescheduleFormUseCase {
    Form handle(Long formId, Instant openAt, Instant closeAt);
}
