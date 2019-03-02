package com.assignment.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChickenTest {

    private Chicken chicken;

    @BeforeEach
    void setUp() {
        chicken = new Chicken();
    }

    @Test
    void sing() {
        assertEquals("Cluck, cluck", chicken.sing());
    }
}