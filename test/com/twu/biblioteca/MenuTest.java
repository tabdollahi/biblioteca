package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class MenuTest {

    private Menu menu;
    private PrintStream printStream;
    private BufferedReader bufferedReader;

    @Before
    public void setup() {
        printStream = mock(PrintStream.class);
        bufferedReader = mock(BufferedReader.class);
        menu = new Menu(printStream, bufferedReader);
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
    public void shouldGetUserInputWhenPrompted() throws IOException {
        when(bufferedReader.readLine()).thenReturn("some string");
        String userInput = menu.userInput();

        assertThat(userInput, is("some string"));
    }

    @Test
    public void shouldGetEmptyStringWhenAnExceptionIsThrown() throws IOException {
        when(bufferedReader.readLine()).thenThrow(new IOException());//ask Bill

        String userInput = menu.userInput();

        assertThat(userInput, is(""));
    }




}