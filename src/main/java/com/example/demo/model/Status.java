package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "status")
public class Status {
    
    @Id
    private Integer id;
    
    private String name;
    
    // Default Constructor
    public Status() {}
    
    // All Ars Constructor
    public Status(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
    
    // Getters and Setters
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}