package com.example.server3.enums;

public enum StudentStatus {
    ACTIVE,
    VACATION;

    public String getStatus() {
        return this.name();
    }
}
