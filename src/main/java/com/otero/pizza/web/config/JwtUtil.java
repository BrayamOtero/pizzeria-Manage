package com.otero.pizza.web.config;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;

@Component
public class JwtUtil {
    private static final String SECRET_KEY = "p1zz4_m4n463";
    private static final Algorithm ALGORITHM = Algorithm.HMAC256(SECRET_KEY);
    public String create(String username){
        return JWT.create()
                .withSubject(username)
                .withIssuer("pizza-manage")
                .withIssuedAt(new Date())
                .withExpiresAt(Instant.from(LocalDateTime.now().plusDays(15)))
                .sign(ALGORITHM);
    }
}
