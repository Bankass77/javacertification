package org.example.java17.chapter8.consumers;

import java.util.function.Consumer;

public class ComputePolynomial {

    private static int fx = 0;

    public static void main(String[] args) {
        //fx = 5x^4 + 7x^3 + 4x^2 + 3x + 8
        Consumer<Integer> poly = x -> fx += (int) (5 * Math.pow(x, 4));
        poly.andThen(x -> fx += (int) (7 * Math.pow(x, 3)))
                .andThen(x -> fx += 4 * (int) Math.pow(x, 2))
                .andThen(x -> fx += 3 * (int) Math.pow(x, 1))
                .andThen(x -> fx += 8)
                .andThen(x -> System.out.println(fx))
                .accept(2);
    }
}
