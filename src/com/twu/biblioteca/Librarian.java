package com.twu.biblioteca;


public class Librarian {

    private Library library;
    private Menu menu;
    private UserInputGetter userInputGetter;

    public Librarian(Library library, Menu menu, UserInputGetter userInputGetter) {
        this.library = library;
        this.menu = menu;
        this.userInputGetter = userInputGetter;
    }

    public void openLibrary() {
        library.greeting();
        menu.display();

        String userInputString = "";
        do {
            userInputString = userInputGetter.get();
            menu.selectOption(userInputString);
        }
        while(!userInputString.equals("1"));
    }



}
