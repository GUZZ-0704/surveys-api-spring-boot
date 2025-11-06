package com.example.mi_backend.users.application.port.in;

import com.example.mi_backend.users.domain.model.User;

public interface SetSystemAdminUseCase {
    User handle(Long id, boolean systemAdmin);
}
