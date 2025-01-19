package com.example.task;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class PropertyParser {
    public static void main(String[] args) throws Exception {
        // Створення об'єкта для зберігання властивостей
        Properties properties = new Properties();

        // Загрузка файлу application.properties
        try (InputStream input = PropertyParser.class.getClassLoader().getResourceAsStream("application.properties")) {
            // Перевірка, чи файл існує
            if (input == null) {
                System.out.println("Вибачте, неможливо знайти файл application.properties");
                return;
            }
            // Завантаження властивостей з файлу
            properties.load(input);
        }

        // Створення карти (Map), де ключ - категорія, а значення - позначення
        Map<String, String> categoryToCodeMap = new HashMap<>();

        // Ітерація по всіх властивостях файлу
        for (String key : properties.stringPropertyNames()) {
            // Отримання значення для поточного ключа
            String value = properties.getProperty(key);
            // Додавання в карту: значення (категорія) як ключ, а ключ (позначення) як значення
            categoryToCodeMap.put(value, key);
        }

        // Виведення карти на екран
        categoryToCodeMap.forEach((category, code) -> {
            System.out.println("Категорія: " + category + ", Код: " + code);
        });
    }
}
