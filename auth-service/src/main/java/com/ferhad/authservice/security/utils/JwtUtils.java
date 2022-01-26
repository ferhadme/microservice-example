package com.ferhad.authservice.security.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JwtUtils {
    private static final int ACCESS_TOKEN_EXPIRATION = 10 * 60 * 3600;
    private static final int REFRESH_TOKEN_EXPIRATION = 30 * 60 * 3600;
    public static final String JWT_SECRET = "gSjOhVwYHmb5rOhn10Cqus5MK8BNUr6QJhWH9TL2RuFmsdi51dOXF6BEQx39jGB";

    public Map<String, String> createAccessAndRefreshToken(String subject, String issuer, String claimName, List<?> authorities, Algorithm algorithm) {
        Map<String, String> tokens = new HashMap<>();
        String accessToken = createToken(subject, ACCESS_TOKEN_EXPIRATION, issuer, claimName, authorities, algorithm);
        String refreshToken = createToken(subject, REFRESH_TOKEN_EXPIRATION, issuer, claimName, authorities, algorithm);
        tokens.put("access_token", accessToken);
        tokens.put("refresh_token", refreshToken);
        return tokens;
    }

    public String createAccessToken(String subject, String issuer, String claimName, List<?> authorities, Algorithm algorithm) {
        return createToken(subject, ACCESS_TOKEN_EXPIRATION, issuer, claimName, authorities, algorithm);
    }

    public String createRefreshToken(String subject, String issuer, String claimName, List<?> authorities, Algorithm algorithm) {
        return createToken(subject, REFRESH_TOKEN_EXPIRATION, issuer, claimName, authorities, algorithm);
    }

    private String createToken(String subject, int expiration, String issuer, String claimName, List<?> authorities, Algorithm algorithm) {
        return JWT.create()
                .withSubject(subject)
                .withExpiresAt(new Date(System.currentTimeMillis() + expiration))
                .withIssuer(issuer)
                .withClaim(claimName, authorities)
                .sign(algorithm);
    }
}
