package com.example.task;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Map;

@RestController
public class CategoryController {

    // Получаем строку с данными из application.properties
    @Value("${test.map}")
    private String testMapString;

    // Метод для получения карты
    @GetMapping("/map")
    public Map<String, String> getMap() throws IOException {
        // Заменяем одинарные кавычки на двойные, чтобы соответствовать синтаксису JSON
        String formattedMapString = testMapString.replace("'", "\"");

        // Создаем объект ObjectMapper для преобразования строки в карту
        ObjectMapper objectMapper = new ObjectMapper();

        // Преобразуем строку в Map
        Map<String, String> map = objectMapper.readValue(formattedMapString, Map.class);

        // Возвращаем карту
        return map;
    }
}
