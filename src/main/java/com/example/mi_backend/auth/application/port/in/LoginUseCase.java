package com.example.mi_backend.auth.application.port.in;

import com.example.mi_backend.auth.application.dto.AuthResult;

public interface LoginUseCase {
    AuthResult handle(String email, String rawPassword);
}
