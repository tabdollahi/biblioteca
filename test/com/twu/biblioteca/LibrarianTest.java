package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class LibrarianTest {

    private Librarian librarian;
    private Library library;
    private Menu menu;
    private UserInput userInput;

    @Before
    public void setUp() {
        library = mock(Library.class);
        menu = mock(Menu.class);
        userInput = mock(UserInput.class);
        librarian =  new Librarian(library, menu, userInput);
        when(userInput.get()).thenReturn("1");

    }

    @Test
    public void shouldGreetUserWhenOpeningLibrary() {

        librarian.openLibrary();
        verify(library).greeting();
    }

    @Test
    public void shouldDisplayMenuWhenOpeningLibrary() {
        librarian.openLibrary();

        verify(menu).display();
    }

    @Test
    public void shouldLetUserEnterAnotherOptionWhenFirstOptionNotValid() {
        when(userInput.get()).thenReturn("invalid input", "1");

        librarian.openLibrary();
        verify(menu).selectOption("1");
    }

//    @Test
//    public void shouldExecuteNoCommandsWhenUserEntersQ() {
//        when(userInput.get()).thenReturn("q");
//
//        librarian.openLibrary();
//
//    }
}