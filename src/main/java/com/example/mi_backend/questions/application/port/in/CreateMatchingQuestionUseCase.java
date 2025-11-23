// port/in/CreateMatchingQuestionUseCase.java
package com.example.mi_backend.questions.application.port.in;

import com.example.mi_backend.questions.domain.model.Question;

import java.util.List;

public interface CreateMatchingQuestionUseCase {
    Question handle(Long formId,
                    Long sectionId,
                    String prompt,
                    String helpText,
                    boolean required,
                    boolean shuffleRightColumn,
                    List<String> leftTexts,
                    List<String> rightTexts,
                    List<PairIdx> keyPairs
    );

    record PairIdx(int leftIndex, int rightIndex) {}
}
