package com.assignment.rest;

import com.assignment.model.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class AnimalController {
    private final Animal[] animals = new Animal[]{
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

    @RequestMapping("/flyingAnimals")
    public List<String> flyingAnimals() {

        List<String> flyingAnimals = Arrays
                .stream(animals)
                .filter((x) -> x instanceof Flyable)
                .map((x) -> x.getClass().getSimpleName())
                .collect(Collectors.toList());

        return flyingAnimals;
    }

    @RequestMapping("/walkingAnimals")
    public List<String> walkingAnimals() {

        List<String> walkingAnimals = Arrays
                .stream(animals)
                .filter((x) -> x instanceof Walkable)
                .map((x) -> x.getClass().getSimpleName())
                .collect(Collectors.toList());

        return walkingAnimals;
    }

    @RequestMapping("/singingAnimals")
    public List<String> singingAnimals() {

        List<String> singingAnimals = Arrays
                .stream(animals)
                .filter((x) -> x instanceof Singable)
                .map((x) -> x.getClass().getSimpleName())
                .collect(Collectors.toList());

        return singingAnimals;
    }

    @RequestMapping("/swimingAnimals")
    public List<String> swimingAnimals() {

        List<String> swimingAnimals = Arrays
                .stream(animals)
                .filter((x) -> x instanceof Swimable)
                .map((x) -> x.getClass().getSimpleName())
                .collect(Collectors.toList());

        return swimingAnimals;
    }
}