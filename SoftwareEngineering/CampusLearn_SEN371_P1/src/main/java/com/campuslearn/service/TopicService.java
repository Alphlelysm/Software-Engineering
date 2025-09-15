package com.campuslearn.service;

import com.campuslearn.domain.*;
import java.util.List;
import java.util.UUID;

public interface TopicService {
    Topic createTopic(Student creator, String title, String description, Module module);
    Question askQuestion(Topic topic, Student student, String text);
    void subscribe(Student student, Topic topic);
    List<Topic> listTopicsByModule(Module module);
    List<Question> listQuestions(Topic topic);
    boolean tutorHasAccess(Tutor tutor, Topic topic); // enforce module-based response constraint
    Response respond(Tutor tutor, Question question, String text);
}