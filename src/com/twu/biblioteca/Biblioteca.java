package com.twu.biblioteca;


import java.io.PrintStream;
import java.util.List;

public class Biblioteca {

    private PrintStream printStream;

    public Biblioteca(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void greeting() {
        printStream.println("Welcome to Biblioteca!");
    }

    public void browse(List<String> books){
        for(String book : books) {
            printStream.println(book);
        }
    }
}
