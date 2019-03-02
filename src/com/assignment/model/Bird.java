package com.assignment.model;

public class Bird implements Animal{
    public String fly()
    {
        String flying = "I am flying";
        System.out.println(flying);
        return flying;
    }

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
