package com.example.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// Анотація, що вказує, що цей клас є контролером REST API
@RestController
public class CategoryController {

    // Впровадження залежності CollectionsPropertyUtils за допомогою анотації @Autowired
    @Autowired
    private CollectionsPropertyUtils collectionsPropertyUtils;

    // Обробник GET запиту на маршрут "/value"
    @GetMapping("/value")
    public String getValue(@RequestParam String key) {
        // Отримуємо значення за ключем за допомогою методу getValueByKey
        String value = collectionsPropertyUtils.getValueByKey(key);
        
        // Якщо значення за ключем не знайдено, повертаємо відповідь, що ключ не знайдений
        if (value == null) {
            return "Key not found: " + key;
        }
        
        // Якщо значення знайдено, повертаємо його у форматі "Value for key: value"
        return "Value for " + key + ": " + value;
    }
}
