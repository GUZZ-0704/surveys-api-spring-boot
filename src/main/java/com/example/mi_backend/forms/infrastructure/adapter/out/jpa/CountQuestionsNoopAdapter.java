package com.example.mi_backend.forms.infrastructure.adapter.out.jpa;

import com.example.mi_backend.forms.application.port.out.CountQuestionsByFormPort;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//Provisorio sin questions aun
@Component
@Primary
public class CountQuestionsNoopAdapter implements CountQuestionsByFormPort {
    @Override public long countByFormId(Long formId) { return 0L; }
}
