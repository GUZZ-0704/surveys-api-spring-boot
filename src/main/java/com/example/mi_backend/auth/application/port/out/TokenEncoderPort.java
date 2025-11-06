package com.example.mi_backend.auth.application.port.out;

import java.util.Collection;

public interface TokenEncoderPort {
    String generateAccessToken(String usernameOrEmail, Collection<String> roles, Long uid);
    long accessTokenExpiresInSeconds();
}
