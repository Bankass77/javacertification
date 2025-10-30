package org.example.java17.chapter8.predicate;

import java.util.function.BiPredicate;
import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;

public class PredicateSpecialized {
    public static void main(String[] args) {
        IntPredicate i = x -> x > 5;
        LongPredicate l = y -> y % 2 == 0;
        DoublePredicate d = z -> z > 8.0;
        System.out.println(i.test(2));
        System.out.println(l.or(a -> a == 6L).test(10L));
        System.out.println(d.and(b -> b < 9.0).test(8.5));


        BiPredicate<String, Integer> bi = (x, y) -> x.equals("Manager") && y > 100_0000;

        String position = "Manager";
        int salary = 150_000;
        System.out.println(bi.test(position, salary));
    }

}
