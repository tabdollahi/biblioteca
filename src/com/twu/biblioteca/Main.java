package com.twu.biblioteca;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        List books = new ArrayList();
        books.add(new Book("Awesome Book", 2016, "Tania"));
        books.add(new Book("Harry Potter and the Sorcerer's Stone", 2000, "J.K. Rowling"));

        Library library = new Library(System.out, books);

        Map<String, Command> commandMap = new HashMap<String, Command>();

        commandMap.put("1", new DisplayBooks(library));

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        UserInput userInput = new UserInput(bufferedReader);
        Menu menu = new Menu(System.out, commandMap);

        Librarian librarian = new Librarian(library, menu, userInput);

        librarian.openLibrary();


    }
}
