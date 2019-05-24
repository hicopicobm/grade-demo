package com.example.gradedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GradeDemoApplication {

    public static void main(String[] args) {
        System.out.println("This is gradle demo application");
        SpringApplication.run(GradeDemoApplication.class, args);
    }

}
