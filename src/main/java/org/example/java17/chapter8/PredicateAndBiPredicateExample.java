package org.example.java17.chapter8;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateAndBiPredicateExample {
    public static void main(String[] args) {

        Predicate<String> predicate = String::isBlank;
        Predicate<String> emptyPredicateLambda = x -> x.isBlank();
        System.out.println("----------------Predicate--------------");
        boolean emptyPredicate = predicate.test("");  // true
        System.out.println(emptyPredicate);
        boolean emptyPredicateLambda1 = emptyPredicateLambda.test("");
        System.out.println(emptyPredicateLambda1);


        // BiPredicate
        System.out.println("----------------BiPredicate--------------");
        BiPredicate<String, String> b1 = String::startsWith;
        System.out.println(b1.test("Chicken", "Chick"));

        BiPredicate<String, String> b2 = (string, prefix) -> string.startsWith(prefix);
        System.out.println(b2.test("Chicken", "Chick"));

    }
}
