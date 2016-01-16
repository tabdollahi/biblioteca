package com.twu.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Menu {

    private PrintStream out;
    private BufferedReader bufferedReader;
    private List<String> options;
    private Biblioteca biblioteca;

    public Menu(PrintStream out, BufferedReader bufferedReader, Biblioteca biblioteca) {

        this.out = out;
        this.bufferedReader = bufferedReader;
        this.biblioteca = biblioteca;

        options = new ArrayList<String>();
        options.add("List Books");
    }

    public void display() {
        int optionNumber = 1;
        for (String option : options) {
            out.println(optionNumber + ". " + option);
            optionNumber++;
        }
    }

    public String userInput() {
        String userInput = "";
        try {
            userInput = bufferedReader.readLine();
        } catch (IOException e) {}
        return userInput;
    }

    public void selectOption(String input) {
        if(input.equals( "1")) {
            biblioteca.displayBooks();
        }
        else {
            out.println("Select a valid option!");
        }
    }
}
