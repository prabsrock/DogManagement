package com.example.dog.service;

import org.springframework.stereotype.Component;

import com.example.dog.config.AppConstants;
import com.example.dog.config.ErrorMessages;

@Component
public class DogValidation {
    //input validation

    public Boolean isXSSAttempted(String name){
        if (!name.matches(AppConstants.dogNameRegex)) {
            System.out.println(ErrorMessages.nameValidationError);
            return true;
        }
        return false;
    
    }

    public Boolean isValidDogId(int id){
        if (Integer.toString(id).matches(AppConstants.dogIdRegex)) {
            System.out.println(ErrorMessages.idValidationError);
            return true;
        }
        return false;
    
    }
}
