package com.example.dog.config;

public final class ErrorMessages {
    private ErrorMessages() {} // Prevent instantiation

    public static final String nameValidationError = "Invalid input. Only alphabets allowed, max 35 characters.";
    public static final String idValidationError = "Invalid input. Id should be between 1-99999.";
    public static final String dogNotFound = "Dog id not found.";

}