package com.twu.biblioteca.commands;

import com.twu.biblioteca.Library;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class DisplayBooksTest {

    @Test
    public void shouldDisplayBooksWhenOptionOne() {
        Library library = mock(Library.class);
        DisplayBooks displayBooks = new DisplayBooks(library);

        displayBooks.execute();
        verify(library).displayBooks();
    }

}