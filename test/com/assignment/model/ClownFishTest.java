package com.assignment.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClownFishTest {

    private ClownFish clownFish;

    @BeforeEach
    void setUp() {
        clownFish = new ClownFish("small", "orange");
    }

    @Test
    void testClownFishSize() {
        assertEquals("small", clownFish.getSize());
    }

    @Test
    void testClownFishColor() {
        assertEquals("orange", clownFish.getColor());
    }

    @Test
    void testMakeJokesß() {
        assertEquals("I make jokes", clownFish.makeJokes());
    }
}