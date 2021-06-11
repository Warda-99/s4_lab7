package com.example.demo.api;

import com.example.demo.model.Student;
import com.example.demo.repositories.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/stundents")
public class StudentApi {

    private StudentRepo students;

    @Autowired
    public StudentApi(StudentRepo students) {
        this.students = students;
    }

    @GetMapping
    public Iterable<Student> getAll() {
        return students.findAll();
    }

    @GetMapping("/id")
    public Optional<Student> getById(@RequestParam Long index) {
        return students.findById(index);
    }

    @PostMapping
    public Student addStrudent(@RequestBody Student student) {
        return students.save(student);
    }

    @PutMapping
    public Student updateStrudent(@RequestBody Student student) {
        return students.save(student);
    }

    @DeleteMapping("/id")
    public void deleteStrudent(@RequestParam Long index) {
        students.deleteById(index);
    }

}
