package com.example.mi_backend.questions.application.port.out;

import com.example.mi_backend.common.dto.PagedResult;
import com.example.mi_backend.questions.application.dto.QuestionListQuery;
import com.example.mi_backend.questions.domain.model.Question;

public interface SearchQuestionsPort {
    PagedResult<Question> search(QuestionListQuery query);
}
