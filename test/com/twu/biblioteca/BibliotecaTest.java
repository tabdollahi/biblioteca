package com.twu.biblioteca;


import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class BibliotecaTest {

    Biblioteca testBib;

    @Before
    public void setUp() {
        testBib = new Biblioteca();
    }

    @Test
    public void shouldDisplayWelcomeMessageOnStart() {
        assertEquals("Welcome to Biblioteca!", testBib.greeting());
    }

    @Test
    public void shouldListBooks() {
        assertEquals("Book 1", testBib.browse());
    }
}
