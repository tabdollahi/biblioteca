package com.twu.biblioteca;

import com.twu.biblioteca.commands.Command;
import com.twu.biblioteca.commands.DisplayBooks;
import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.HashMap;

import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class MenuTest {

    private Menu menu;
    private PrintStream printStream;
    private HashMap<String, Command> commandMap;
    private Command command;


    @Before
    public void setup() {
        printStream = mock(PrintStream.class);
        commandMap = new HashMap<String, Command>();
        command = mock(DisplayBooks.class);
        commandMap.put("1", command);
        menu = new Menu(printStream, commandMap);
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
        verify(command).execute();
    }

    @Test
    public void shouldTellUserToSelectValidOptionWhenUserSelectedInvalidOption() {
        menu.selectOption("invalid option");
        verify(printStream).println("Select a valid option!");
    }

}