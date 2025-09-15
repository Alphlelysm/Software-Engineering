package com.campuslearn.messaging;

import com.campuslearn.domain.Message;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Conversation {
    private final UUID id;
    private final List<Message> messages = new ArrayList<>();

    public Conversation(UUID id) {
        this.id = id == null ? UUID.randomUUID() : id;
    }

    public void addMessage(Message m) { messages.add(m); }
    public UUID getId() { return id; }
    public List<Message> getMessages() { return messages; }
}