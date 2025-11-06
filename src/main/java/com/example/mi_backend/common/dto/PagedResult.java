package com.example.mi_backend.common.dto;


import java.util.List;

public record PagedResult<T>(
        List<T> items,
        long total,
        int page,
        int size
) { }

