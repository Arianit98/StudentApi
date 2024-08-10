package com.arianit.studentApi.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.JANUARY;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student mariam = new Student(
                    1L,
                    "Mariam",
                    LocalDate.of(2000, JANUARY, 5),
                    "mariam.jamal@gmail.com"
            );
            Student alex = new Student(
                    2L,
                    "alex",
                    LocalDate.of(2004, JANUARY, 5),
                    "alex.jamal@gmail.com"
            );

            repository.saveAll(List.of(mariam,alex));
        };
    }
}
