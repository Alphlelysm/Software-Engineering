package com.campuslearn.domain;

import java.util.Objects;
import java.util.UUID;
import com.campuslearn.common.Role;

public abstract class User {
    private final UUID id;
    private String name;
    private String email;
    private Role role;

    protected User(UUID id, String name, String email, Role role) {
        this.id = id == null ? UUID.randomUUID() : id;
        this.name = name;
        this.email = email;
        this.role = role;
    }

    public UUID getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public Role getRole() { return role; }
    public void setRole(Role role) { this.role = role; }

    /** Stub for authentication; to be implemented by a service. */
    public boolean authenticate(String password) {
        return password != null && !password.isBlank();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return id.equals(user.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }
}