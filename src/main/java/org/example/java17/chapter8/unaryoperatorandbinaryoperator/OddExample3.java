package org.example.java17.chapter8.unaryoperatorandbinaryoperator;

import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OddExample3 {
    public static void main(String[] args) {
        UnaryOperator<String> oodOperator = ((Function<String, char[]>) String::toCharArray)
                .andThen(chars -> IntStream.range(0, chars.length)
                        .filter(i -> i % 2 == 1)
                        .mapToObj(i -> chars[i]).map(String::valueOf)
                        .collect(Collectors.joining()))::apply;

        System.out.println(oodOperator.apply("ABCDEF"));
    }
}
