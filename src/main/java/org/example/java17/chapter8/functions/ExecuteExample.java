package org.example.java17.chapter8.functions;

import java.util.function.Function;

public class ExecuteExample {

    static <T extends C> Integer execute(T obj, Function<T, Integer> f) {

        return f.apply(obj);
    }

    public static void main(String[] args) {

        Function<C, Integer> sumC = c -> c.x + c.y;

        Function<D, Integer> sumD = d -> d.x + d.y + d.z;

        Function<E, Integer> sumE = e -> e.t + e.x + e.y;

        // 🔹 Démonstration
        System.out.println("Somme pour C : " + execute(new C(2, 7), sumC));
        System.out.println("Somme pour D : " + execute(new D(2, 3, 5), sumD));
        System.out.println("Somme pour E : " + execute(new E(1, 4, 6), sumE));

    }
}
