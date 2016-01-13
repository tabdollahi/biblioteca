package com.twu.biblioteca;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.List;

public class Biblioteca {

    private PrintStream printStream;
    private List<Book> books;
    private BufferedReader bufferedReader;
    private Menu menu;

    public Biblioteca(PrintStream printStream, List<Book> books, BufferedReader bufferedReader, Menu menu) {
        this.printStream = printStream;
        this.books = books;
        this.bufferedReader = bufferedReader;
        this.menu = menu;
    }

    public void greeting() {
        printStream.println("Welcome to Biblioteca!");
    }

    public void displayBooks(){
        printStream.printf("%-20s%-10s%-20s\n", "Title", "Year", "Author");

        for(Book book : books) {
            printStream.println(book.print());
        }
    }

    public void displayMenu() {
//        printStream.println("List Books");
        menu.display();
    }

    public String prompt() throws IOException {
        return bufferedReader.readLine();
    }
}
