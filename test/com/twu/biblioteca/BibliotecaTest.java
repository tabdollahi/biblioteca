package com.twu.biblioteca;


import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

public class BibliotecaTest {

    Biblioteca testBib;
    PrintStream testStream;
    private List<Book> books;
    private Menu menu;

    @Before
    public void setUp() {
        testStream = mock(PrintStream.class);
        books = new ArrayList();
        menu = mock(Menu.class);
        testBib = new Biblioteca(testStream, books, menu);
    }

    @Test
    public void shouldDisplayWelcomeMessageOnStart() {
        testBib.greeting();
        verify(testStream).println("Welcome to Biblioteca!");
    }

    @Test
    public void shouldDisplayHeaderWhenListingBooks() {
        testBib.displayBooks();

        verify(testStream).printf("%-20s%-10s%-20s\n", "Title", "Year", "Author");
    }

    @Test
    public void shouldDisplayOneBookWhenLibraryHasOnlyOneBook() {
        Book book = mock(Book.class);
        books.add(book);

        testBib.displayBooks();
        verify(book).print();
    }

    @Test
    public void shouldDisplayBookInformationForEachBookInLibrary(){
        Book book = mock(Book.class);
        Book book2 = mock(Book.class);
        books.add(book);
        books.add(book2);

        testBib.displayBooks();
        verify(book2).print();
    }


}
