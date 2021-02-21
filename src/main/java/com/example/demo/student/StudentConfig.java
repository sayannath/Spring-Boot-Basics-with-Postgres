package com.example.demo.student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.util.Calendar.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student sayan = new Student(
                    "Sayan Nath",
                    "sayannath235@gmail.com",
                    LocalDate.of(2000, JULY,19)

            );

            Student taran = new Student(
                    "Taranpreet Singh Chabbra",
                    "taran3010@gmail.com",
                    LocalDate.of(2001,MAY,10)

            );

            Student sambit = new Student(
                    "Sambit Kumar Saha",
                    "majhisambit2@gmail.com",
                    LocalDate.of(2000, DECEMBER,30)

            );
            repository.saveAll(
                    List.of(sayan, taran,sambit)
            );
        };
    }
}
