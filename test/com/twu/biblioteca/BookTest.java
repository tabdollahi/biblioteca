package com.twu.biblioteca;


import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BookTest {

    Book book;
    PrintStream testStream;

    @Before
    public void setup() {
        book = new Book("Book 1", 1992, "Austin");
    }


    @Test
    public void shouldIncludeTitleWhenPrintingDetails() {
        assertEquals("  Book 1  |  1992  |  Austin  ", book.print());
    }

}
