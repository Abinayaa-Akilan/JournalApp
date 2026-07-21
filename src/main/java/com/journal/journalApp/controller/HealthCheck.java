package com.journal.journalApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {
    @GetMapping("/heath-check")
    public String healthCheck(){
        System.out.println("Hey this is kraken speaking!");
        return "OK";
    }
}
