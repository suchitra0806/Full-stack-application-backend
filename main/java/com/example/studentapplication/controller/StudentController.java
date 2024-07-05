package com.example.studentapplication.controller;

import com.example.studentapplication.model.Student;
import com.example.studentapplication.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    private final StudentService service;

    @Autowired
    public StudentController(StudentService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<?> addStudent(@RequestBody Student student) {
        try {
            Student createdStudent = this.service.addStudent(student);
            return new ResponseEntity(createdStudent, HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>("Error creating student.", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping
    public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> students = service.getAllStudents();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    @GetMapping({"/{id}"})
    public ResponseEntity<?> getStudentById(@PathVariable Integer id) {
        try {
            Student student = service.getStudentById(id);
            return new ResponseEntity<>(student, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Employee not found.", HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping({"/{id}"})
    public ResponseEntity<?> updateStudent(@PathVariable Integer id, @RequestBody Student studentDetails) {
        try {
            Student updatedStudent = service.updateStudent(studentDetails);
            return new ResponseEntity<>(updatedStudent, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Error updating student.", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping({"/{id}"})
    public ResponseEntity<?> deleteStudent(@PathVariable Integer id) {
        try {
            service.deleteStudent(id);
            return new ResponseEntity("Student deleted.", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity("Error deleting student.", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
