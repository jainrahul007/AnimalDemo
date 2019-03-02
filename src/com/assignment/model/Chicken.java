package com.assignment.model;

public class Chicken extends Bird implements Singable{

    @Override
    public String sing()
    {
        String singing = "Cluck, cluck";
        System.out.println(singing);
        return singing;
    }
}
