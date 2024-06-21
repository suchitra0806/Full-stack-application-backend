package com.example.studentapplication.controller;

import com.example.studentapplication.model.Student;
import com.example.studentapplication.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {
    @Autowired
    private StudentService service;
    @PostMapping("/add")
    public String add(@RequestBody Student student) {
        service.saveStudent(student);
        return "New student is added";
    }
    @GetMapping("/getAll")
    public List<Student> list() {
        return service.getAllStudents();
    }
}
