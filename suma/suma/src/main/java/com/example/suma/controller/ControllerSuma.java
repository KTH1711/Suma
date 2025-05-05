package com.example.suma.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerSuma {

    @GetMapping("/suma")
    public String Sumar(@RequestParam int num1, @RequestParam int num2)
    {
        int total= num1+num2;
        System.out.println("Total: "+total);
        return "Total: "+total;
    }
}
