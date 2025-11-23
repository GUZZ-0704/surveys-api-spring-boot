package com.example.mi_backend.questions.application.port.in;

import com.example.mi_backend.questions.domain.model.Question;

import java.util.List;

public interface ReplaceChoiceOptionsUseCase {
    Question handle(Long questionId, List<CreateChoiceQuestionUseCase.OptionCmd> options);
}
