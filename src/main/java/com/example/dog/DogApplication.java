package com.example.dog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DogApplication {

	public static void main(String[] args) {
		System.out.println("Hello Dog!");
		SpringApplication.run(DogApplication.class, args);
	}

}
