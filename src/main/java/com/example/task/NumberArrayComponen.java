package com.example.task;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "number")
public class NumberArrayComponen {

    private int[] array;

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public void printNumberArray() {
        for (int num : array) {
            System.out.println(num);
        }
    }
}
