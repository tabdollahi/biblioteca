package com.twu.biblioteca.commands;

import com.twu.biblioteca.Library;
import com.twu.biblioteca.commands.Command;

public class ListBookCommand implements Command {

    private Library library;

    public ListBookCommand(Library library) {
        this.library = library;
    }

    @Override
    public void execute() {
        library.displayBooks();
    }

    @Override
    public String getLabel() {
        return "List Books";
    }
}
