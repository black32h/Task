package com.example.task;

public class RandomValues {

    private String number;  // Поле для збереження випадкового числа у вигляді рядка
    private long randomLong;  // Поле для збереження випадкового довгого числа
    private String uuid;  // Поле для збереження випадкового UUID

    // Конструктор для ініціалізації полів
    public RandomValues(String number, long randomLong, String uuid) {
        this.number = number;  // ініціалізація поля number
        this.randomLong = randomLong;  // ініціалізація поля randomLong
        this.uuid = uuid;  // ініціалізація поля uuid
    }

    // Геттер для отримання значення поля number
    public String getNumber() {
        return number;
    }

    // Геттер для отримання значення поля randomLong
    public long getRandomLong() {
        return randomLong;
    }

    // Геттер для отримання значення поля uuid
    public String getUuid() {
        return uuid;
    }
}
