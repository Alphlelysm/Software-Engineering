package com.campuslearn.domain;

import java.time.ZonedDateTime;
import java.util.UUID;

public class Message {
    private final UUID id;
    private final User from;
    private final User to;
    private final String content;
    private final ZonedDateTime sentAt;

    public Message(UUID id, User from, User to, String content) {
        this.id = id == null ? UUID.randomUUID() : id;
        this.from = from;
        this.to = to;
        this.content = content;
        this.sentAt = ZonedDateTime.now();
    }

    public UUID getId() { return id; }
    public User getFrom() { return from; }
    public User getTo() { return to; }
    public String getContent() { return content; }
    public ZonedDateTime getSentAt() { return sentAt; }
}