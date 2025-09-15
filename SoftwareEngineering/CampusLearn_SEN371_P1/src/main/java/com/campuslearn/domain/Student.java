package com.campuslearn.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.campuslearn.common.Role;

public class Student extends User {
    private final List<Topic> topicsCreated = new ArrayList<>();
    private final List<Subscription> subscriptions = new ArrayList<>();

    public Student(UUID id, String name, String email) {
        super(id, name, email, Role.STUDENT);
    }

    public Topic createTopic(String title, String description, Module module) {
        Topic topic = new Topic(UUID.randomUUID(), title, description, this, module);
        topicsCreated.add(topic);
        return topic;
    }

    public void subscribeToTopic(Topic topic) {
        Subscription sub = new Subscription(this, topic);
        subscriptions.add(sub);
        topic.addSubscriber(sub);
    }

    public List<Topic> getTopicsCreated() { return topicsCreated; }
    public List<Subscription> getSubscriptions() { return subscriptions; }
}