package org.example.java17.chapter8;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryAndBinaryOperatorExample {
    public static void main(String[] args) {

        System.out.println("----------------UnaryOperator-----------------");
        UnaryOperator<String> methodRef = String::toUpperCase;
        System.out.println(methodRef.apply("Chirp"));   // CHIRP
        UnaryOperator<String> lambda = x -> x.toUpperCase();
        System.out.println(lambda.apply("Chirp"));  // CHIRP

        System.out.println("----------------BinaryOperator-----------------");

        BinaryOperator<String> b1 = String::concat;
        System.out.println(b1.apply("baby ", "chick"));

        BinaryOperator<String> b2 = (string, toAdd) -> string.concat(toAdd);
        System.out.println(b2.apply("baby ", "chick"));


    }
}
