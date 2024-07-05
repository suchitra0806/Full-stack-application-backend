package com.example.studentapplication.service;

import com.example.studentapplication.model.Student;
import com.example.studentapplication.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.studentapplication.exception.ResourceNotFoundException;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    public StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student addStudent(Student student) {
        return (Student) this.studentRepository.save(student);
    }
    public List<Student> saveAllStudents(List<Student> students) {
        return this.studentRepository.saveAll(students);
    }
    public List<Student> getAllStudents() {
        return this.studentRepository.findAll();
    }
    public String deleteStudent(Integer id) {
        this.studentRepository.deleteById(id);
        return "Details deleted";
    }
    public Student updateStudent(Student student) {
        Optional student2 = this.studentRepository.findById(student.getId());
        Student exist = (Student) student2.get();
        exist.setFirst_name(student.getFirst_name());
        exist.setLast_name(student.getLast_name());
        exist.setEmail(student.getEmail());
        exist.setDob(student.getDob());
        exist.setMobile(student.getMobile());
        exist.setAge(student.getAge());
        return (Student) this.studentRepository.save(exist);
    }
    public Student getStudentById(Integer id) {
        Optional<Student> student = this.studentRepository.findById(id);
        return (Student) student.orElseThrow(() -> {
            return new ResourceNotFoundException("Employee not found with id: " + String.valueOf(id));
        });
    }
}
