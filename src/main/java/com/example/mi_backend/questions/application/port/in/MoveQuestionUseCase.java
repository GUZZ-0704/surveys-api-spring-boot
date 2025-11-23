package com.example.mi_backend.questions.application.port.in;

import com.example.mi_backend.questions.domain.model.Question;

public interface MoveQuestionUseCase {
    Question handle(Long questionId, Long targetSectionId, int newPosition);
}
