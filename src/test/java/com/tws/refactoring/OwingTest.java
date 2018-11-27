package com.tws.refactoring;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.tws.refactoring.extract_method.OwingPrinter;
import com.tws.refactoring.extract_variable.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static com.tws.refactoring.extract_method.OwingPrinter.printBanner;
import static org.junit.Assert.assertEquals;

public class OwingTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void printOwing() {
        printBanner();
        assertEquals("*****************************\r\n"
                +"****** Customer totals ******\r\n"
                +"*****************************\r\n", outContent.toString());
    }
}
