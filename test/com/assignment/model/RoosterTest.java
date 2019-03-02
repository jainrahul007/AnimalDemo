package com.assignment.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoosterTest {

    private Rooster rooster;

    @BeforeEach
    void setUp() {
        rooster = new Rooster();
    }

    @Test
    void sing() {
        assertEquals("Cock-a-doodle-doo", rooster.sing());
    }
}