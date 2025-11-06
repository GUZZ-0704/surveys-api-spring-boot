package com.example.mi_backend.auth.application.port.out;

import com.example.mi_backend.auth.domain.model.Credential;

public interface SaveCredentialPort {
    Credential save(Credential credential);
}
