package com.example.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RandomValuesController {

    @Autowired
    private RandomValuesComponent randomValuesComponent;

    @GetMapping("/randomValues")
    public RandomValues getRandomValues() {
        return new RandomValues(randomValuesComponent.getNumber(),
                randomValuesComponent.getRandomLong(),
                randomValuesComponent.getUuid());
    }
}

