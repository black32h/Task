package com.example.task;

public class RandomValues {

    private String number;
    private long randomLong;
    private String uuid;

    public RandomValues(String number, long randomLong, String uuid) {
        this.number = number;
        this.randomLong = randomLong;
        this.uuid = uuid;
    }

    // Геттеры
    public String getNumber() {
        return number;
    }

    public long getRandomLong() {
        return randomLong;
    }

    public String getUuid() {
        return uuid;
    }
}
