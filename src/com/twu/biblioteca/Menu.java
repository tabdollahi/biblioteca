package com.twu.biblioteca;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Menu {

    private PrintStream printStream;
    private List<String> options;
    private Map<String, Command> commandMap;

    public Menu(PrintStream printStream, Map commandMap) {

        this.printStream = printStream;
        this.commandMap = commandMap;

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
        if (commandMap.containsKey(input)){
            commandMap.get(input).execute();
        }
        else {
            printStream.println("Select a valid option!");
        }
    }
}
