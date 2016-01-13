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
        if(title.length() <= 20) {
            return String.format("%-20s%-10d%-20s", title, publicationYear, authorName);
        } else {
            return String.format("%-20s%-10d%-20s", truncatedTitle(), publicationYear, authorName);
        }
    }

    private String truncatedTitle(){
        return title.substring(0,16) + "...";
    }

}
