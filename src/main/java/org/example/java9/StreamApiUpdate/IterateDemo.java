package org.example.java9.StreamApiUpdate;

import java.util.stream.Stream;

/**
 * Cette classe utilise la méthode iterate() style java 8(sans utilisé le Predicate) et 9 ( avec le Predicate).
 */
public class IterateDemo {

    public static void main(String[] args) {

        //iterate() without Predicate: Java 8
        System.out.println("Java 8 Style : iterate() without Predicate =>");
        Stream.iterate(101, x -> x + 1).limit(10).forEach(number -> System.out.println(number));

        // iterate()  with predicate : Java 9
        System.out.println("Java 9 Style : iterate() with Predicate =>");
        Stream.iterate(101, x -> x <= 110, x -> x + 1).forEach(number -> System.out.println(number));
    }

}
