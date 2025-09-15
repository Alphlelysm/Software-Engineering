package com.campuslearn.domain;

import java.time.ZonedDateTime;

public class Subscription {
    private final Student student;
    private final Topic topic;
    private final ZonedDateTime subscribedAt;

    public Subscription(Student student, Topic topic) {
        this.student = student;
        this.topic = topic;
        this.subscribedAt = ZonedDateTime.now();
    }

    public Student getStudent() { return student; }
    public Topic getTopic() { return topic; }
    public ZonedDateTime getSubscribedAt() { return subscribedAt; }
}