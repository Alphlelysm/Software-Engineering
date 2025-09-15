package com.campuslearn.domain;

import java.time.ZonedDateTime;
import java.util.UUID;

public class Response {
    private final UUID id;
    private final String text;
    private final Tutor respondedBy;
    private final ZonedDateTime respondedAt;

    public Response(UUID id, String text, Tutor respondedBy) {
        this.id = id == null ? UUID.randomUUID() : id;
        this.text = text;
        this.respondedBy = respondedBy;
        this.respondedAt = ZonedDateTime.now();
    }

    public UUID getId() { return id; }
    public String getText() { return text; }
    public Tutor getRespondedBy() { return respondedBy; }
    public ZonedDateTime getRespondedAt() { return respondedAt; }
}