package com.twu.biblioteca;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List books = new ArrayList();
        books.add(new Book("Awesome Book", 2016, "Tania"));
        books.add(new Book("Harry Potter and the Sorcerer's Stone", 2000, "J.K. Rowling"));

        Menu menu = new Menu(System.out, new BufferedReader(new InputStreamReader(System.in)));

        Biblioteca bib = new Biblioteca(System.out, books, menu);
        Librarian librarian = new Librarian(bib, menu);

        librarian.openLibrary();
    }
}
