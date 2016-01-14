package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class MenuTest {

    private Menu menu;
    private PrintStream printStream;

    @Before
    public void setup() {
        printStream = mock(PrintStream.class);
        menu = new Menu(printStream);
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

}