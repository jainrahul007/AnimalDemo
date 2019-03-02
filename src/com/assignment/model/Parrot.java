package com.assignment.model;

public class Parrot extends Bird implements Singable{

    private Singable singable;

    public Parrot()
    {

    }

    public Parrot(Singable singable)
    {
        this.singable = singable;
    }


    @Override
    public String sing() {
        return singable.sing();
    }
}
