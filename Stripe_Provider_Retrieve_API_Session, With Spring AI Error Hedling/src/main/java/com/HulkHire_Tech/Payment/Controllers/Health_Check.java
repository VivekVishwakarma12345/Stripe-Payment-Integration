package com.HulkHire_Tech.Payment.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Health_Check {

    @GetMapping("/health_check")
    public String healthCheck() {
        return "Payment Service is up and running!";
    }
}