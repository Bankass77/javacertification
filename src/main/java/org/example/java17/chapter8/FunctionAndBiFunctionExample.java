package org.example.java17.chapter8;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionAndBiFunctionExample {
    public static void main(String[] args) {

        System.out.println("------------Function----------------");
        // On cherche la taille d'une chaîne de caractère
        Function<String, Integer> methodRef = String::length;

        System.out.println(methodRef.apply("chuck"));  // 5

        Function<String, Integer> lambda = x -> x.length();

        System.out.println(methodRef.apply("chuck"));  // 5

        System.out.println("------------BiFunction----------------");

        BiFunction<String, String, String> methodRef2 = String::concat;

        System.out.println(methodRef2.apply("baby ", "chick"));
        BiFunction<String, String, String> lambda2 = (string, toAdd) -> string.concat(toAdd);

        System.out.println(lambda2.apply("baby ", "chick"));
    }
}
