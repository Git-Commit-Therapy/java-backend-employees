package com.git_commit_therapy.employeeService.security;

import io.grpc.Metadata;
import io.grpc.ServerCall;
import io.grpc.ServerCallHandler;
import io.grpc.ServerInterceptor;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
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

@Log
@Component
public class GrpcInterceptor implements ServerInterceptor {

    @Value("${application.keycloak.secret}")
    private String jwtSecret;

    @Override
    public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(
            ServerCall<ReqT, RespT> serverCall,
            Metadata metadata,
            ServerCallHandler<ReqT, RespT> serverCallHandler) {

        String jwtToken = metadata.get(Metadata.Key.of("Authorization", Metadata.ASCII_STRING_MARSHALLER));

        if (jwtToken == null || jwtToken.isEmpty()) {
            log.warning("Empty JWT token received");
            throw new AuthenticationException("Empty JWT token received") {
            };
        }
        Claims claims = validateToken(jwtToken);

        String username = claims.getSubject();
        if (username == null || username.isEmpty()) {
            log.warning("Invalid JWT token received");
            throw new AuthenticationException("JWT not valid") {
            };
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
        //Set auth for the current request
        SecurityContextHolder.getContext().setAuthentication(auth);

        return serverCallHandler.startCall(serverCall, metadata);
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
