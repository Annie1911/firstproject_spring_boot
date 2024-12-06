package com.demo.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.demo.demo.models.Students;
import com.demo.demo.services.StudentService;

@Controller
public class StudentController {
    
    private final StudentService studentService;

    public StudentController(StudentService studentService) 
    {
        this.studentService = studentService;
    }
    @PostMapping("/students")
    public Students saveStudent(Students student)
    {
        return studentService.getStudent(student);
    }
    
    
}
