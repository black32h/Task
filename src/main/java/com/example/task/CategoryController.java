package com.example.task;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;
import java.util.Map;

@RestController
public class CategoryController {

    // Отримуємо строку з даними з application.properties
    @Value("${test.map.list.value}")
    private String testMapString;

    // Метод для отримання карти з ключами та списками значень
    @GetMapping("/map")
    public Map<String, List<String>> getMap() throws IOException {
        // Заміняємо одинарні лапки на подвійні для коректного JSON формату
        String formattedMapString = testMapString.replace("'", "\"");

        // Створюємо об'єкт ObjectMapper для перетворення строки в карту
        ObjectMapper objectMapper = new ObjectMapper();

        // Перетворюємо строку в Map з ключами та списками значень
        Map<String, List<String>> map = objectMapper.readValue(formattedMapString, Map.class);

        // Повертаємо карту
        return map;
    }
}
