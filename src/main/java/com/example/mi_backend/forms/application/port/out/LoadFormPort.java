package com.example.mi_backend.forms.application.port.out;

import com.example.mi_backend.forms.domain.model.Form;

import java.util.Optional;

public interface LoadFormPort {
    Optional<Form> loadById(Long formId);
}
