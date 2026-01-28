package com.christyjohn.springboot.cruddemo.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;

@Configuration
public class DemoSecurityConfig {

    // add support for JDBC ... no more hardcoded users :-)
    @Bean
    public UserDetailsManager userDetailsManager(DataSource dataSource) {
        return new JdbcUserDetailsManager(dataSource);
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(configurer ->
                configurer
                        .requestMatchers(HttpMethod.GET, "/api/tasklist").hasRole("EMPLOYEE")
			            .requestMatchers(HttpMethod.GET, "/api/tasklist/**").hasRole("EMPLOYEE")
			            .requestMatchers(HttpMethod.POST, "/api/tasklist").hasRole("MANAGER")
			            .requestMatchers(HttpMethod.PUT, "/api/tasklist").hasRole("MANAGER")
                        .requestMatchers(HttpMethod.PATCH, "/api/tasklist/**").hasRole("MANAGER")
			            .requestMatchers(HttpMethod.DELETE, "/api/tasklist/**").hasRole("ADMIN")
	    );

        // use Http Basic authentication
        http.httpBasic(Customizer.withDefaults());

        // disable Cross Site Request Forgery (CSRF)
        http.csrf(csrf -> csrf.disable());

        return http.build();
    }
}
