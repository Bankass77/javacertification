package org.example.java17.chapter8;

/**
 * Calling static Methods
 */
public class MethodeStaticReferenceExample {
    public static void main(String[] args) {

        Converter methodRef = Math::round;
        Converter lambda= x -> Math.round(x);

        System.out.println(methodRef.round(100.1));
    }
}
