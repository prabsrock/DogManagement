package com.example.dog.service;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DogValidationTests {

    private DogValidation dogValidation;

    @BeforeEach
    void setUp() {
        dogValidation = new DogValidation();
    }

    @Test
    void testIsXSSAttempted_validName() {
        String validName = "Golden";
        assertFalse(dogValidation.isXSSAttempted(validName), "Valid dog name should not be flagged as XSS");
    }

    @Test
    void testIsXSSAttempted_invalidName() {
        String invalidName = "<script>alert('XSS')</script>";
        assertTrue(dogValidation.isXSSAttempted(invalidName), "Invalid dog name should be flagged as XSS");
    }

    @Test
    void testIsValidDogId_validId() {
        int validId = 123;
        assertTrue(dogValidation.isValidDogId(validId), "Valid dog ID should pass validation");
    }

    @Test
    void testIsValidDogId_invalidId() {
        int invalidId = 0;
        assertFalse(dogValidation.isValidDogId(invalidId), "Invalid dog ID should be failing validation");
    }
}
