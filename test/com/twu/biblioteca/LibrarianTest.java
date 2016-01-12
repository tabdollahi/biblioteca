package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class LibrarianTest {

    @Test
    public void shouldGreetUserWhenOpeningLibrary() {
        Biblioteca biblioteca = mock(Biblioteca.class);
        // Inject all your dependencies in the constructor!
        Librarian librarian = new Librarian(biblioteca);

        librarian.openLibrary();

        verify(biblioteca).greeting();
    }


}