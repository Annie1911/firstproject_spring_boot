package com.demo.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.demo.demo.models.Students;
import com.demo.demo.repositories.StudentRepository;



@Service
public class StudentService {

    @Autowired
    private  StudentRepository studentRepository ;

    
    public Students getStudent(Students student)
    {
        return studentRepository.save(student);
    }
}
