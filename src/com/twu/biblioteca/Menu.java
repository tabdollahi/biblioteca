package com.twu.biblioteca;

import com.twu.biblioteca.commands.Command;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Menu {

    private PrintStream printStream;
    private Map<String, Command> commandMap;

    public Menu(PrintStream printStream, Map commandMap) {
        this.printStream = printStream;
        this.commandMap = commandMap;
    }

    public void display() {
        for (String option : commandMap.keySet()){
            String label = commandMap.get(option).getLabel();
            printStream.println(option + ". " + label);
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
