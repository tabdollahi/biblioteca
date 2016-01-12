package com.twu.biblioteca;


import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BibliotecaTest {

    Biblioteca testBib;
    PrintStream testStream;

    @Before
    public void setUp() {
        testStream = mock(PrintStream.class);
        testBib = new Biblioteca(testStream);
    }

    @Test
    public void shouldDisplayWelcomeMessageOnStart() {
        testBib.greeting();
        verify(testStream).println("Welcome to Biblioteca!");
    }

    @Test
    public void shouldListBooks() {
        assertEquals("Book 1", testBib.browse());
    }
}
