package com.twu.biblioteca;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Biblioteca bib = new Biblioteca(System.out, new ArrayList<String>());
        // Parallel refactor
        bib.greeting();
        bib.browse();
        // Start at the top of the call stack (outside-in)
        Librarian librarian = new Librarian(bib);
        librarian.openLibrary();

    }
}
