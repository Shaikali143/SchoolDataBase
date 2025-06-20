package com.shaik.school.schooldatabase.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "students")
@Data                      //Auto generates getter, setter, toString, equals, hashCode
@NoArgsConstructor         // No-args Constructor
@AllArgsConstructor        // All-args constructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private Integer age;


}
