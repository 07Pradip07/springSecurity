package com.example.springsection2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticeController {
    @GetMapping("/notices")
    public String getNotice(String input){
        return "here notoce for DB";
    }
}
