package org.example.functionalprogrammingjava8.consumers;

import java.util.function.Consumer;

public class TestConsumerAndThen {
    private static int prod = 1;
    private static int sum = 0;

    public static void main(String[] args) {

        Consumer<Integer> conSum = x -> sum += x;
        Consumer<Integer> conPro = x -> prod *= x;

        conSum.andThen(conPro).accept(4);
        conSum.andThen(conPro).accept(5);

        System.out.println("sum=" + sum + " prod =" + prod);

    }
}
