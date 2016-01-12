package com.twu.biblioteca;


import java.io.PrintStream;

public class Biblioteca {

    private PrintStream printStream;

    public Biblioteca(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void greeting() {
        printStream.println("Welcome to Biblioteca!");
    }

    public String browse(){
        return "Book 1";
    }
}
