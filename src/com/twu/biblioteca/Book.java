package com.twu.biblioteca;

public class Book {

    private String author;
    private String title;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public void displayHeading() {
        System.out.format("%-23s%-23s%-23s\n", "TITLE", "AUTHOR", "YEAR");

    }

    public void display() {
        System.out.format("%-23s%-23s%-23s\n", title, author, year);
    }

}


