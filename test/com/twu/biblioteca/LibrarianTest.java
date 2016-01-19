package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class LibrarianTest {

    private Librarian librarian;
    private Library library;
    private Menu menu;
    private UserInputGetter userInputGetter;

    @Before
    public void setUp() {
        library = mock(Library.class);
        menu = mock(Menu.class);
        userInputGetter = mock(UserInputGetter.class);
        librarian =  new Librarian(library, menu, userInputGetter);
        when(userInputGetter.get()).thenReturn("1");

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
        when(userInputGetter.get()).thenReturn("invalid input", "1");

        librarian.openLibrary();
        verify(menu).selectOption("1");
    }
}