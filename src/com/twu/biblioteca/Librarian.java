package com.twu.biblioteca;

import java.io.PrintStream;

public class Librarian {

    private Biblioteca biblioteca;
    private Menu menu;

    public Librarian(Biblioteca biblioteca, Menu menu) {
        this.biblioteca = biblioteca;
        this.menu = menu;
    }

    public void openLibrary() {
        biblioteca.greeting();
        menu.display();
        String userInput = "";
        do {
            userInput = menu.userInput();
            menu.selectOption(userInput);
        }
        while(!userInput.equals("1"));
    }



}
