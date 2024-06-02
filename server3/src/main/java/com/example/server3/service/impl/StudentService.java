package com.example.server3.service.impl;

import com.example.server3.model.Student;
import com.example.server3.repository.IStudentRepository;
import com.example.server3.repository.impl.StudentRepository;
import com.example.server3.service.IStudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentService implements IStudentService {

    private final StudentRepository repository;
    @Override
    public List<Student> findAllStudent() {
        return repository.findAllStudent();
    }

    @Override
    public Student saveStudent(Student student) {
        return repository.saveStudent(student);
    }

//    @Override
//    public Student findByEmail(String email) {
//        return repository.findByEmail(email);
//    }
//
//    @Override
//    public Student updateStudent(Student student) {
//        return repository.update(student);
//    }
//
//    @Override
//    public void deleteStudent(String email) {
//        repository.deleteStudent(email);
//    }
}
