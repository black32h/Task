package com.example.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// Аннотація @RestController для обробки HTTP-запитів
@RestController
public class NumberStringListController {

    // Автоматична прив'язка компонента
    @Autowired
    private NumberStringListComponent numberStringListComponent;

    // Обробка GET-запиту за маршрутом "/numberStringList"
    @GetMapping("/numberStringList")
    public List<String> getNumberStringList() {
        return numberStringListComponent.getNumberStringList(); // Повертаємо список у HTTP-відповіді
    }
}
