package com.example.mi_backend.users.application.usecase;

import com.example.mi_backend.users.application.port.in.CreateUserUseCase;
import com.example.mi_backend.users.application.port.out.UserRepositoryPort;
import com.example.mi_backend.users.domain.exception.UserAlreadyExistsException;
import com.example.mi_backend.users.domain.model.User;
import com.example.mi_backend.users.domain.valueobject.Email;
import com.example.mi_backend.users.domain.valueobject.FullName;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Clock;
import java.time.Instant;

@Service
@Transactional
public class CreateUserService implements CreateUserUseCase {

    private final UserRepositoryPort repo;
    private final Clock clock;

    public CreateUserService(UserRepositoryPort repo, Clock clock) {
        this.repo = repo;
        this.clock = clock;
    }

    @Override
    public User handle(String email, String fullName, boolean systemAdmin) {
        var emailVO = Email.of(email);
        if (repo.existsByEmail(emailVO)) {
            throw new UserAlreadyExistsException(emailVO.getValue());
        }
        var now = Instant.now(clock);
        var user = User.createNew(emailVO, FullName.of(fullName), systemAdmin, now);
        return repo.save(user);
    }
}
