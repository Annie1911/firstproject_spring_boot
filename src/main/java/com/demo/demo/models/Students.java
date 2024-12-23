package com.demo.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Students")

public class Students {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    private Long id;

    @Getter @Setter
    private String firstName;

    @Getter @Setter
    private String lastName;

    @Getter @Setter
    private Integer age;
    
    @Getter @Setter
    private String phone;
    
}
