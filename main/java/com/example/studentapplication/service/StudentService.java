package com.example.studentapplication.service;

import com.example.studentapplication.model.Student;

import java.util.List;

public interface StudentService {
    Student addStudent(Student student);
    List<Student> saveAllStudents(List<Student> students);
    List<Student> getAllStudents();
    String deleteStudent(Integer id);
    Student updateStudent(Student student);
    Student getStudentById(Integer id);
}
