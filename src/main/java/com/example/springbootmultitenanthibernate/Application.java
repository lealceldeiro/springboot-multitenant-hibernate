package com.example.springbootmultitenanthibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.springbootmultitenanthibernate")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
