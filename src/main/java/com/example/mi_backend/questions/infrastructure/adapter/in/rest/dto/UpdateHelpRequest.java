package com.example.mi_backend.questions.infrastructure.adapter.in.rest.dto;

import jakarta.validation.constraints.Size;

public record UpdateHelpRequest(@Size(max=1000) String helpText) {}
