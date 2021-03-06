package com.example.basicsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.controller")
public class BasicsecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(BasicsecurityApplication.class, args);
    }

}
