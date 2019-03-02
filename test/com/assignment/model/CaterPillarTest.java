package com.assignment.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaterPillarTest {
    private CaterPillar caterPillar;

    @BeforeEach
    void setUp() {
        caterPillar = new CaterPillar();
    }

    @Test
    void testWalk() {
        assertEquals("I am caterpillar crawling",caterPillar.walk());
    }

    @Test
    void testMetaMorphize() {
        assertEquals(ButterFly.class,caterPillar.metaMorphize().getClass());
    }

}