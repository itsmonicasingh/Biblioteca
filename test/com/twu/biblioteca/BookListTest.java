package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class BookListTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldDisplayBoksInLibrary() {
        ArrayList<String> listOfBooks = new ArrayList<String>(Arrays.asList("Alchemist", "Chromosome 6", "Sixth Sense"));
        BookList bookList = new BookList(listOfBooks);
        bookList.display();
        assertEquals("Alchemist\nChromosome 6\nSixth Sense\n", outContent.toString());
    }

    @After
    public void cleanUpStreams() {
        System.setOut(System.out);
    }
}