package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GreeterTest {

    @Test
    void testGreet() {
        Greeter greeter = new Greeter();
        assertEquals("Hello, Takuma!", greeter.greet("Takuma"));
    }

    @Test
    void testAdd() {
        Greeter greeter = new Greeter();
        assertEquals(5, greeter.add(2, 3));
    }
}
