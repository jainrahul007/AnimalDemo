package com.assignment.model;

public class Cat implements Animal,Singable {
    @Override
    public String sing() {
        String singing = "Meow";
        System.out.println(singing);
        return singing;
    }
}
