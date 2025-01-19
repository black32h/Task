package com.example.task;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Map;

@RestController
public class CategoryController {

    // Отримуємо строку з даними з application.properties
    @Value("${test.map}")
    private String testMapString;

    // Метод для отримання карти (Map)
    @GetMapping("/map")
    public Map<String, String> getMap() throws IOException {
        // Заміняємо одинарні лапки на подвійні, щоб відповідати синтаксису JSON
        String formattedMapString = testMapString.replace("'", "\"");

        // Створюємо об'єкт ObjectMapper для перетворення строки в карту
        ObjectMapper objectMapper = new ObjectMapper();

        // Перетворюємо строку в Map
        Map<String, String> map = objectMapper.readValue(formattedMapString, Map.class);

        // Повертаємо карту
        return map;
    }
}
