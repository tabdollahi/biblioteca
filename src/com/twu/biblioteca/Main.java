package com.twu.biblioteca;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Biblioteca bib = new Biblioteca(System.out, new ArrayList<Book>());

        Librarian librarian = new Librarian(bib);
        librarian.openLibrary();

    }
}
