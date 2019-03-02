package com.assignment.model;

public class Phone implements Singable {
    @Override
    public String sing() {
        String singing = "Tring, tring";
        System.out.println(singing);
        return singing;
    }
}


