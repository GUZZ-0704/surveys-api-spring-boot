package com.example.mi_backend.users.application.usecase;

import com.example.mi_backend.users.application.port.in.GetUserByIdUseCase;
import com.example.mi_backend.users.application.port.out.UserRepositoryPort;
import com.example.mi_backend.users.domain.exception.UserNotFoundException;
import com.example.mi_backend.users.domain.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class GetUserByIdService implements GetUserByIdUseCase {

    private final UserRepositoryPort repo;

    public GetUserByIdService(UserRepositoryPort repo) {
        this.repo = repo;
    }

    @Override
    public User handle(Long id) {
        return repo.findById(id).orElseThrow(() -> new UserNotFoundException(id));
    }
}
