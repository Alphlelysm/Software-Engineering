package com.campuslearn.domain;

import java.util.Objects;

public class Module {
    private final String code;
    private String name;

    public Module(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() { return code; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Module)) return false;
        Module module = (Module) o;
        return code.equals(module.code);
    }

    @Override
    public int hashCode() { return Objects.hash(code); }
}