package com.twu.biblioteca;


import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

public class BibliotecaTest {

    Biblioteca testBib;
    PrintStream testStream;
    private List<Book> books;

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
    public void shouldDisplayHeaderWhenListingBooks() {
        testBib.displayBooks();

        verify(testStream).println("  Title  |  Year  |  Author  ");

    }

    @Test
    public void shouldDisplayBookInformationWhenOneBookInLibrary(){
        Book book = mock(Book.class);
        books.add(book);

        testBib.displayBooks();
        verify(book, times(books.size())).print();
    }

}
