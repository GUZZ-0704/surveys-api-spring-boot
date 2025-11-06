package com.example.mi_backend.users.application.usecase;

import com.example.mi_backend.users.application.port.in.GetUserByEmailUseCase;
import com.example.mi_backend.users.application.port.out.UserRepositoryPort;
import com.example.mi_backend.users.domain.exception.UserNotFoundException;
import com.example.mi_backend.users.domain.model.User;
import com.example.mi_backend.users.domain.valueobject.Email;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class GetUserByEmailService implements GetUserByEmailUseCase {

    private final UserRepositoryPort repo;

    public GetUserByEmailService(UserRepositoryPort repo) {
        this.repo = repo;
    }

    @Override
    public User handle(String email) {
        return repo.findByEmail(Email.of(email))
                .orElseThrow(() -> UserNotFoundException.byEmail(email));
    }
}
