package com.potemkin.spring.web.entity;

import java.util.HashMap;
import java.util.Map;

public class Product {
    private String name;
    private String price;

    private String number;
    private Map<String, String> numbers;

    private String type;
    private Map<String, String> types;

    public Product() {
        insert();
    }

    public Product(String name, String price, String type) {
        this.name = name;
        this.price = price;
        this.type = type;
        insert();
    }

    private void insert() {
        numbers = new HashMap<>();
        numbers.put("one", "1");
        numbers.put("two", "2");
        types = new HashMap<>();
        types.put("first type", "firstType");
        types.put("second type", "secondType");
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Map<String, String> getTypes() {
        return types;
    }

    public void setTypes(Map<String, String> types) {
        this.types = types;
    }
}
