package org.example.java17.chapter8.unaryoperatorandbinaryoperator;

import java.util.function.IntUnaryOperator;

public class ComputeEquation {
    public static void main(String[] args) {

        IntUnaryOperator intUnaryOperator = x -> -4 * (x + 2);

        System.out.println(intUnaryOperator.applyAsInt(6));

    }
}
