package com.demo.cliente.api.reactive.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity)throws Exception {
        httpSecurity.csrf()
                .disable()
                .authorizeRequests()
                //.requestMatchers(HttpMethod.DELETE)
                //.hasRole("admin")
                .requestMatchers("/vi/api/cliente/**")
                .hasAnyRole("user","admin")
                .requestMatchers("/v1/api/login/**")
                .anonymous()
                .anyRequest()
                .authenticated()
                .and()
                .oauth2ResourceServer()
                .jwt()
                .jwtAuthenticationConverter(new CustomJwtAuthenticationConverter() );
        httpSecurity.oauth2Login();
        return httpSecurity.build();
    }
}
