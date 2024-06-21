package com.example.studentapplication.service;

import com.example.studentapplication.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
