package com.example.dog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import com.example.dog.Exception.InvalidDogIdException;
import com.example.dog.config.ErrorMessages;
import com.example.dog.model.DogData;
import com.example.dog.repository.DogDataRepository;
import com.example.dog.service.DogValidation;

@RestController
@RequestMapping(path = "/api")
public class DogDataController {

    @Autowired
    private DogDataRepository dogDataRepository;

    @Autowired
    private DogValidation dogValidation;

    @PostMapping(path = "/dogs")
    public DogData addDogData(@RequestBody DogData dogData) {
        if (dogValidation.isXSSAttempted(dogData.getDogBreed())
                || dogValidation.isXSSAttempted(dogData.getDogType())) {
            throw new InvalidDogIdException(ErrorMessages.nameValidationError);
        }
        return dogDataRepository.save(dogData);
    }

    @GetMapping(path = "/dogs")
    public @ResponseBody List<DogData> getAllDog() {
        return dogDataRepository.findAll();
    }

    @GetMapping(path = "/dogs/{id}")
    public @ResponseBody DogData getDogById(@PathVariable Integer id) {
        if (!dogValidation.isValidDogId(id)) {
            throw new InvalidDogIdException(ErrorMessages.idValidationError);
        }
        DogData dogData = dogDataRepository.findById(id).orElseThrow(() -> new InvalidDogIdException(ErrorMessages.dogNotFound));
        return dogData;
    }

    @PutMapping(path = "/dogs/{id}")
    public @ResponseBody DogData updateDogData(@PathVariable Integer id, @RequestBody DogData newDogData) {
        if (!dogValidation.isValidDogId(id)) {
            throw new InvalidDogIdException(ErrorMessages.idValidationError);
        }
        DogData dogData = dogDataRepository.findById(id).orElseThrow(() -> new RuntimeException("Dog data not found"));
        dogData.setDogBreed(newDogData.getDogBreed());
        dogData.setDogType(newDogData.getDogType());
        dogDataRepository.save(dogData);
        return dogData;
    }

    @DeleteMapping(path = "/dogs/{id}")
    public @ResponseBody String deleteDogData(@PathVariable Integer id) {
        if (!dogValidation.isValidDogId(id)) {
            throw new InvalidDogIdException(ErrorMessages.idValidationError);
        }else if (dogDataRepository.existsById(id)) {
            dogDataRepository.deleteById(id);
        }else{
            throw new InvalidDogIdException(ErrorMessages.dogNotFound);
        }
        return "Dog data is deleted.";
    }

}
