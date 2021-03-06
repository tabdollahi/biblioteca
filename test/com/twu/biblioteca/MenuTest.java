package com.twu.biblioteca;

import com.twu.biblioteca.commands.Command;
import com.twu.biblioteca.commands.ListBookCommand;
import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.HashMap;

import static org.mockito.Matchers.contains;
import static org.mockito.Matchers.intThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class MenuTest {

    private Menu menu;
    private PrintStream printStream;
    private HashMap<String, Command> commandMap;
    private Command command;
    private UserInputGetter userInputGetter;


    @Before
    public void setup() {
        printStream = mock(PrintStream.class);
        userInputGetter = mock(UserInputGetter.class);

        commandMap = new HashMap<String, Command>();
        command = mock(ListBookCommand.class);
        commandMap.put("1", command);


        menu = new Menu(printStream, userInputGetter, commandMap);
    }

    @Test
    public void shouldDisplayMenuWhenPromptingUserForSelection() {
        when(command.getLabel()).thenReturn("List Books");

        menu.selectOption("1");

        verify(printStream).println("1. List Books");
    }

    @Test
    public void shouldGetUserInputAfterDisplayingMenu() {
        when(command.getLabel()).thenReturn("List Books");

        menu.selectOption("1");

        verify(userInputGetter).get();

    }


    @Test
    public void shouldDisplaySelectionNumberWhenDisplayingMenuItems() {
        when(command.getLabel()).thenReturn("List Books");

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