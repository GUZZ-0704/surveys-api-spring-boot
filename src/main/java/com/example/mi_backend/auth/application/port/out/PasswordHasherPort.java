package com.example.mi_backend.auth.application.port.out;

public interface PasswordHasherPort {
    String hash(String rawPassword);
    boolean matches(String rawPassword, String passwordHash);
}
