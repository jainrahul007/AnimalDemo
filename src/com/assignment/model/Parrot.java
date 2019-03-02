package com.assignment.model;

public class Parrot implements Singable{

    private Singable singable;

    Parrot(Singable singable)
    {
        this.singable = singable;
    }


    @Override
    public String sing() {
        return singable.sing();
    }
}
