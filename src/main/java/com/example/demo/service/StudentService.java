package com.example.demo.service;

import com.example.demo.model.Student;
import com.example.demo.repositories.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {

    private StudentRepo studentRepo;

    @Autowired
    public StudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public Optional<Student> findById(Long id) {
        return studentRepo.findById(id);
    }

    public Iterable<Student> findAll() {
        return studentRepo.findAll();
    }

    public Student save(Student student) {
        return studentRepo.save(student);
    }

    public void deleteById(Long id) {
        studentRepo.deleteById(id);
    }

}
