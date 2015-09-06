package com.twu.biblioteca;

import java.util.ArrayList;

public class Book {

    private ArrayList<String> listOfBooks = new ArrayList<String>();
    private int count = 0;

    Book(String book) {
        listOfBooks.add(book);
    }

    public void display() {
        System.out.println("Dracula");
    }
}
