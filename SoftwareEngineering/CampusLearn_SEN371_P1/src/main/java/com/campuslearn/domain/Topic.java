package com.campuslearn.domain;

import com.campuslearn.common.TopicStatus;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Topic {
    private final UUID id;
    private String title;
    private String description;
    private TopicStatus status = TopicStatus.OPEN;
    private final Student createdBy;
    private final Module module;
    private final ZonedDateTime createdAt;
    private final List<LearningMaterial> materials = new ArrayList<>();
    private final List<Question> questions = new ArrayList<>();
    private final List<Subscription> subscribers = new ArrayList<>();

    public Topic(UUID id, String title, String description, Student createdBy, Module module) {
        this.id = id == null ? UUID.randomUUID() : id;
        this.title = title;
        this.description = description;
        this.createdBy = createdBy;
        this.module = module;
        this.createdAt = ZonedDateTime.now();
    }

    public void addMaterial(LearningMaterial material) { materials.add(material); }
    public void addQuestion(Question question) { questions.add(question); }
    public Subscription subscribe(Student student) {
        Subscription s = new Subscription(student, this);
        subscribers.add(s);
        return s;
    }
    public void addSubscriber(Subscription s) { subscribers.add(s); }

    public UUID getId() { return id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public TopicStatus getStatus() { return status; }
    public void setStatus(TopicStatus status) { this.status = status; }
    public Student getCreatedBy() { return createdBy; }
    public Module getModule() { return module; }
    public ZonedDateTime getCreatedAt() { return createdAt; }
    public List<LearningMaterial> getMaterials() { return materials; }
    public List<Question> getQuestions() { return questions; }
    public List<Subscription> getSubscribers() { return subscribers; }
}