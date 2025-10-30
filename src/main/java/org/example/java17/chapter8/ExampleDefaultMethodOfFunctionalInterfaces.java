package org.example.java17.chapter8;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ExampleDefaultMethodOfFunctionalInterfaces {
    public static void main(String[] args) {

        // Predicate Default Method
        Predicate<String> egg = s -> s.contains("egg");
        Predicate<String> brow = s -> s.contains("brown");

        Predicate<String> brownEggs = s -> s.contains("egg") && s.contains("brown");  //  la meilleur façon de faire est de:
        Predicate<String> brownEggs2 = egg.and(brow);
        Predicate<String> otherEggs = s -> s.contains("egg") && !s.contains("brown");   //  la meilleur façon de faire est de:
        Predicate<String> otherEggs2 = egg.and(brow.negate());

        // Consumer Default Method


        Consumer<String> c1 = x -> System.out.println("1:" + x);
        Consumer<String> c2 = x -> System.out.println(",2:" + x);

        Consumer<String> combined = c1.andThen(c2);
        combined.accept("Annie");  // 1: Annie, 2: Annie

        // Function Default Method

        Function<Integer, Integer> before = x -> x + 1;
        Function<Integer, Integer> after = x -> x * 2;

        Function<Integer, Integer> combinedFunction= after.compose(before);
        System.out.println(combinedFunction.apply(3));  // 8

    }
}
