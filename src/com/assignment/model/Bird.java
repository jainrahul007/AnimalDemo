package com.assignment.model;

public class Bird extends Animal implements Flyable, Singable{

    @Override
    public String fly()
    {
        String flying = "I am flying";
        System.out.println(flying);
        return flying;
    }

    @Override
    public String sing()
    {
        String singing = "I am singing";
        System.out.println(singing);
        return singing;
    }

}
