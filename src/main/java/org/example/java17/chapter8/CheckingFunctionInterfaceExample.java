package org.example.java17.chapter8;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class CheckingFunctionInterfaceExample {
    public static void main(String[] args) {

        Predicate<List<String>> ex1 = x -> "".equals(x.get(0));
        System.out.println(" ex1: " + ex1.test(Arrays.asList("", "45")));

        Consumer<Long> ex2 = (Long l) -> System.out.println(l);

        ex2.accept(10L);

        BiPredicate<String, String> ex3 = (s1, s2) -> false;
        System.out.println(ex3.test("test", "choc"));

    }
}
