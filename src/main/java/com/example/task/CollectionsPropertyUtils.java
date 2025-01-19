package com.example.task;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

// Позначаємо клас як компонент Spring, що дозволяє автоматично впроваджувати його в інші класи
@Component

// Позначаємо, що цей клас буде використовувати конфігураційні властивості з префіксом "test"
@ConfigurationProperties(prefix = "test")
public class CollectionsPropertyUtils {
    
    // Поле для збереження мапи, де ключем буде String, а значенням також String
    private Map<String, String> map;

    // Геттер для отримання мапи
    public Map<String, String> getMap() {
        return map;
    }

    // Сеттер для встановлення мапи
    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    // Метод для отримання значення за ключем із мапи
    public String getValueByKey(String key) {
        // Перевіряємо, чи мапа не пуста, і якщо не пуста, повертаємо значення за ключем
        return map != null ? map.get(key) : null;
    }
}
