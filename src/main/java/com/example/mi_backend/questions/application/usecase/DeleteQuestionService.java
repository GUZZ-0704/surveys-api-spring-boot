package com.example.mi_backend.questions.application.usecase;

import com.example.mi_backend.questions.application.port.in.DeleteQuestionUseCase;
import com.example.mi_backend.questions.application.port.out.DeleteQuestionPort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DeleteQuestionService implements DeleteQuestionUseCase {
    private final DeleteQuestionPort deletePort;
    public DeleteQuestionService(DeleteQuestionPort deletePort){ this.deletePort = deletePort; }
    @Override public void handle(Long questionId){ deletePort.deleteById(questionId); }
}
