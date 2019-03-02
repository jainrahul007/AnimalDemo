package com.assignment.model;

public class ButterFly implements Animal, Flyable {

    @Override
    public String fly() {
        String flying = "I am butterfly flying";
        System.out.println(flying);
        return flying;
    }
}
