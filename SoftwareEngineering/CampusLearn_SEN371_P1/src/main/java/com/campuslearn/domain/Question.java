package com.campuslearn.domain;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Question {
    private final UUID id;
    private final String text;
    private final Student askedBy;
    private final ZonedDateTime askedAt;
    private final List<Response> responses = new ArrayList<>();

    public Question(UUID id, String text, Student askedBy) {
        this.id = id == null ? UUID.randomUUID() : id;
        this.text = text;
        this.askedBy = askedBy;
        this.askedAt = ZonedDateTime.now();
    }

    public void addResponse(Response response) { responses.add(response); }

    public UUID getId() { return id; }
    public String getText() { return text; }
    public Student getAskedBy() { return askedBy; }
    public ZonedDateTime getAskedAt() { return askedAt; }
    public List<Response> getResponses() { return responses; }
}