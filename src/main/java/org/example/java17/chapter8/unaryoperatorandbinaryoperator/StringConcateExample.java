package org.example.java17.chapter8.unaryoperatorandbinaryoperator;

import java.util.function.BinaryOperator;
import java.util.function.Function;

public class StringConcateExample {

    public static void main(String[] args) {
        BinaryOperator<String> operator = (x, y) -> x + y;

        Function<String, String> pepiline = ((Function<String, String>) s -> operator.apply("The fault lies not from our stars, ", s)).andThen(s -> s.replace("from", "in")).andThen(String::toUpperCase);

        System.out.println(pepiline.apply("but from ourselve."));
    }

}
