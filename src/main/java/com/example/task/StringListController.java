package com.example.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// Аннотація @RestController використовується для обробки HTTP-запитів
@RestController
public class StringListController {

    // Автоматичне зв'язування компонента через @Autowired
    @Autowired
    private StringListComponent stringListComponent;

    // Обробка GET-запиту за маршрутом "/stringList"
    @GetMapping("/stringList")
    public List<String> getStringList() {
        return stringListComponent.getList(); // Повертаємо список у HTTP-відповіді
    }
}
