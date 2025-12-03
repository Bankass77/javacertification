package org.example.functionalprogrammingjava8.unaryoperatorandbinaryoperator;

import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OddExample2 {

    public static void main(String[] args) {
        UnaryOperator<String> odd = x -> {

            return IntStream.range(0, x.length()).filter(i -> i % 2 == 1).mapToObj(i -> String.valueOf(x.charAt(i))).collect(Collectors.joining());
        };

        System.out.println(odd.apply("ABCDEF"));
    }
}
