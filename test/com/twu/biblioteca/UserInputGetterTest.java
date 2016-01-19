package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class UserInputGetterTest {

    private BufferedReader bufferedReader;
    private UserInputGetter userInputGetter;

    @Before
    public void setup(){
        bufferedReader = mock(BufferedReader.class);
        userInputGetter = new UserInputGetter(bufferedReader);
    }

    @Test
    public void shouldGetUserInputWhenPrompted() throws IOException {
        when(bufferedReader.readLine()).thenReturn("some string");
        String userInputString = userInputGetter.get();

        assertThat(userInputString, is("some string"));
    }

    @Test
    public void shouldGetEmptyStringWhenAnExceptionIsThrown() throws IOException {
        when(bufferedReader.readLine()).thenThrow(new IOException());//ask Bill

        String userInputString = userInputGetter.get();

        assertThat(userInputString, is(""));
    }
}