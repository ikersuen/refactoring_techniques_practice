package com.tws.refactoring.extract_method;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


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
        OwingPrinter owingPrinter = new OwingPrinter();
        Order order = new Order(100);
        List<Order> orderList = new ArrayList<>();
        orderList.add(order);

        owingPrinter.printOwing("OwingName", orderList);

        String expectedResult = "*****************************\r\n"
                +"****** Customer totals ******\r\n"
                +"*****************************\r\n"
                +"name: OwingName\r\n"
                +"amount: 100.0\r\n";
        assertEquals(expectedResult, outContent.toString());
    }
}
