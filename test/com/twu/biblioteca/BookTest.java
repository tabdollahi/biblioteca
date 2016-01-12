package com.twu.biblioteca;


import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BookTest {

    Book testBook;

    @Before
    public void setup() {
        testBook = new Book("Book 1", 1992, "Austin");
    }


    @Test
    public void shouldHaveTitle() {
        assertEquals(testBook.getTitle(), "Book 1");
    }

    @Test
    public void shouldHavePublicationYear() {
        assertEquals(testBook.getPublicationYear(), 1992);
    }

    @Test
    public void shouldHaveAuthor() {
        assertEquals(testBook.getAuthorName(), "Austin");
    }


    @Test
    public void shouldReturnSummary() {

    }

}
