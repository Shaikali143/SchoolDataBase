package com.shaik.school.schooldatabase.Service;

import com.shaik.school.schooldatabase.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {

    Student saveStudent(Student student);
    List<Student> getAllStudent();
    Student getStudentById(Long id);
    Student updateStudent(Long id, Student student);
    void deleteStudent(Long id);
}
