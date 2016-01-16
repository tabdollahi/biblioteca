package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class UserInputTest {

    private BufferedReader bufferedReader;
    private UserInput userInput;

    @Before
    public void setup(){
        bufferedReader = mock(BufferedReader.class);
        userInput = new UserInput(bufferedReader);
    }

    @Test
    public void shouldGetUserInputWhenPrompted() throws IOException {
        when(bufferedReader.readLine()).thenReturn("some string");
        String userInputString = userInput.get();

        assertThat(userInputString, is("some string"));
    }

    @Test
    public void shouldGetEmptyStringWhenAnExceptionIsThrown() throws IOException {
        when(bufferedReader.readLine()).thenThrow(new IOException());//ask Bill

        String userInputString = userInput.get();

        assertThat(userInputString, is(""));
    }
}