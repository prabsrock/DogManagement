package com.example.dog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.dog.model.DogData;

public interface DogDataRepository extends JpaRepository<DogData, Integer>{
    
}
