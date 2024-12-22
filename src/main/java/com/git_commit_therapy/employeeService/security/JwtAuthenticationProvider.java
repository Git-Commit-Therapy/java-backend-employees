package com.git_commit_therapy.employeeService.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class JwtAuthenticationProvider implements AuthenticationProvider {

    @Value("${application.keycloak.secret}")
    private String jwtSecret;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String jwtToken = (String) authentication.getCredentials();

        Claims claims = validateToken(jwtToken);

        String username = claims.getSubject();
        if (username == null || username.isEmpty()) {
            throw new AuthenticationException("JWT not valid") {};
        }

        Map<String, Object> additionalInfo = new HashMap<>(claims);
        additionalInfo.put("jwtToken", jwtToken);

        //Extract all roles
        List<String> roles = claims.get("roles", List.class);
        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
        if (roles != null) {
            for (String role : roles) {
                authorities.add(new SimpleGrantedAuthority(role));
            }
        }


        UserDetails userDetails = new User(username, "", authorities);
        UsernamePasswordAuthenticationToken auth =
                new UsernamePasswordAuthenticationToken(userDetails, additionalInfo, userDetails.getAuthorities());

        SecurityContextHolder.getContext().setAuthentication(auth);

        return auth;
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }

    private Claims validateToken(String token) {
        try {
            SecretKey key = Keys.hmacShaKeyFor(jwtSecret.getBytes());

            // Parse e valida il token JWT
            return Jwts.parser()
                    .verifyWith(key)
                    .build()
                    .parseSignedClaims(token)
                    .getPayload();
        } catch (Exception e) {
            throw new AuthenticationException("JWT not valid") {
                @Override
                public String getMessage() {
                    return e.getMessage();
                }
            };
        }
    }
}

