package com.example.mi_backend.questions.application.port.in;

import com.example.mi_backend.questions.domain.model.Question;

public interface ChangeHelpUseCase {
    Question handle(Long questionId, String newHelp);
}
