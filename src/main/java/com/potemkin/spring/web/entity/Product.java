package com.potemkin.spring.web.entity;

import java.util.HashMap;
import java.util.Map;

public class Product {
    private String name;
    private String price;

    private String number;
    private Map<String, String> numbers;

    public Product() {
        insertNumbers();
    }

    public Product(String name, String price) {
        this.name = name;
        this.price = price;
        insertNumbers();
    }

    private void insertNumbers() {
        numbers = new HashMap<>();
        numbers.put("one", "1");
        numbers.put("two", "2");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Map<String, String> getNumbers() {
        return numbers;
    }

    public void setNumbers(Map<String, String> numbers) {
        this.numbers = numbers;
    }
}
