package com.example.SpringBootDataJPA;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootDataJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDataJpaApplication.class, args);
	}
	
	@Bean
	CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
		return args->{
			Student abdus = new Student("Abdus", "Salam", "salambrur3@gmail.com", 29);
			studentRepository.save(abdus);
		};
	};

}
