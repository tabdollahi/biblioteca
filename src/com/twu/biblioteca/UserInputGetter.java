package com.twu.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;

public class UserInputGetter {

    private BufferedReader bufferedReader;

    public UserInputGetter(BufferedReader bufferedReader) {
        this.bufferedReader = bufferedReader;
    }

    public String get() {
        String userInput = "";
        try {
            userInput = bufferedReader.readLine();
        } catch (IOException e) {}
        return userInput;
    }
}
