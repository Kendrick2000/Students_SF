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
                    "Kendrick",
                    "truong",
                    "72 Main Street W",
                    "0913808375",
                    "s3814172@rmit.edu.vn"
            );

            Student andrew = new Student(
                    "Andrew",
                    "Le",
                    "123 Le Loi Street",
                    "0975324123",
                    "s3820098@rmit.edu.vn"
            );
            Student huy = new Student(
                    "Huy",
                    "Nguyen",
                    "32 Bach Dang",
                    "019231289",
                    "s3786128@rmit.edu.vn"
            );
            studentRepository.saveAll(List.of(kendrick,andrew,huy));
        };
    }
}
