package com.shaik.school.schooldatabase.Service.impl;

import com.shaik.school.schooldatabase.Repository.StudentRepository;
import com.shaik.school.schooldatabase.Service.StudentService;
import com.shaik.school.schooldatabase.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudent(){
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(Long id){
        Optional<Student> student = studentRepository.findById(id);
        return student.orElse(null);
    }

    @Override
    public Student updateStudent(Long id, Student updatedStudent){
       Student student = studentRepository.findById(id)
               .orElseThrow(() -> new RuntimeException("Student not found"));

       student.setName(updatedStudent.getName());
       student.setEmail(updatedStudent.getEmail());
       student.setAge(updatedStudent.getAge());
       return studentRepository.save(student);
    }

    @Override
    public void deleteStudent(Long id){
        studentRepository.deleteById(id);
    }
}
