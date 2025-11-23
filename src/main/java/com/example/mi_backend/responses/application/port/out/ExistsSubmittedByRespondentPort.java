package com.example.mi_backend.responses.application.port.out;

public interface ExistsSubmittedByRespondentPort {
    boolean existsSubmittedByFormAndUser(Long formId, Long userId);
    boolean existsSubmittedByFormAndEmail(Long formId, String email);
    boolean existsSubmittedByFormAndCode(Long formId, String code);
}
