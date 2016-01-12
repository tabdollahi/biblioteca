package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class LibrarianTest {

    private Librarian librarian;
    private Biblioteca biblioteca;

    @Before
    public void setUp() {
        biblioteca = mock(Biblioteca.class);
        librarian =  new Librarian(biblioteca);

    }

    @Test
    public void shouldGreetUserWhenOpeningLibrary() {

        librarian.openLibrary();
        verify(biblioteca).greeting();
    }

    @Test
    public void shouldDisplayBooksWhenOpeningLibrary() {

        librarian.openLibrary();
        verify(biblioteca).displayBooks();
    }


}