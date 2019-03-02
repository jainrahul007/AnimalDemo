package com.assignment.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SharkTest {

    private Shark shark;
    private Fish fish;

    @BeforeEach
    void setUp() {
        shark = new Shark("large", "grey");
    }

    @Test
    void testSharkSize() {
        assertEquals("large", shark.getSize());
    }

    @Test
    void testSharkColor() {
        assertEquals("grey", shark.getColor());
    }

    @Test
    void testEatFish() {
        fish = new Fish("medium","red");
        assertEquals("I ate medium size fish of color red", shark.eatFish(fish));
    }
}