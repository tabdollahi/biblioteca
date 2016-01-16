package com.twu.biblioteca;


public class Librarian {

    private Biblioteca biblioteca;
    private Menu menu;
    private UserInput userInput;

    public Librarian(Biblioteca biblioteca, Menu menu, UserInput userInput) {
        this.biblioteca = biblioteca;
        this.menu = menu;
        this.userInput = userInput;
    }

    public void openLibrary() {
        biblioteca.greeting();
        menu.display();

        String userInputString = "";
        do {
            userInputString = userInput.get();
            menu.selectOption(userInputString);
        }
        while(!userInputString.equals("1"));
    }



}
