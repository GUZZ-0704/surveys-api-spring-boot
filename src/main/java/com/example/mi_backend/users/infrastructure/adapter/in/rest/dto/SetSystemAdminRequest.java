package com.example.mi_backend.users.infrastructure.adapter.in.rest.dto;

import jakarta.validation.constraints.NotNull;

public record SetSystemAdminRequest(@NotNull Boolean systemAdmin) { }
