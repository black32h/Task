package com.example.task;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

// Аннотація @Component робить цей клас біном Spring
@Component
public class NumberStringListComponent {

    // Використання @Value і SpEL для отримання списку зі строки
    @Value("#{'${numberStringList}'.split(',')}") // Анотація @Value з використанням SpEL (Spring Expression Language) для отримання списку значень, розділених комами, зі строки властивостей
    private List<String> numberStringList; // Поле для зберігання списку значень

    // Гетер для доступу до списку
    public List<String> getNumberStringList() { // Метод, який повертає список
        return numberStringList;
    }

    // Метод для виведення списку в консоль
    public void printNumberStringList() { 
        if (numberStringList != null) { // Перевіряємо, чи список не є null
            numberStringList.forEach(System.out::println); // Виводимо кожен елемент списку у консоль
        } else {
            System.out.println("Список порожній!"); // Повідомлення, якщо список порожній
        }
    }
}

