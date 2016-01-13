package com.twu.biblioteca;


import java.io.PrintStream;
import java.util.List;

public class Biblioteca {

    private PrintStream printStream;
    private List<Book> books;

    public Biblioteca(PrintStream printStream, List<Book> books) {
        this.printStream = printStream;
        this.books = books;
    }

    public void greeting() {
        printStream.println("Welcome to Biblioteca!");
    }

    public void displayBooks(){
        printStream.println("  Title  |  Year  |  Author  ");
        for(Book book : books) {
            book.print();
        }
    }
}
