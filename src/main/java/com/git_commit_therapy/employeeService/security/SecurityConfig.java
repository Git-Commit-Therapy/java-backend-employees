package com.git_commit_therapy.employeeService.security;

import net.devh.boot.grpc.server.interceptor.GrpcGlobalServerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SecurityConfig {

    @Bean
    @GrpcGlobalServerInterceptor
    public JwtGrpcInterceptor jwtGrpcInterceptor() {
        return new JwtGrpcInterceptor();
    }
}
