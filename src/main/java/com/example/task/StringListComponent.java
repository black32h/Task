package com.example.task;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

// Аннотація @Component робить цей клас біном Spring
// Аннотація @ConfigurationProperties зв'язує властивості з префіксом "string" із цим класом
@Component
@ConfigurationProperties(prefix = "string")
public class StringListComponent {

    // Змінна повинна відповідати імені властивості в application.properties
    private List<String> list;

    // Гетер для доступу до списку
    public List<String> getList() {
        return list;
    }

    // Сетер для зв'язування значень із .properties
    public void setList(List<String> list) {
        this.list = list;
    }

    // Метод для виведення списку в консоль
    public void printStringList() {
        if (list != null) {
            list.forEach(System.out::println);
        } else {
            System.out.println("Список порожній!");
        }
    }
}

