package com.example.task;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

// Аннотація @Component робить цей клас біном Spring
@Component
public class NumberStringListComponent {

    // Використання @Value і SpEL для отримання списку зі строки
    @Value("#{'${numberStringList}'.split(',')}")
    private List<String> numberStringList;

    // Гетер для доступу до списку
    public List<String> getNumberStringList() {
        return numberStringList;
    }

    // Метод для виведення списку в консоль
    public void printNumberStringList() {
        if (numberStringList != null) {
            numberStringList.forEach(System.out::println);
        } else {
            System.out.println("Список порожній!");
        }
    }
}
