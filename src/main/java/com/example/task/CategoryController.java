package com.example.task;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class CategoryController {

    // Читаємо значення з application.properties для кожної категорії
    @Value("${driverDocType2Categories.MOTO}")
    private String motoCategories;

    @Value("${driverDocType2Categories.CAR}")
    private String carCategories;

    @Value("${driverDocType2Categories.TRUCK}")
    private String truckCategories;

    @Value("${driverDocType2Categories.BUS}")
    private String busCategories;

    // Метод для отримання карти категорій з їх набором значень
    @GetMapping("/categories")
    public Map<String, List<String>> getCategories() {
        // Створюємо карту, де ключ - категорія, а значення - список значень
        Map<String, List<String>> categoryMap = new HashMap<>();

        // Розділяємо строку на елементи і додаємо їх в карту
        categoryMap.put("MOTO", convertToList(motoCategories));  // Додаємо категорію "MOTO" та її значення
        categoryMap.put("CAR", convertToList(carCategories));    // Додаємо категорію "CAR" та її значення
        categoryMap.put("TRUCK", convertToList(truckCategories)); // Додаємо категорію "TRUCK" та її значення
        categoryMap.put("BUS", convertToList(busCategories));    // Додаємо категорію "BUS" та її значення

        // Повертаємо карту
        return categoryMap;
    }

    // Метод для перетворення строки в список
    private List<String> convertToList(String categories) {
        List<String> categoryList = new ArrayList<>();

        // Розділяємо строку по комі і додаємо кожен елемент в список
        for (String category : categories.split(",")) {
            categoryList.add(category.trim()); // Додаємо кожен елемент, усуваючи зайві пробіли
        }

        // Повертаємо список
        return categoryList;
    }
}
