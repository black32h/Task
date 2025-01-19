package com.example.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// Аннотація @RestController для обробки HTTP-запитів
@RestController
public class NumberStringListController {

    // Автоматична прив'язка компонента
    @Autowired // Використання анотації @Autowired для автоматичного впровадження біну NumberStringListComponent
    private NumberStringListComponent numberStringListComponent; // Поле для компонента, який забезпечує доступ до списку

    // Обробка GET-запиту за маршрутом "/numberStringList"
    @GetMapping("/numberStringList") // Маршрут для отримання списку рядків
    public List<String> getNumberStringList() {
        return numberStringListComponent.getNumberStringList(); // Повертаємо список як відповідь на HTTP-запит
    }
}
