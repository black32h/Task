package com.example.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Клас контролера, який обробляє HTTP-запити
@RestController
public class NumberArrayController {

    // Автоматичне впровадження компонента NumberArrayComponen
    @Autowired
    private NumberArrayComponen numberArrayComponent;

    // Метод для обробки GET-запиту на шлях "/numbers"
    @GetMapping("/numbers")
    public String getNumbers() {
        // Викликаємо метод printNumberArray() для виведення чисел з масиву
        numberArrayComponent.printNumberArray();
        
        // Повертаємо повідомлення, що результат виведено на консоль
        return "Check your console for the output!";
    }
}
