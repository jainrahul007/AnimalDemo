package com.assignment.model.com.assignment.demo;

import com.assignment.model.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        Bird bird = new Chicken();
        bird.walk();
        bird.sing();

        Animal[] animals = new Animal[]{
                new Bird(),
                new Duck(),
                new Chicken(),
                new Rooster(),
                new Parrot(),
                new Fish(),
                new Shark(),
                new ClownFish(),
                new Dolphin(),
                new Dog(),
                new ButterFly(),
                new Cat()
        };

        List<String> flyingAnimals = Arrays
                .stream(animals)
                .filter((x) -> x instanceof Flyable)
                .map((x) -> x.getClass().getSimpleName())
                .collect(Collectors.toList());

        List<String> walkingAnimals = Arrays
                .stream(animals)
                .filter((x) -> x instanceof Walkable)
                .map((x) -> x.getClass().getSimpleName())
                .collect(Collectors.toList());

        List<String> singingAnimals = Arrays
                .stream(animals)
                .filter((x) -> x instanceof Singable)
                .map((x) -> x.getClass().getSimpleName())
                .collect(Collectors.toList());

        List<String> swimingAnimals = Arrays
                .stream(animals)
                .filter((x) -> x instanceof Swimable)
                .map((x) -> x.getClass().getSimpleName())
                .collect(Collectors.toList());

        System.out.println("List contains...");
        System.out.println(flyingAnimals.size() + " of these animals can fly " + flyingAnimals);
        System.out.println(walkingAnimals.size() + " of these animals can walk " + walkingAnimals);
        System.out.println(singingAnimals.size() + " of these animals can sing " + singingAnimals);
        System.out.println(swimingAnimals.size() + " of these animals can swim " + swimingAnimals);
    }
}

