package com.twu.biblioteca;

public class Librarian {

    private Biblioteca biblioteca;

    public Librarian(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    public void openLibrary() {
        biblioteca.greeting();
    }
}
