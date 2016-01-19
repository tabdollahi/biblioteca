package com.twu.biblioteca.commands;

import com.twu.biblioteca.Library;
import com.twu.biblioteca.commands.Command;

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
