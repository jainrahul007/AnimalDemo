package com.assignment.model;

public class Dolphin implements Animal,Swimable{

    @Override
    public String swim() {
        String swimming = "I am dolphin swimming";
        System.out.println(swimming);
        return swimming;
    }
}
