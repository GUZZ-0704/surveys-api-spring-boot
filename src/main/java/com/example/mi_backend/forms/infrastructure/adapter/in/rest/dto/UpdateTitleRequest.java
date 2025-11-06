package com.example.mi_backend.forms.infrastructure.adapter.in.rest.dto;

import com.example.mi_backend.common.validation.NoWhitespace;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record UpdateTitleRequest(@NotBlank @NoWhitespace @Size(max = 200) String title) {}
