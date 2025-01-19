package com.example.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringListController {

    @Autowired
    private StringListComponent stringListComponent;

    @GetMapping("/stringList")
    public String getStringList() {
        stringListComponent.printStringList(); // Виклик методу для друку списку
        return "Check your console for the output!"; // Повертаємо відповідь
    }
}
