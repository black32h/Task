package com.example.task;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component  // Компонент Spring, который будет автоматически зарегистрирован как бин
public class RandomValuesComponent {

    @Value("${random.number}")  // Прив'язка значення з application.properties для випадкового числа
    private String number;  // Тепер змінна має тип String, щоб отримати рядок з application.properties

    @Value("${random.long}")  // Прив'язка значення з application.properties для випадкового long числа
    private long randomLong;

    @Value("${random.uuid}")  // Прив'язка значення з application.properties для випадкового UUID
    private String uuid;

    // Геттер для отримання випадкового числа
    public String getNumber() {
        return number;  // Тепер повертаємо рядок
    }

    // Геттер для отримання випадкового довгого числа
    public long getRandomLong() {
        return randomLong;
    }

    // Геттер для отримання випадкового UUID
    public String getUuid() {
        return uuid;
    }

    // Метод для виведення значень у консоль
    public void printRandomValues() {
        System.out.println("Random Number: " + number);  // Тепер це рядок
        System.out.println("Random Long: " + randomLong);
        System.out.println("Random UUID: " + uuid);
    }
}

