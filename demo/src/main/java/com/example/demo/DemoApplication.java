package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication   // Marks this as a Spring Boot application
public class DemoApplication {

    public static void main(String[] args) {
        System.out.println("🚀 Starting Spring Boot Application...");
        SpringApplication.run(DemoApplication.class, args);
        System.out.println("✅ Application is running at http://localhost:8080");
    }
}
