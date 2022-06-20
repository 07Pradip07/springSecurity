package com.example.springsection2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @GetMapping("/myAccount")
    public String getAccountDetails(String input){
        return "here is account details form DB";
    }
}
