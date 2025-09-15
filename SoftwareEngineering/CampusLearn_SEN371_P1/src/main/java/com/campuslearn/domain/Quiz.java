package com.campuslearn.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Quiz {
    private final UUID id;
    private String title;
    private final List<QuizQuestion> questions = new ArrayList<>();

    public Quiz(UUID id, String title) {
        this.id = id == null ? UUID.randomUUID() : id;
        this.title = title;
    }

    public void addQuestion(QuizQuestion question) { questions.add(question); }

    public UUID getId() { return id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public List<QuizQuestion> getQuestions() { return questions; }
}