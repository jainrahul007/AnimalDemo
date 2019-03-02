package com.assignment.model;

public class CaterPillar implements Animal,Walkable {

    @Override
    public String walk() {
        String walking = "I am caterpillar crawling";
        System.out.println(walking);
        return walking;
    }

    public ButterFly metaMorphize()
    {
        return new ButterFly();
    }
}
