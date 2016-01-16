package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class LibrarianTest {

    private Librarian librarian;
    private Biblioteca biblioteca;
    private Menu menu;

    @Before
    public void setUp() {
        biblioteca = mock(Biblioteca.class);
        menu = mock(Menu.class);
        librarian =  new Librarian(biblioteca, menu);

    }

    @Test
    public void shouldGreetUserWhenOpeningLibrary() {

        librarian.openLibrary();
        verify(biblioteca).greeting();
    }

    @Test
    public void shouldDisplayMenuWhenOpeningLibrary() {
        librarian.openLibrary();

        verify(menu).display();
    }

    @Test
    public void shouldDisplayBooksWhenOptionOne() {
        librarian.selectOption("1");
        verify(biblioteca).displayBooks();
    }
}