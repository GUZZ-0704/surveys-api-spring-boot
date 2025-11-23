package com.example.mi_backend.questions.application.port.in;

import com.example.mi_backend.questions.domain.model.Question;

public interface RenameQuestionUseCase {
    Question handle(Long questionId, String newPrompt);
}
