package com.assignment.model;

public class Fish implements Animal,Swimable {

    private String size;
    private String color;

    public Fish() {
    }

    public Fish(String size, String color) {
        this.size = size;
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String swim() {
        String swimming = "I am fish swimming";
        System.out.println(swimming);
        return swimming;
    }
}
