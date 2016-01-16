package com.twu.biblioteca;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Menu {

    private PrintStream printStream;
    private List<String> options;
    private Biblioteca biblioteca;

    public Menu(PrintStream printStream, Biblioteca biblioteca) {

        this.printStream = printStream;
        this.biblioteca = biblioteca;

        options = new ArrayList<String>();
        options.add("List Books");
    }

    public void display() {
        int optionNumber = 1;
        for (String option : options) {
            printStream.println(optionNumber + ". " + option);
            optionNumber++;
        }
    }

    public void selectOption(String input) {
        if(input.equals( "1")) {
            biblioteca.displayBooks();
        }
        else {
            printStream.println("Select a valid option!");
        }
    }
}
