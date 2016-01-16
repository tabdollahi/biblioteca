package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

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
        when(menu.userInput()).thenReturn("1");

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
    public void shouldLetUserEnterAnotherOptionWhenFirstOptionNotValid() {
        when(menu.userInput()).thenReturn("invalid input", "1");

        librarian.openLibrary();
        verify(menu).selectOption("1");
    }

}