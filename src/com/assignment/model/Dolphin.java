package com.assignment.model;

public class Dolphin implements Swimable{

    @Override
    public String swim() {
        String swimming = "I can swim";
        System.out.println(swimming);
        return swimming;
    }
}
