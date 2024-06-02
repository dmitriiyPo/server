package com.example.server3.controller;

import com.example.server3.model.Student;
import com.example.server3.service.IStudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@AllArgsConstructor
public class StudentController {


    private final IStudentService service;

    @GetMapping
    public List<Student> findAllStudent() {
        //todo
        return service.findAllStudent();
    }

    @PostMapping("/save_student")
    public Student saveStudent(@RequestBody Student student) {
        return service.saveStudent(student);
    }

//    @GetMapping("/{email}")
//    public Student findByEmail(@PathVariable String email) {
//        return service.findByEmail(email);
//    }
//
//    @PutMapping("update_student")
//    public Student updateStudent(@RequestBody Student student) {
//        return service.updateStudent(student);
//    }
//
//    @DeleteMapping("delete_student/{email}")
//    public void deleteStudent(@PathVariable String email){
//        service.deleteStudent(email);
//    }

}
