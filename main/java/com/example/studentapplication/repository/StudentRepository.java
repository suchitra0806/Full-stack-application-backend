package com.example.studentapplication.repository;

import com.example.studentapplication.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository<id> extends JpaRepository<Student, Integer> {
}
