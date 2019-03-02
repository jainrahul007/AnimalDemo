package com.assignment.model;

public class Rooster implements Singable {

    @Override
    public String sing() {
        String singing = "Cock-a-doodle-doo";
        System.out.println(singing);
        return singing;
    }
}
