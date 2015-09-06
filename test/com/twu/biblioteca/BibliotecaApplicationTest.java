package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class BibliotecaApplicationTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(System.out);
    }

    @Test
    public void shouldShowWelcomeMessageAlongWithListOfBooksOnStart() {
        BibliotecaApplication bibliotecaApp = new BibliotecaApplication();
        bibliotecaApp.start();
        assertEquals("Welcome to Bangalore Public Library\n\nAlchemist\nChromosome 6\nSixth Sense\n", outContent.toString());
    }
}