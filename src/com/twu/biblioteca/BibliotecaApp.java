package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Arrays;

public class BibliotecaApp {

    public static void main(String[] args) {

        WelcomeMessage welcomeMessage = new WelcomeMessage("Welcome to the Bangalore Public Library");
        welcomeMessage.display();

        Book book1 = new Book("Alchemist", "Paulo Coelho", 2011);
        Book book2 = new Book("Chromosome 6", "Robin Cook", 1998);
        book1.displayHeading();
        book1.display();
        book2.display();

    }
}
