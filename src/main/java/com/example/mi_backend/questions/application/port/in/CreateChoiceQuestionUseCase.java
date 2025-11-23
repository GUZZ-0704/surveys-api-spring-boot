package com.example.mi_backend.questions.application.port.in;

import com.example.mi_backend.questions.domain.model.Question;

import java.util.List;

public interface CreateChoiceQuestionUseCase {
    Question handle(Long formId,
                    Long sectionId,
                    String prompt,
                    String helpText,
                    boolean required,
                    boolean shuffleOptions,
                    String selectionMode,
                    Integer minSelections,
                    Integer maxSelections,
                    List<OptionCmd> options
    );

    record OptionCmd(String label, boolean correct) {}
}
