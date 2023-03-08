package com.abacus.user.config;

import jakarta.servlet.Filter;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import java.util.List;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http.csrf().disable().authorizeRequests().anyRequest().authenticated().and().httpBasic();
        http.formLogin();

        return http.build();
    }


//    @Bean
//    public SecurityFilterChain securityFilterChain(){
//        return new SecurityFilterChain() {
//            @Override
//            public boolean matches(HttpServletRequest request) {
//                return false;
//            }
//
//            @Override
//            public List<Filter> getFilters() {
//                return null;
//            }
//        };
//    }
}
