package com.twu.biblioteca.commands;

import com.twu.biblioteca.Library;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class ListBookCommandTest {

    private Library library;
    private ListBookCommand listBookCommand;

    @Before
    public void setUp() throws Exception {
        library = mock(Library.class);
        listBookCommand = new ListBookCommand(library);
    }

    @Test
    public void shouldDisplayBooksWhenOptionOne() {
        listBookCommand.execute();
        verify(library).displayBooks();
    }

    @Test
    public void shouldReturnLabel() {
        assertThat("List Books", is(listBookCommand.getLabel()));
    }



}