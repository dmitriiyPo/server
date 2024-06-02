package com.example.server3.service;

import com.example.server3.model.Student;

import java.util.List;

public interface IStudentService {

    List<Student> findAllStudent();
    Student saveStudent(Student student);
//    Student findByEmail(String email);
//    Student updateStudent(Student student);
//    void deleteStudent(String email);
}
