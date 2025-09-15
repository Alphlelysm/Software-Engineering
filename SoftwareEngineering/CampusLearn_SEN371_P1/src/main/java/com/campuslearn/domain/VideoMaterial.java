package com.campuslearn.domain;

import com.campuslearn.common.MaterialType;
import java.net.URI;
import java.util.UUID;

public class VideoMaterial extends LearningMaterial {
    private int durationSeconds;

    public VideoMaterial(UUID id, String title, String description, URI uri, Tutor uploadedBy, Module module, int durationSeconds) {
        super(id, title, description, uri, MaterialType.VIDEO, uploadedBy, module);
        this.durationSeconds = durationSeconds;
    }

    public int getDurationSeconds() { return durationSeconds; }
    public void setDurationSeconds(int durationSeconds) { this.durationSeconds = durationSeconds; }
}