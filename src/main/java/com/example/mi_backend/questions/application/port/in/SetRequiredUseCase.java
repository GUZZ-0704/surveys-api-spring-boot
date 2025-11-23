package com.example.mi_backend.questions.application.port.in;

import com.example.mi_backend.questions.domain.model.Question;

public interface SetRequiredUseCase {
    Question handle(Long questionId, boolean required);
}
