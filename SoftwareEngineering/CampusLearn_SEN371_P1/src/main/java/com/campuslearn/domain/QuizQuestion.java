package com.campuslearn.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class QuizQuestion {
    private final UUID id;
    private String prompt;
    private final List<QuizOption> options = new ArrayList<>();
    private int correctIndex = -1;

    public QuizQuestion(UUID id, String prompt) {
        this.id = id == null ? UUID.randomUUID() : id;
        this.prompt = prompt;
    }

    public void addOption(QuizOption option, boolean correct) {
        options.add(option);
        if (correct) correctIndex = options.size() - 1;
    }

    public UUID getId() { return id; }
    public String getPrompt() { return prompt; }
    public void setPrompt(String prompt) { this.prompt = prompt; }
    public List<QuizOption> getOptions() { return options; }
    public int getCorrectIndex() { return correctIndex; }
}