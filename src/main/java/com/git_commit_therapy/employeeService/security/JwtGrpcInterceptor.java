package com.git_commit_therapy.employeeService.security;

import io.grpc.*;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;

@Log
public class JwtGrpcInterceptor implements ServerInterceptor {
    @Value("${application.keycloak.public-key}")
    private String jwtPublicKey;

    private static final Metadata.Key<String> AUTHORIZATION_HEADER =
            Metadata.Key.of("Authorization", Metadata.ASCII_STRING_MARSHALLER);
    private static final String AUTHENTICATION_TYPE = "Bearer";

    @Override
    public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(
            ServerCall<ReqT, RespT> call,
            Metadata headers,
            ServerCallHandler<ReqT, RespT> next) {

        String authHeader = headers.get(AUTHORIZATION_HEADER);
        if (authHeader == null || !authHeader.startsWith(AUTHENTICATION_TYPE)) {
            call.close(Status.UNAUTHENTICATED.withDescription("Missing or invalid Authorization header"), headers);
            return new ServerCall.Listener<ReqT>() {};
        }

        //Extract jwt from the header
        String jwtToken = authHeader.replace(AUTHENTICATION_TYPE, "").trim();
        try {
            Claims claims = validateToken(jwtToken);
            String username = claims.get("preferred_username", String.class);
            //Extract all roles
            HashMap<String,List<String>> realm_access = claims.get("realm_access", HashMap.class);
            List<String> roles = realm_access.get("roles");
            List<SimpleGrantedAuthority> authorities = new ArrayList<>();
            if (roles != null) {
                for (String role : roles) {
                    authorities.add(new SimpleGrantedAuthority(role));
                }
            }
            UserDetails userDetails = new User(username, jwtToken, authorities);
            UsernamePasswordAuthenticationToken authRequest =
                    new UsernamePasswordAuthenticationToken(userDetails, claims, userDetails.getAuthorities());

            SecurityContextHolder.getContext().setAuthentication(authRequest);
        } catch (Exception ex) {
            log.warning("Authentication failed. Exception: "+ex.getMessage());
            call.close(Status.UNAUTHENTICATED.withDescription("Authentication failed"), headers);
            return new ServerCall.Listener<ReqT>() {};
        }

        return Contexts.interceptCall(Context.current(), call, headers, next);
    }


    public PublicKey generateJwtKeyDecryption(String jwtPublicKey) throws NoSuchAlgorithmException, InvalidKeySpecException {
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        byte[] keyBytes = Base64.getDecoder().decode(jwtPublicKey);
        X509EncodedKeySpec x509EncodedKeySpec=new X509EncodedKeySpec(keyBytes);
        return keyFactory.generatePublic(x509EncodedKeySpec);
    }



    private Claims validateToken(String token) {
        try {
            //SecretKey key = Keys.hmacShaKeyFor(jwtSecret.getBytes());
            PublicKey publicKey = generateJwtKeyDecryption(jwtPublicKey);

            // Parse e valida il token JWT
            return Jwts.parser()
                    .verifyWith(publicKey)
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
