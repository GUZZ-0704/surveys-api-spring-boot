package com.example.mi_backend.campaigns.application.port.out;

public interface CheckUserExistsPort {
    boolean existsUserById(Long userId);
}
