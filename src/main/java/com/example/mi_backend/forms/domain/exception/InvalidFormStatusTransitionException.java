package com.example.mi_backend.forms.domain.exception;

import com.example.mi_backend.forms.domain.model.FormStatus;

public class InvalidFormStatusTransitionException extends RuntimeException {
    public InvalidFormStatusTransitionException(FormStatus from, FormStatus to){
        super("Transición de estado inválida: "+from+" → "+to);
    }
}
