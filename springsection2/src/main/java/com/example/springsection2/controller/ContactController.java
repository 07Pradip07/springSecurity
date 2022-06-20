package com.example.springsection2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {
    @GetMapping("/contact")
    public String saveContactInqueryDetails(String input){
        return "contact details saved to DB";
    }
}
