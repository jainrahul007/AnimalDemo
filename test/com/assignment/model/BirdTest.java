package com.assignment.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BirdTest {

    private Bird bird;

    @BeforeEach
    void setUp() {
        bird = new Bird();
    }

    @Test
    void fly() {
        assertEquals("I am flying", bird.fly());
    }

    @Test
    void sing() {
        assertEquals("I am singing", bird.sing());
    }

    @Test
    void walk() {
        assertEquals("I am walking", bird.walk());
    }
}