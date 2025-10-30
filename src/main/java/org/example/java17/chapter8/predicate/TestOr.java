package org.example.java17.chapter8.predicate;

import java.util.function.Predicate;

public class TestOr {
    public static void main(String[] args) {
        Predicate<Integer> p1= x -> x>7;

        PredicateHelper.result(p1.or(x-> x<3), 9);
        PredicateHelper.result(p1.or(x-> x<3), 2);
        PredicateHelper.result(p1.or(x-> x<3), 5);
    }
}
