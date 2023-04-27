package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
	
	@Bean
	CommandLineRunner  commandLineRunner(StudentRepository repository) {
		return args->{
			Student mariam = new Student("Mariam","Mariam@gmail.com", LocalDate.of(2000, Month.JANUARY, 05));
			Student alex = new Student( "Alex","Alex@gmail.com", LocalDate.of(2005, Month.FEBRUARY, 15));
			
			
			repository.saveAll(
					List.of(
							mariam,alex
							
							));
		};
		
		

		
		
	};
    
}
