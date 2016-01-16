package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class MenuTest {

    private Menu menu;
    private PrintStream printStream;
    private Biblioteca biblioteca;


    @Before
    public void setup() {
        printStream = mock(PrintStream.class);
        biblioteca = mock(Biblioteca.class);
        menu = new Menu(printStream, biblioteca);
    }

    @Test
    public void shouldDisplayOneMenuItemWhenHasOneMenuItem() {
        menu.display();
        verify(printStream).println(contains("List Books"));
    }

    @Test
    public void shouldDisplaySelectionNumberWhenDisplayingMenuItems() {
        menu.display();
        verify(printStream).println(contains("1"));
    }

    @Test
    public void shouldDisplayBooksWhenOptionOne() {
        menu.selectOption("1");
        verify(biblioteca).displayBooks();
    }

    @Test
    public void shouldTellUserToSelectValidOptionWhenUserSelectedInvalidOption() {
        menu.selectOption("invalid option");
        verify(printStream).println("Select a valid option!");
    }


}