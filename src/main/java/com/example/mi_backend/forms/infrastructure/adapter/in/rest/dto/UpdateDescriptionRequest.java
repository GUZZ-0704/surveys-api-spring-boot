package com.example.mi_backend.forms.infrastructure.adapter.in.rest.dto;

import com.example.mi_backend.common.validation.MinWords;
import jakarta.validation.constraints.Size;

public record UpdateDescriptionRequest(@Size(max = 2000) @MinWords(2) String description) {}
