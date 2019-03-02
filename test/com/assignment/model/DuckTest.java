package com.assignment.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuckTest {

    private Duck duck;

    @BeforeEach
    void setUp() {
        duck = new Duck();
    }

    @Test
    void sing() {
        assertEquals("Quack, quack", duck.sing());
    }

    @Test
    void swim() {
        assertEquals("I am duck swimming", duck.swim());
    }
}