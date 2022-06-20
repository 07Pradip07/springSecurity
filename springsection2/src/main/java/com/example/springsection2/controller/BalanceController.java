package com.example.springsection2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceController {

@GetMapping("/myBalance")
    public String getBalnce(String input){
    return "here is the balance";
}
}
