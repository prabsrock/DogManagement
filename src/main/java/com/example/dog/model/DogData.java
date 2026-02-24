package com.example.dog.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class DogData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Integer id;
    private String dogBreed;
    private String dogType;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getDogBreed() {
        return dogBreed;
    }
    public void setDogBreed(String dogBreed) {
        this.dogBreed = dogBreed;
    }
    public String getDogType() {
        return dogType;
    }
    public void setDogType(String dogType) {
        this.dogType = dogType;
    }
}
