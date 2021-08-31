package com.potemkin.spring.web.entity;

import javax.validation.constraints.*;

import java.util.HashMap;
import java.util.Map;

public class Product {
    //@NotNull, @NotEmpty
    @NotBlank(message = "field is empty")
    @Size(min = 3, message = "min 3")
    @Size(max = 5, message = "max 5")
    private String name;
    @Min(value = 5, message = "value must be higher than 4")
    @Max(value = 10, message = "value must be lower than 11")
    private int price;
    @Pattern(regexp = "\\w+", message = "must contains at least 1 letter")
    private String field;

    private String number;
    private Map<String, String> numbers;

    private String type;
    private Map<String, String> types;
    private String[] info;
    private Map<String, String> infoMap;

    public Product() {
        insert();
    }

    private void insert() {
        numbers = new HashMap<>();
        numbers.put("one", "1");
        numbers.put("two", "2");
        types = new HashMap<>();
        types.put("first type", "firstType");
        types.put("second type", "secondType");
        infoMap = new HashMap<>();
        infoMap.put("info1", "first value");
        infoMap.put("info2", "second value");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
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

    public String[] getInfo() {
        return info;
    }

    public void setInfo(String[] info) {
        this.info = info;
    }

    public Map<String, String> getInfoMap() {
        return infoMap;
    }

    public void setInfoMap(Map<String, String> infoMap) {
        this.infoMap = infoMap;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}
