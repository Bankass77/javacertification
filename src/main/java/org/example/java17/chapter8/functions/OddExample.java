package org.example.java17.chapter8.functions;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class OddExample {
    public static void main(String[] args) {
        Function<String, String> oddFlatMap = s -> {
            return IntStream.range(0, s.length()).boxed().flatMap(i -> i % 2 == 1 ? Stream.of(s.charAt(i)) : Stream.empty()).map(String::valueOf).collect(Collectors.joining());
        };

        System.out.println(oddFlatMap.apply("Tartapion"));
    }
}
