package com.example.mi_backend.questions.application.usecase;

import com.example.mi_backend.questions.application.port.in.GetQuestionUseCase;
import com.example.mi_backend.questions.application.port.out.LoadQuestionPort;
import com.example.mi_backend.questions.domain.model.Question;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class GetQuestionService implements GetQuestionUseCase {
    private final LoadQuestionPort loadPort;
    public GetQuestionService(LoadQuestionPort loadPort){ this.loadPort = loadPort; }
    @Override public Question handle(Long questionId){ return loadPort.loadById(questionId).orElseThrow(); }
}
