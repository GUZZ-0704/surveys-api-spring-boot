package com.example.mi_backend.forms.application.port.out;

import com.example.mi_backend.forms.domain.model.Form;

public interface SaveFormPort {
    Form save(Form form);
}
