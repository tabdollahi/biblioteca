package com.twu.biblioteca;

public class Book {

    private String title;
    private int publicationYear;
    private String authorName;

    public Book(String title, int publicationYear, String authorName){
        this.title = title;
        this.publicationYear = publicationYear;
        this.authorName = authorName;
    }

    public String print(){
        return String.format("%-20s%-20d%-20s", title, publicationYear, authorName);
    }
}
