package com.example.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// Аннотация @RestController для обработки HTTP-запросов
@RestController
public class StringListController {

    // Автоматическая привязка компонента
    @Autowired
    private StringListComponent stringListComponent;

    // Обработка GET-запроса по маршруту "/stringList"
    @GetMapping("/stringList")
    public List<String> getStringList() {
        return stringListComponent.getList(); // Возвращаем список в HTTP-ответе
    }
}
