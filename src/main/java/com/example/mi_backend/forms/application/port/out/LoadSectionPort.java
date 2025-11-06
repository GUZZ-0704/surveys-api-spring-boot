package com.example.mi_backend.forms.application.port.out;

import com.example.mi_backend.forms.domain.model.Section;

import java.util.Optional;

public interface LoadSectionPort {
    Optional<Section> loadById(Long sectionId);
}
