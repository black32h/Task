package com.example.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // Позначає клас як контролер для обробки HTTP-запитів
public class RandomValuesController {

    @Autowired  // Автоматичне впровадження біну RandomValuesComponent
    private RandomValuesComponent randomValuesComponent;

    // Обробник GET-запиту, який повертає випадкові значення
    @GetMapping("/randomValues")  // Маппінг на запит за адресою "/randomValues"
    public RandomValues getRandomValues() {
        // Повертає новий об'єкт RandomValues, заповнений значеннями з RandomValuesComponent
        return new RandomValues(randomValuesComponent.getNumber(),
                randomValuesComponent.getRandomLong(),
                randomValuesComponent.getUuid());
    }
}

