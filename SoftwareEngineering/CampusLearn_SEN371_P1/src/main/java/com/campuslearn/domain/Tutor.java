package com.campuslearn.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.campuslearn.common.Role;

public class Tutor extends User {
    private final List<Module> modules = new ArrayList<>();

    public Tutor(UUID id, String name, String email) {
        super(id, name, email, Role.TUTOR);
    }

    public void addModule(Module module) {
        if (module != null && !modules.contains(module)) {
            modules.add(module);
        }
    }

    public Response respondToQuestion(Question question, String text) {
        if (question == null || text == null || text.isBlank()) {
            throw new IllegalArgumentException("Question and text are required.");
        }
        // Access control is to be enforced by a service layer.
        Response response = new Response(java.util.UUID.randomUUID(), text, this);
        question.addResponse(response);
        return response;
    }

    public LearningMaterial uploadMaterial(Topic topic, LearningMaterial material) {
        if (topic == null || material == null) {
            throw new IllegalArgumentException("Topic and material are required.");
        }
        topic.addMaterial(material);
        return material;
    }

    public List<Module> getModules() { return modules; }
}