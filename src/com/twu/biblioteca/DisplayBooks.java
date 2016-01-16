package com.twu.biblioteca;

public class DisplayBooks implements Command {

    private Biblioteca biblioteca;

    public DisplayBooks(Biblioteca biblioteca){

        this.biblioteca = biblioteca;
    }
    @Override
    public void execute() {
        biblioteca.displayBooks();
    }
}
