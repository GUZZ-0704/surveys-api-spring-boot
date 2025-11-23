package com.example.mi_backend.questions.application.port.in;

import com.example.mi_backend.questions.domain.model.Question;

public interface SetTextSettingsUseCase {
    Question handle(Long questionId, String textMode, String placeholder, Integer minLength, Integer maxLength);
}
