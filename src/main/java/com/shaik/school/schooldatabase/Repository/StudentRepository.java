package com.shaik.school.schooldatabase.Repository;

import com.shaik.school.schooldatabase.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
