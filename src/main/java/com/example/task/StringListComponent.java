package com.example.task;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

// Аннотация @Component делает этот класс бином Spring
// Аннотация @ConfigurationProperties связывает свойства с префиксом "string" с этим классом
@Component
@ConfigurationProperties(prefix = "string")
public class StringListComponent {

    // Переменная должна соответствовать имени свойства в application.properties
    private List<String> list;

    // Геттер для доступа к списку
    public List<String> getList() {
        return list;
    }

    // Сеттер для связывания значений из .properties
    public void setList(List<String> list) {
        this.list = list;
    }

    // Метод для вывода списка в консоль
    public void printStringList() {
        if (list != null) {
            list.forEach(System.out::println);
        } else {
            System.out.println("Список пуст!");
        }
    }
}
