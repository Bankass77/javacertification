package org.example.functionalprogrammingjava8.consumers;

import java.util.Set;
import java.util.TreeSet;

public class TestSet {
    public static void main(String[] args) {

        Set<String> colors = new TreeSet<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");

        colors.iterator().forEachRemaining(x -> System.out.println(x));


        System.out.println();
        // ou
        colors.forEach(x -> System.out.println(x));
    }
}
