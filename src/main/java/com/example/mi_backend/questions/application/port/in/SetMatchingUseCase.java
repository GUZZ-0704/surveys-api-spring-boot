package com.example.mi_backend.questions.application.port.in;

import com.example.mi_backend.questions.domain.model.Question;

import java.util.Map;

public interface SetMatchingUseCase {
    Question handle(Long questionId, Map<Long, Long> key);
}
