package com.twu.biblioteca;


import java.io.PrintStream;
import java.util.List;

public class Biblioteca {

    private PrintStream printStream;
    private List<String> books;

    public Biblioteca(PrintStream printStream, List<String> books) {
        this.printStream = printStream;
        this.books = books;
    }

    public void greeting() {
        printStream.println("Welcome to Biblioteca!");
    }

    public void displayBooks(){
        for(String book : books) {
            printStream.println(book);
        }
    }

}
