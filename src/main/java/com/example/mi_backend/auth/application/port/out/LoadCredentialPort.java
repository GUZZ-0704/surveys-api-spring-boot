package com.example.mi_backend.auth.application.port.out;

import java.util.Optional;

public interface LoadCredentialPort {
    Optional<String> findPasswordHashByUserId(Long userId);
}
