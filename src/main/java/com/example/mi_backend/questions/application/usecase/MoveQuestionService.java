package com.example.mi_backend.questions.application.usecase;

import com.example.mi_backend.questions.application.port.in.MoveQuestionUseCase;
import com.example.mi_backend.questions.application.port.out.ReorderQuestionsPort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MoveQuestionService implements MoveQuestionUseCase {

    private final ReorderQuestionsPort reorder;

    public MoveQuestionService(ReorderQuestionsPort reorder) { this.reorder = reorder; }

    @Override
    public com.example.mi_backend.questions.domain.model.Question handle(Long questionId, Long targetSectionId, int newPosition) {
        if (newPosition < 0) throw new IllegalArgumentException("newPosition >= 0");
        return reorder.moveTo(questionId, targetSectionId, newPosition);
    }
}
