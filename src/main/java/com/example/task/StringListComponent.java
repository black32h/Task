package com.example.task;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ConfigurationProperties(prefix = "number") // Префікс для властивостей у файлі application.properties
public class StringListComponent {

    private List<String> stringList; // Список для зчитування значень

    public List<String> getStringList() {
        return stringList;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    public void printStringList() {
        if (stringList == null || stringList.isEmpty()) { // Перевірка на null і порожній список
            System.out.println("stringList is null or empty");
        } else {
            for (String s : stringList) {
                System.out.println(s); // Вивід елементів списку
            }
        }
    }
}
