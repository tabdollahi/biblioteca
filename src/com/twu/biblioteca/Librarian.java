package com.twu.biblioteca;

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
        String userInput = menu.userInput();
        selectOption(userInput);
    }

    public void selectOption(String s) {
        biblioteca.displayBooks();
    }

}
