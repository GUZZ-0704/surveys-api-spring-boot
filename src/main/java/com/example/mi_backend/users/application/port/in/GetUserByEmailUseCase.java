package com.example.mi_backend.users.application.port.in;

import com.example.mi_backend.users.domain.model.User;

public interface GetUserByEmailUseCase {
    User handle(String email);
}
