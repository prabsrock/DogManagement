package com.example.dog.Exception;

public class InvalidDogIdException extends RuntimeException {
    public InvalidDogIdException(String message) {
        super(message);
    }
}

