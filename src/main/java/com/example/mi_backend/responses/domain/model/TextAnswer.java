package com.example.mi_backend.responses.domain.model;

public class TextAnswer extends SubmissionAnswer {

    private final String text;

    public TextAnswer(Long questionId, Integer questionVersion, String text) {
        super(questionId, questionVersion);
        this.text = text == null ? "" : text;
    }

    public String getText() { return text; }
}
