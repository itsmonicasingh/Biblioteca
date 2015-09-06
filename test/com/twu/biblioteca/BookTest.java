package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setOutputStream() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldDisplayABookFromTheLibrary() {
        Book book = new Book("Draclua");
        book.display();
        assertEquals("Dracula\n", outContent.toString());
    }

    @After
    public void cleanUpStreams() {
        System.setOut(System.out);
    }
}