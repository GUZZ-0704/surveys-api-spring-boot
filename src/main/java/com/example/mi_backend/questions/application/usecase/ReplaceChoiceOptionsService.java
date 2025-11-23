package com.example.mi_backend.questions.application.usecase;

import com.example.mi_backend.questions.application.port.in.CreateChoiceQuestionUseCase;
import com.example.mi_backend.questions.application.port.in.ReplaceChoiceOptionsUseCase;
import com.example.mi_backend.questions.application.port.out.LoadQuestionPort;
import com.example.mi_backend.questions.application.port.out.SaveQuestionPort;
import com.example.mi_backend.questions.domain.model.Option;
import com.example.mi_backend.questions.domain.model.Question;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Clock;
import java.time.Instant;
import java.util.ArrayList;

@Service
@Transactional
public class ReplaceChoiceOptionsService implements ReplaceChoiceOptionsUseCase {

    private final LoadQuestionPort loadPort; private final SaveQuestionPort savePort; private final Clock clock;
    public ReplaceChoiceOptionsService(LoadQuestionPort loadPort, SaveQuestionPort savePort, Clock clock){
        this.loadPort = loadPort; this.savePort = savePort; this.clock = clock;
    }

    @Override
    public Question handle(Long questionId, java.util.List<CreateChoiceQuestionUseCase.OptionCmd> options) {
        var q = loadPort.loadById(questionId).orElseThrow();
        var opts = new ArrayList<Option>();
        for (var oc : options) opts.add(Option.newOf(oc.label(), oc.correct()));
        var updated = q.replaceChoiceOptions(opts, Instant.now(clock));
        return savePort.save(updated);
    }
}
