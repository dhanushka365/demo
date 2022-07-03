package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.util.Calendar.JANUARY;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student alexa = new Student(
                    "alexa",
                    "alexa@gmail.com",
                    LocalDate.of(2006, Month.JANUARY ,3),
                    21

            );
            Student pasindu = new Student(
                    "pasindu",
                    "pasindu@gmail.com",
                    LocalDate.of(1996, Month.JANUARY ,17),
                    21

            );
            repository.saveAll(
                    List.of(alexa,pasindu)
            );
        };
    }
}
