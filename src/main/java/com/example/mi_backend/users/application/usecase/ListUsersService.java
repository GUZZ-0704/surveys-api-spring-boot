package com.example.mi_backend.users.application.usecase;

import com.example.mi_backend.common.dto.PagedResult;
import com.example.mi_backend.users.application.dto.ListUsersQuery;
import com.example.mi_backend.users.application.port.in.ListUsersUseCase;
import com.example.mi_backend.users.application.port.out.UserRepositoryPort;
import com.example.mi_backend.users.domain.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class ListUsersService implements ListUsersUseCase {

    private final UserRepositoryPort repo;

    public ListUsersService(UserRepositoryPort repo) {
        this.repo = repo;
    }

    @Override
    public PagedResult<User> handle(ListUsersQuery query) {
        return repo.search(query);
    }
}
