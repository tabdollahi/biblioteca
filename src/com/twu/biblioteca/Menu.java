package com.twu.biblioteca;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Menu {

    private PrintStream out;
    private List<String> options;

    public Menu(PrintStream out) {

        this.out = out;

        options = new ArrayList<String>();
        options.add("List Books");
    }

    public void display() {
        for (String option : options) {
            out.println(option);
        }
    }
}
