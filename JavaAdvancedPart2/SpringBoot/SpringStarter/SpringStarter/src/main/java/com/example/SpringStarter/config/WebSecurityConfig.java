package com.example.SpringStarter.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@EnableGlobalMethodSecurity
public class WebSecurityConfig {
    
    private static final String[] WHITELIST = {
        "/",
        "/login",
        "/register",
        "/db-console",
        "/css/**",
        "/fonts/**",
        "/images/**",
        "/js/**",
    
    };

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http
                .authorizeRequests(requests -> requests
                        .antMatchers(WHITELIST)
                        .permitAll()
                        .anyRequest()
                        .authenticated());

        return http.build();
    }
}
