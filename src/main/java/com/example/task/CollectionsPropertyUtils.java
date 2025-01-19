package com.example.task;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.stream.Collectors;

@Component
@ConfigurationProperties(prefix = "test.map")
public class CollectionsPropertyUtils {

    private Map<String, String> testMap;

    // Метод для фильтрации карты (по ключу, например, исключаем "key3")
    public Map<String, String> getFilteredTestMap() {
        return testMap.entrySet()
                .stream()
                .filter(entry -> !"key3".equals(entry.getKey())) // Исключаем ключ "key3"
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    public Map<String, String> getTestMap() {
        return testMap;
    }

    public void setTestMap(Map<String, String> testMap) {
        this.testMap = testMap;
    }

    // Метод для вывода карты
    public void filteredMap() {
        System.out.println(getFilteredTestMap());
    }
}
