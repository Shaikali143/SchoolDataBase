package com.shaik.school.schooldatabase.controller;

import com.shaik.school.schooldatabase.Service.StudentService;
import com.shaik.school.schooldatabase.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping
    public Student createStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }

    @GetMapping//("/api/students")
    public List<Student> getAllStudents(){
        return studentService.getAllStudent();
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable long id){
        return studentService.getStudentById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable long id, @RequestBody Student student){
        Student studentUpdated = studentService.updateStudent(id, student);
        return ResponseEntity.ok(studentUpdated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteStudentById(@PathVariable long id){
        studentService.deleteStudent(id);
        return ResponseEntity.ok("Student deleted Successfully");


    }

}
