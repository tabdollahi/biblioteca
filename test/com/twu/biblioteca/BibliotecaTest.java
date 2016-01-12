package com.twu.biblioteca;


import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BibliotecaTest {

    Biblioteca testBib;
    PrintStream testStream;
    private List<String> books;

    @Before
    public void setUp() {
        testStream = mock(PrintStream.class);
        books = new ArrayList<>();
        testBib = new Biblioteca(testStream, books);
    }

    @Test
    public void shouldDisplayWelcomeMessageOnStart() {
        testBib.greeting();
        verify(testStream).println("Welcome to Biblioteca!");
    }

    @Test
    public void shouldListBooks() {
        books.add("Book 1");
        books.add("Book 2");

        testBib.displayBooks();

        verify(testStream).println("Book 1");
        verify(testStream).println("Book 2");
    }


}
