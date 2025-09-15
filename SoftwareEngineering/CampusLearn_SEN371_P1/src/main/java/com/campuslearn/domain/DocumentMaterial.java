package com.campuslearn.domain;

import com.campuslearn.common.MaterialType;
import java.net.URI;
import java.util.UUID;

public class DocumentMaterial extends LearningMaterial {
    private int pageCount;

    public DocumentMaterial(UUID id, String title, String description, URI uri, Tutor uploadedBy, Module module, int pageCount) {
        super(id, title, description, uri, MaterialType.DOCUMENT, uploadedBy, module);
        this.pageCount = pageCount;
    }

    public int getPageCount() { return pageCount; }
    public void setPageCount(int pageCount) { this.pageCount = pageCount; }
}