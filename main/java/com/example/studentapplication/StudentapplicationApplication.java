package com.example.studentapplication;

import com.example.studentapplication.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentapplicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentapplicationApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	public void run(String... args) throws Exception {}
}
