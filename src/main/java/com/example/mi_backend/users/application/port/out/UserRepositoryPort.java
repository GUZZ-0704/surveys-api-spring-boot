package com.example.mi_backend.users.application.port.out;

import com.example.mi_backend.common.dto.PagedResult;
import com.example.mi_backend.users.application.dto.ListUsersQuery;
import com.example.mi_backend.users.domain.model.User;
import com.example.mi_backend.users.domain.valueobject.Email;

import java.util.Optional;

public interface UserRepositoryPort {
    boolean existsByEmail(Email email);
    Optional<User> findById(Long id);
    Optional<User> findByEmail(Email email);
    User save(User user);
    void deleteById(Long id);
    PagedResult<User> search(ListUsersQuery query);
}
