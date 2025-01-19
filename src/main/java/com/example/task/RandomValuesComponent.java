package com.example.task;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RandomValuesComponent {

    @Value("${random.number}")
    private String number;  // Поменяли тип на String, чтобы получить строку из application.properties

    @Value("${random.long}")
    private long randomLong;

    @Value("${random.uuid}")
    private String uuid;

    // Геттеры для полей
    public String getNumber() {
        return number;  // Теперь возвращаем строку
    }

    public long getRandomLong() {
        return randomLong;
    }

    public String getUuid() {
        return uuid;
    }

    // Метод для вывода значений в консоль
    public void printRandomValues() {
        System.out.println("Random Number: " + number);  // Теперь это строка
        System.out.println("Random Long: " + randomLong);
        System.out.println("Random UUID: " + uuid);
    }
}
