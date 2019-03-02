package com.assignment.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FishTest {

    private Fish fish;
    @BeforeEach
    void setUp() {
        fish = new Fish();
    }

    @Test
    void swim() {
        assertEquals("I am fish swimming", fish.swim());
    }
}