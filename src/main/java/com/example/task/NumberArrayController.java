package com.example.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumberArrayController {

    @Autowired
    private NumberArrayComponen numberArrayComponent;

    @GetMapping("/numbers")
    public String getNumbers() {
        numberArrayComponent.printNumberArray();
        return "Check your console for the output!";
    }
}
