package com.assignment.model.com.assignment.demo;

import com.assignment.model.Language;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LangugeTranslatorTest {
    private LangugeTranslator langugeTranslator;

    @BeforeEach
    void setUp() {
        langugeTranslator = new LangugeTranslator();
    }

    @Test
    void translate() {
        assertEquals("kykyliky",langugeTranslator.translate(Language.Danish));
        assertEquals("kikiriki",langugeTranslator.translate(Language.Greek));
    }
}