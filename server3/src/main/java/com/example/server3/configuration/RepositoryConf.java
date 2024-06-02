package com.example.server3.configuration;

import com.example.server3.repository.impl.StudentRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class RepositoryConf {

    @Bean
    public StudentRepository studentRepository(JdbcTemplate jdbcTemplate){
        return new StudentRepository(jdbcTemplate);
    }
}
