package com.assignment.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ParrotTest {

    private Parrot parrot;
    private Singable singable;

    @Test
    void singWithDog() {
        singable= new Dog();
        parrot = new Parrot(singable);
        assertEquals("Woof, woof", parrot.sing());
    }

    @Test
    void singWithCat() {
        singable= new Cat();
        parrot = new Parrot(singable);
        assertEquals("Meow", parrot.sing());
    }

    @Test
    void singWithRooster() {
        singable= new Rooster();
        parrot = new Parrot(singable);
        assertEquals("Cock-a-doodle-doo", parrot.sing());
    }

    @Test
    void singWithDuck() {
        singable= new Duck();
        parrot = new Parrot(singable);
        assertEquals("Quack, quack", parrot.sing());
    }

    @Test
    void singWithPhone() {
        singable= new Phone();
        parrot = new Parrot(singable);
        assertEquals("Tring, tring", parrot.sing());
    }
}