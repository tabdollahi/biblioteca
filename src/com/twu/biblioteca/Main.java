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

        Biblioteca bib = new Biblioteca(System.out, books);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        UserInput userInput = new UserInput(bufferedReader);
        Menu menu = new Menu(System.out, bib);

        Librarian librarian = new Librarian(bib, menu, userInput);

        librarian.openLibrary();


    }
}
