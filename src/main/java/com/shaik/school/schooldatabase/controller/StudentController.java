package com.shaik.school.schooldatabase.controller;

import com.shaik.school.schooldatabase.Service.StudentService;
import com.shaik.school.schooldatabase.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
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

    @GetMapping
    public List<Student> getAllStudents(){
        return studentService.getAllStudent();
    }

    @GetMapping
    public Student getStudentById(@PathVariable long id){
        return studentService.getStudentById(id);
    }

    @PutMapping
    public Student updateStudent(@RequestBody long id, @RequestBody Student student){
        return studentService.updateStudent(id, student);
    }

    @DeleteMapping
    public String deleteStudentById(@PathVariable long id){
        studentService.deleteStudent(id);
        return "Student deleted Successfully";


    }

}
