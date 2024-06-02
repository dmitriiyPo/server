package com.example.server3.configuration;

import com.example.server3.repository.impl.StudentRepository;
import com.example.server3.service.impl.StudentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class ServerConfig {

    @Bean
    public StudentService studentService(StudentRepository studentRepository) {
        return new StudentService(studentRepository);
    }

}
