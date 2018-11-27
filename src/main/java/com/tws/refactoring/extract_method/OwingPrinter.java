package com.tws.refactoring.extract_method;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class OwingPrinter {
    void printOwing(String name, List<Order> orders) {
        Iterator<Order> elements = orders.iterator();
        double outstanding = 0.0;

        printBanner();

        // print owings
        while (elements.hasNext()) {
            Order each = (Order) elements.next();
            outstanding += each.getAmount();
        }

        printDetails(name, outstanding);
    }

    void printBanner(){
        System.out.println("*****************************\r\n" + "****** Customer totals ******\r\n" + "*****************************");
    }

    void printDetails(String name, double outstanding){
        System.out.println("name: " + name + "\r\namount: " + outstanding);
    }
}
