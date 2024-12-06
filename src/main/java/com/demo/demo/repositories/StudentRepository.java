package com.demo.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.demo.models.Students;

public interface StudentRepository extends JpaRepository<Students,Long> {
    
    
}
