package com.assignment.model;

public class Bird implements Animal, Walkable, Singable{

    @Override
    public String sing()
    {
        String singing = "I am singing";
        System.out.println(singing);
        return singing;
    }

    @Override
    public String walk() {
        String walking = "I am walking";
        System.out.println(walking);
        return walking;
    }

}
