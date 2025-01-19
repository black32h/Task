package com.example.task;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class CategoryController {

    // Отримуємо значення з application.properties для категорій
    @Value("${driverDocType2Category.MOTO}")
    private String motoCategory;

    @Value("${driverDocType2Category.CAR}")
    private String carCategory;

    @Value("${driverDocType2Category.TRUCK}")
    private String truckCategory;

    @Value("${driverDocType2Category.BUS}")
    private String busCategory;

    // Метод для отримання карти категорій
    @GetMapping("/categories")
    public Map<String, String> getCategories() {
        // Створюємо нову карту для зберігання категорій
        Map<String, String> categoryMap = new HashMap<>();

        // Додаємо кожну категорію в карту, де ключ - категорія, а значення - тип транспорту
        categoryMap.put(motoCategory, "MOTO");
        categoryMap.put(carCategory, "CAR");
        categoryMap.put(truckCategory, "TRUCK");
        categoryMap.put(busCategory, "BUS");

        // Повертаємо карту
        return categoryMap;
    }
}
