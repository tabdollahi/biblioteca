package com.twu.biblioteca;


public class Librarian {

    private Library library;
    private Menu menu;
    private UserInput userInput;

    public Librarian(Library library, Menu menu, UserInput userInput) {
        this.library = library;
        this.menu = menu;
        this.userInput = userInput;
    }

    public void openLibrary() {
        library.greeting();
        menu.display();

        String userInputString = "";
        do {
            userInputString = userInput.get();
            menu.selectOption(userInputString);
        }
        while(!userInputString.equals("1"));
    }



}
