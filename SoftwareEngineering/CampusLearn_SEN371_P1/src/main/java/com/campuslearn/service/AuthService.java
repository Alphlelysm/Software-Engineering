package com.campuslearn.service;

import com.campuslearn.domain.User;

public interface AuthService {
    boolean authenticate(User user, String password);
}