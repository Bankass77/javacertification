package org.example.java17.chapter8;

import java.util.function.BooleanSupplier;

public class FunctionalInterfaceForBooleanExamples {

    public static void main(String[] args) {

        BooleanSupplier b1= ()-> true;
        System.out.println(b1.getAsBoolean());

        BooleanSupplier b2= ()-> Math.random()> 0.5;
        System.out.println(b2.getAsBoolean());
    }
}
