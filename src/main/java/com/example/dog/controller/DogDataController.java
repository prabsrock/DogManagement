package com.example.dog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import com.example.dog.model.DogData;
import com.example.dog.repository.DogDataRepository;

@RestController
@RequestMapping(path = "/api")
public class DogDataController {

    @Autowired
    private DogDataRepository dogDataRepository;

    @PostMapping(path = "/dogs")
    public DogData addDogData(@RequestBody DogData dogData) {
        return dogDataRepository.save(dogData);
    }

    @GetMapping(path = "/dogs")
    public @ResponseBody List<DogData> getAllDog() {
        return dogDataRepository.findAll();
    }

    @GetMapping(path = "/dogs/{id}")
    public @ResponseBody DogData getDogById(@PathVariable Integer id) {
        DogData dogData = dogDataRepository.findById(id).orElseThrow(() -> new RuntimeException("Dog data not found"));
        return dogData;
    }

    @PutMapping(path = "/dogs/{id}")
    public @ResponseBody DogData updateDogData(@PathVariable Integer id, @RequestBody DogData newDogData) {
        DogData dogData = dogDataRepository.findById(id).orElseThrow(() -> new RuntimeException("Dog data not found"));
        dogData.setDogBreed(newDogData.getDogBreed());
        dogData.setDogType(newDogData.getDogType());
        dogDataRepository.save(dogData);
        return dogData;
    }

    @DeleteMapping(path = "/dogs/{id}")
    public @ResponseBody String deleteDogData(@PathVariable Integer id) {
        if (dogDataRepository.existsById(id)) {
            dogDataRepository.deleteById(id);
        }
        return "Dog data is deleted.";
    }

}
