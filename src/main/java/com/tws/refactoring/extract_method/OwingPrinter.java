package com.tws.refactoring.extract_method;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class OwingPrinter {
    void printOwing(String name, List<Order> orders) {
        printBanner();
        double outstanding = printOutstanding(orders);
        printDetails(name, outstanding);
    }

    void printBanner(){
        System.out.println("*****************************\r\n" + "****** Customer totals ******\r\n" + "*****************************");
    }

    void printDetails(String name, double outstanding){
        System.out.println("name: " + name + "\r\namount: " + outstanding);
    }

    double printOutstanding(List<Order> orders){
        double outstanding = 0.0;
        Iterator<Order> elements = orders.iterator();
        while (elements.hasNext()) {
            outstanding += elements.next().getAmount();
        }
        return outstanding;
    }
}
