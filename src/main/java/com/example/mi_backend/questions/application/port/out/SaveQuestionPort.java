package com.example.mi_backend.questions.application.port.out;

import com.example.mi_backend.questions.domain.model.Question;

public interface SaveQuestionPort {
    Question save(Question question);
}
