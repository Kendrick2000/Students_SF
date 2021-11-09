package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            Student kendrick = new Student(
                    1L,
                    "Kendrick",
                    "truong",
                    "72 Main Street W",
                    "0913808375",
                    "s3814172@rmit.edu.vn"
            );
            studentRepository.saveAll(List.of(kendrick));
        };
    }
}
