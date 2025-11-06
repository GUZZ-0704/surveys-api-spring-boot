package com.example.mi_backend.forms.infrastructure.adapter.in.rest.dto;

import jakarta.validation.constraints.Size;

public record AddSectionRequest(@Size(max = 200) String title) {}
