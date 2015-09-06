package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Arrays;

public class BibliotecaApplication {

    public void start() {
        WelcomeMessage welcomeMessage = new WelcomeMessage("Welcome to Bangalore Public Library");
        ArrayList<String> listOfBooks = new ArrayList<String>(Arrays.asList("Alchemist", "Chromosome 6", "Sixth Sense"));
        BookList bookList = new BookList(listOfBooks);
        welcomeMessage.display();
        System.out.println();
        bookList.display();
    }

    public static void main(String[] args) {
        BibliotecaApplication bibliotecaApplication = new BibliotecaApplication();
        bibliotecaApplication.start();
    }
}
