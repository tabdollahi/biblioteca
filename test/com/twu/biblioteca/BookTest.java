package com.twu.biblioteca;


import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void setup() {
        book = new Book("Book 1", 1992, "Austin");
    }


    @Test
    public void shouldIncludeTitleWhenPrintingDetails() {
        assertThat(book.print(), containsString("Book 1"));
    }

    @Test
    public void shouldTruncateTitleWhenTitleLengthIsOver20Characters() {
        String longTitle = "0123456789012345678901";
        String truncatedTitle = "0123456789012345...";
        Book longBook = new Book(longTitle, 3017, "Rebecca");

        assertThat(longBook.print(), containsString(truncatedTitle));
    }

    @Test
    public void shouldIncludePublicationYearWhenPrintingDetails() {
        assertThat(book.print(), containsString("1992"));
    }

    @Test
    public void shouldIncludeAuthorNameYearWhenPrintingDetails() {
        assertThat(book.print(), containsString("Austin"));
    }

}
