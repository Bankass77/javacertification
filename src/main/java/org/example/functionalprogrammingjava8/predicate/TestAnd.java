package org.example.functionalprogrammingjava8.predicate;

import java.util.function.Predicate;

public class TestAnd {

    public static void main(String[] args) {

        System.out.println("=============AND Predicate=================");
        Predicate<Integer> p1= x -> x >7;

        System.out.println(p1.and(x-> x %2==1)   // 9 > 7 evaluated first
                .test(9));  // Then AND'  ed with 9§2==1

    }
}
