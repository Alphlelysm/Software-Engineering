package com.campuslearn.service;

import com.campuslearn.domain.Message;
import com.campuslearn.domain.User;
import com.campuslearn.messaging.Conversation;
import java.util.UUID;

public interface MessagingService {
    Conversation startConversation();
    void sendMessage(Conversation conversation, User from, User to, String content);
    java.util.List<Message> listMessages(Conversation conversation);
}