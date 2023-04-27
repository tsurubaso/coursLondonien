package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public  class StudentService {
	
	private final StudentRepository studentRepository;
	
	
	public StudentService(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}


	public List <Student> getStudents() {
        return studentRepository.findAll();
    }
 

	public void addNewStudent(Student student) {
		Optional <Student> studentOptional= studentRepository.
		findStudentByEmail(student.getEmail());
		if (studentOptional.isPresent()) {
			throw new IllegalStateException("EmailTaken !");
		}
		studentRepository.save(student);
		System.out.println(student);
		
	}

}
