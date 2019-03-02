package com.assignment.model;

public class Dog implements Animal,Singable {
    @Override
    public String sing() {
        String singing = "Woof, woof";
        System.out.println(singing);
        return singing;
    }
}
