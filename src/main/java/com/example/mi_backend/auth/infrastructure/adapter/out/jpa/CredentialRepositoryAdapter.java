package com.example.mi_backend.auth.infrastructure.adapter.out.jpa;

import com.example.mi_backend.auth.application.port.out.LoadCredentialPort;
import com.example.mi_backend.auth.application.port.out.SaveCredentialPort;
import com.example.mi_backend.auth.domain.model.Credential;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class CredentialRepositoryAdapter implements LoadCredentialPort, SaveCredentialPort {

    private final CredentialJpaRepository jpa;

    public CredentialRepositoryAdapter(CredentialJpaRepository jpa) {
        this.jpa = jpa;
    }


    @Override
    public Optional<String> findPasswordHashByUserId(Long userId) {
        return jpa.findByUserId(userId).map(CredentialEntity::getPasswordHash);
    }

    @Override
    public Credential save(Credential credential) {
        var saved = jpa.save(CredentialJpaMapper.toEntity(credential));
        return CredentialJpaMapper.toDomain(saved);
    }
}
