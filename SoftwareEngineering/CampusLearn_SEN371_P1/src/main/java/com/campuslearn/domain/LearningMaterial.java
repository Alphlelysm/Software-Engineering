package com.campuslearn.domain;

import com.campuslearn.common.MaterialType;
import java.net.URI;
import java.time.ZonedDateTime;
import java.util.UUID;

public abstract class LearningMaterial {
    private final UUID id;
    private String title;
    private String description;
    private URI uri;
    private MaterialType type;
    private Tutor uploadedBy;
    private Module module;
    private final ZonedDateTime uploadedAt;

    protected LearningMaterial(UUID id, String title, String description, URI uri, MaterialType type, Tutor uploadedBy, Module module) {
        this.id = id == null ? UUID.randomUUID() : id;
        this.title = title;
        this.description = description;
        this.uri = uri;
        this.type = type;
        this.uploadedBy = uploadedBy;
        this.module = module;
        this.uploadedAt = ZonedDateTime.now();
    }

    public UUID getId() { return id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public URI getUri() { return uri; }
    public void setUri(URI uri) { this.uri = uri; }
    public MaterialType getType() { return type; }
    public void setType(MaterialType type) { this.type = type; }
    public Tutor getUploadedBy() { return uploadedBy; }
    public void setUploadedBy(Tutor uploadedBy) { this.uploadedBy = uploadedBy; }
    public Module getModule() { return module; }
    public void setModule(Module module) { this.module = module; }
    public ZonedDateTime getUploadedAt() { return uploadedAt; }
}