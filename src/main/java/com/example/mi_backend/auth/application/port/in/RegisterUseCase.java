package com.example.mi_backend.auth.application.port.in;

import com.example.mi_backend.auth.application.dto.AuthResult;

public interface RegisterUseCase {
    AuthResult handle(String email, String fullName, String rawPassword, boolean systemAdmin);
}
