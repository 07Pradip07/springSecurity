package com.example.springsection2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.springsection2.controller")
public class Springsection2Application {

    public static void main(String[] args) {
        SpringApplication.run(Springsection2Application.class, args);
    }

}
