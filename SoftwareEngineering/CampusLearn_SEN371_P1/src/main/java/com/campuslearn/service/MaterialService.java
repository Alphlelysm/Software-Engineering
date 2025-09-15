package com.campuslearn.service;

import com.campuslearn.domain.*;
import java.net.URI;

public interface MaterialService {
    VideoMaterial uploadVideo(Tutor tutor, Topic topic, String title, String description, URI uri, int durationSeconds);
    DocumentMaterial uploadDocument(Tutor tutor, Topic topic, String title, String description, URI uri, int pageCount);
    InteractiveExercise uploadInteractive(Tutor tutor, Topic topic, String title, String description, URI uri, String technology);
}