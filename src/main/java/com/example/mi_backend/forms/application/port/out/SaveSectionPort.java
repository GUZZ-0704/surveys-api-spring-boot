package com.example.mi_backend.forms.application.port.out;

import com.example.mi_backend.forms.domain.model.Section;

public interface SaveSectionPort {
    Section save(Section section);
}
