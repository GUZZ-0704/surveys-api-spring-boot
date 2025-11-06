package com.example.mi_backend.users.application.port.in;

import com.example.mi_backend.common.dto.PagedResult;
import com.example.mi_backend.users.application.dto.ListUsersQuery;
import com.example.mi_backend.users.domain.model.User;

public interface ListUsersUseCase {
    PagedResult<User> handle(ListUsersQuery query);
}
