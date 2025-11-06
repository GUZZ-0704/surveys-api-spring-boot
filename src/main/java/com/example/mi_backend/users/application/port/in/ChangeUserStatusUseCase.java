package com.example.mi_backend.users.application.port.in;

import com.example.mi_backend.users.domain.model.User;
import com.example.mi_backend.users.domain.model.UserStatus;

public interface ChangeUserStatusUseCase {
    User handle(Long id, UserStatus newStatus);
}
