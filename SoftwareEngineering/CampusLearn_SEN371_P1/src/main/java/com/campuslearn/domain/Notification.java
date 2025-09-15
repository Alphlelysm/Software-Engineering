package com.campuslearn.domain;

import java.time.ZonedDateTime;
import java.util.UUID;

public class Notification {
    private final UUID id;
    private final User recipient;
    private final String message;
    private final ZonedDateTime sentAt;
    private boolean read;

    public Notification(UUID id, User recipient, String message) {
        this.id = id == null ? UUID.randomUUID() : id;
        this.recipient = recipient;
        this.message = message;
        this.sentAt = ZonedDateTime.now();
        this.read = false;
    }

    public UUID getId() { return id; }
    public User getRecipient() { return recipient; }
    public String getMessage() { return message; }
    public ZonedDateTime getSentAt() { return sentAt; }
    public boolean isRead() { return read; }
    public void markRead() { this.read = true; }
}