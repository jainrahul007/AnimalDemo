package com.assignment.model;

public class Duck implements Singable, Swimable{

    @Override
    public String sing()
    {
        String singing = "Quack, quack";
        System.out.println(singing);
        return singing;
    }

    @Override
    public String swim() {
        String swimming = "I can swim";
        System.out.println(swimming);
        return swimming;
    }
}
