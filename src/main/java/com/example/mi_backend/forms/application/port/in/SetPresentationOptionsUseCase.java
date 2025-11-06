package com.example.mi_backend.forms.application.port.in;

import com.example.mi_backend.forms.domain.model.Form;

public interface SetPresentationOptionsUseCase {
    Form handle(Long formId, boolean shuffleQuestions, boolean shuffleOptions, boolean progressBar, boolean paginated);
}
