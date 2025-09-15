package com.campuslearn.service;

import com.campuslearn.domain.Notification;
import com.campuslearn.domain.User;

public interface NotificationService {
    Notification notify(User recipient, String message);
    java.util.List<Notification> unread(User recipient);
}