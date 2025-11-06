package com.example.mi_backend.users.infrastructure.adapter.in.rest.mapper;

import com.example.mi_backend.users.domain.model.User;
import com.example.mi_backend.users.infrastructure.adapter.in.rest.dto.UserResponse;

public final class UserRestMapper {
    private UserRestMapper() {}
    public static UserResponse toResponse(User u) {
        return new UserResponse(
                u.getId(),
                u.getEmail().getValue(),
                u.getFullName().getValue(),
                u.isSystemAdmin(),
                u.getStatus(),
                u.getCreatedAt(),
                u.getUpdatedAt()
        );
    }
}
