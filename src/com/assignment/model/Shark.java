package com.assignment.model;

public class Shark extends Fish {

    public Shark(String size, String color)
    {
        super(size,color);
    }

    public String eatFish(Fish fish)
    {
        return "I ate " + fish.getSize() +" size fish of color " + fish.getColor();
    }

}
