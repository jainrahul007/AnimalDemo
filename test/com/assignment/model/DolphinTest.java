package com.assignment.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DolphinTest {
    private Dolphin dolphin;

    @BeforeEach
    void setUp() {
        dolphin = new Dolphin();
    }

    @Test
    void swim() {
        assertEquals("I can swim", dolphin.swim());
    }
}