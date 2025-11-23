package com.example.mi_backend.questions.application.port.in;

import com.example.mi_backend.questions.domain.model.Question;

public interface SetMultiBoundsUseCase {
    Question handle(Long questionId, Integer min, Integer max);
}
