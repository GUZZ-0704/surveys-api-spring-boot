package com.example.mi_backend.reports.domain.model;

import com.example.mi_backend.responses.domain.valueobject.QuestionKind;

public class TrueFalseQuestionReport extends QuestionReport {
    private final long trueCount;
    private final long falseCount;

    public TrueFalseQuestionReport(Long questionId, long answeredCount, long omittedCount, long trueCount, long falseCount) {
        super(questionId, QuestionKind.TRUE_FALSE, answeredCount, omittedCount);
        this.trueCount = trueCount;
        this.falseCount = falseCount;
    }

    public long getTrueCount() { return trueCount; }
    public long getFalseCount() { return falseCount; }
}
