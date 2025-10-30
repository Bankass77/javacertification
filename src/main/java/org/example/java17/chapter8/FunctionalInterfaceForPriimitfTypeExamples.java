package org.example.java17.chapter8;

import java.util.function.DoubleToIntFunction;
import java.util.function.ToIntFunction;

public class FunctionalInterfaceForPriimitfTypeExamples {

    public static void main(String[] args) {

        var d = 1.0;

        DoubleToIntFunction f1 = x -> 1;
        int x = f1.applyAsInt(d);
        System.out.println(x);

        // ou
        ToIntFunction f2 = y -> 1;
        int x2 = f2.applyAsInt(d);
        System.out.println(x2);

    }
}
