package com.assignment.model;

public class Chicken implements Singable{

    @Override
    public String sing()
    {
        String singing = "Cluck, cluck";
        System.out.println(singing);
        return singing;
    }
}
