package com.example.dog.config;

public final class AppConstants {
    private AppConstants() {} // Prevent instantiation

    public static final String dogNameRegex = "^[A-Za-z]{1,35}$";
    public static final String dogIdRegex = "^[1-9][0-9]{0,4}$";
}
