package com.example.task;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

// Компонент для роботи з властивостями з файлу конфігурації
@Component
@ConfigurationProperties(prefix = "number")  // Зчитуємо властивості з префіксом "number"
public class NumberArrayComponen {

    private int[] array;  // Масив цілих чисел

    // Геттер для масиву
    public int[] getArray() {
        return array;
    }

    // Сеттер для масиву
    public void setArray(int[] array) {
        this.array = array;
    }

    // Метод для виведення чисел масиву в консоль
    public void printNumberArray() {
        // Перебираємо елементи масиву і виводимо їх на консоль
        for (int num : array) {
            System.out.println(num);
        }
    }
}
