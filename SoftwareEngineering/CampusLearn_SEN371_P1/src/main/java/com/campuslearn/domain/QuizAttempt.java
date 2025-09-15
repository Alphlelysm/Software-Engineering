package com.campuslearn.domain;

import java.time.ZonedDateTime;
import java.util.UUID;

public class QuizAttempt {
    private final UUID id;
    private final Student student;
    private final Quiz quiz;
    private int score;
    private final ZonedDateTime attemptedAt;

    public QuizAttempt(UUID id, Student student, Quiz quiz) {
        this.id = id == null ? UUID.randomUUID() : id;
        this.student = student;
        this.quiz = quiz;
        this.attemptedAt = ZonedDateTime.now();
    }

    public UUID getId() { return id; }
    public Student getStudent() { return student; }
    public Quiz getQuiz() { return quiz; }
    public int getScore() { return score; }
    public void setScore(int score) { this.score = score; }
    public ZonedDateTime getAttemptedAt() { return attemptedAt; }
}