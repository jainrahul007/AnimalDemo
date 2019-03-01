package com.assignment.model;

public class Bird implements Animal{
    public String fly()
    {
        return "I am flying";
    }

    public String sing()
    {
        return "I am singing";
    }

    @Override
    public String walk() {
        return "I am walking";
    }
}
