package com.campuslearn.domain;

import java.util.UUID;

public class QuizOption {
    private final UUID id;
    private String text;
    private boolean correct;

    public QuizOption(UUID id, String text, boolean correct) {
        this.id = id == null ? UUID.randomUUID() : id;
        this.text = text;
        this.correct = correct;
    }

    public UUID getId() { return id; }
    public String getText() { return text; }
    public void setText(String text) { this.text = text; }
    public boolean isCorrect() { return correct; }
    public void setCorrect(boolean correct) { this.correct = correct; }
}