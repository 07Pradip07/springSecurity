package com.example.springsection2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardsController {
    @GetMapping("/myCard")
    public String getCard(String input){
        return "here is the card";
    }
}
