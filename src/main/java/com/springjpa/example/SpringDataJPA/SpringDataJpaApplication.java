package com.springjpa.example.SpringDataJPA;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class SpringDataJpaApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(StudentRepository studentRepository){
		return args -> {
			Student studentDetail = new Student(
					"Sahil",
					"Verma",
					"sahil.verma997@gmail.com",
					LocalDate.of(1998,06,24)
			);
			studentRepository.save(studentDetail);
		};
	}
}
