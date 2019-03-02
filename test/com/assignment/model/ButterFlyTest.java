package com.assignment.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ButterFlyTest {

    private ButterFly butterFly;

    @BeforeEach
    void setUp() {
    butterFly = new ButterFly();
    }

    @Test
    void fly() {
        assertEquals("I am butterfly flying", butterFly.fly());
    }
}