package com.example.mi_backend.users.application.port.in;

import com.example.mi_backend.users.domain.model.User;

public interface RenameUserUseCase {
    User handle(Long id, String newFullName);
}
