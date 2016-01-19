package com.twu.biblioteca;


import java.io.PrintStream;
import java.util.List;

public class Library {

    private PrintStream printStream;
    private List<Book> books;

    public Library(PrintStream printStream, List<Book> books) {
        this.printStream = printStream;
        this.books = books;
    }

    public void greeting() {
        printStream.println("Welcome to Library!");
    }

    public void displayBooks(){
        printStream.printf("%-20s%-10s%-20s\n", "Title", "Year", "Author");

        for(Book book : books) {
            printStream.println(book.print());
        }
    }

}
