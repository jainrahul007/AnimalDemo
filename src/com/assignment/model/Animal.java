package com.assignment.model;

public abstract class Animal implements Walkable{

    @Override
    public String walk() {
        String walking = "I am walking";
        System.out.println(walking);
        return walking;
    }
}
