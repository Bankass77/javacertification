package org.example.functionalprogrammingjava8.consumers;

import java.util.function.IntConsumer;

public class ShortProblem {

    private static int number = 5;
    public static void main(String[] args) {
        IntConsumer result = ((IntConsumer) x -> number += x)
                .andThen(x -> number *= 7)
                .andThen(x -> System.out.println(number));
        result.accept(4);
    }



}
