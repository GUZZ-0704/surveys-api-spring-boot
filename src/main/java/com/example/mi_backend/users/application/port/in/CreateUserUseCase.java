package com.example.mi_backend.users.application.port.in;

import com.example.mi_backend.users.domain.model.User;

public interface CreateUserUseCase {
    User handle(String email, String fullName, boolean systemAdmin);
}
