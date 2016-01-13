package com.twu.biblioteca;

public class Book {

    String title;
    int publicationYear;
    String authorName;

    public Book(String title, int publicationYear, String authorName){
        this.title = title;
        this.publicationYear = publicationYear;
        this.authorName = authorName;
    }

    public String print(){
        return String.format("  %s  |  %d  |  %s  ", title, publicationYear, authorName);
    }
}
