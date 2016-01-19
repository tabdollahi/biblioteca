package com.twu.biblioteca;

public class DisplayBooks implements Command {

    private Library library;

    public DisplayBooks(Library library){

        this.library = library;
    }
    @Override
    public void execute() {
        library.displayBooks();
    }
}
