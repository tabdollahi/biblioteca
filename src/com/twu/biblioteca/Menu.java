package com.twu.biblioteca;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Menu {

    private PrintStream printStream;
    private List<String> options;
    private Biblioteca biblioteca;
    private Map<String, Command> commandMap = new HashMap<String, Command>();

    public Menu(PrintStream printStream, Biblioteca biblioteca) {

        this.printStream = printStream;
        this.biblioteca = biblioteca;

        options = new ArrayList<String>();
        options.add("List Books");

        commandMap.put("1", new DisplayBooks(biblioteca));
    }

    public void display() {
        int optionNumber = 1;
        for (String option : options) {
            printStream.println(optionNumber + ". " + option);
            optionNumber++;
        }
    }

    public void selectOption(String input) {
        if (commandMap.containsKey(input)){
            commandMap.get(input).execute();
        }
        else {
            printStream.println("Select a valid option!");
        }
    }
}
