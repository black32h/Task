package com.example.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {

    @Autowired
    private CollectionsPropertyUtils collectionsPropertyUtils;

    @GetMapping("/value")
    public String getValue(@RequestParam String key) {
        String value = collectionsPropertyUtils.getValueByKey(key);
        if (value == null) {
            return "Key not found: " + key;
        }
        return "Value for " + key + ": " + value;
    }
}
