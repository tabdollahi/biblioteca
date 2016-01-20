package com.twu.biblioteca;

import com.twu.biblioteca.commands.Command;

import java.io.PrintStream;
import java.util.Map;

public class Menu {

    private PrintStream printStream;
    private UserInputGetter userInputGetter;
    private Map<String, Command> commandMap;

    public Menu(PrintStream printStream, UserInputGetter userInputGetter, Map commandMap) {
        this.printStream = printStream;
        this.userInputGetter = userInputGetter;
        this.commandMap = commandMap;
    }

    public void selectOption() {

        display();

        String input = userInputGetter.get();


        if (commandMap.containsKey(input)){
            commandMap.get(input).execute();
        }
        else {
            printStream.println("Select a valid option!");
        }
    }

    public void display() {
        for (String option : commandMap.keySet()){
            String label = commandMap.get(option).getLabel();
            printStream.println(option + ". " + label);
        }
    }
}
