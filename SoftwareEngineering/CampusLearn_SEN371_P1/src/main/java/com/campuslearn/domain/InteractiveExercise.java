package com.campuslearn.domain;

import com.campuslearn.common.MaterialType;
import java.net.URI;
import java.util.UUID;

public class InteractiveExercise extends LearningMaterial {
    private String technology; // e.g., H5P, HTML5

    public InteractiveExercise(UUID id, String title, String description, URI uri, Tutor uploadedBy, Module module, String technology) {
        super(id, title, description, uri, MaterialType.INTERACTIVE, uploadedBy, module);
        this.technology = technology;
    }

    public String getTechnology() { return technology; }
    public void setTechnology(String technology) { this.technology = technology; }
}