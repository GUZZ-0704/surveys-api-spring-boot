package com.example.mi_backend.questions.application.port.out;

import com.example.mi_backend.questions.domain.model.Question;

import java.util.Optional;

public interface LoadQuestionPort {
    Optional<Question> loadById(Long id);
}
