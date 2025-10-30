package org.example.java17.chapter8.functions;

import java.util.function.Function;

public class ConvertAToBandBToA {

    public static void main(String[] args) {

        Function<A, B> atobFunction = new Function<A, B>() {
            @Override
            public B apply(final A a) {
                return new B(a.d, a.s, a.i.toString());
            }
        };

        System.out.println(atobFunction.apply(new A(34.0, "tartapion", 67)));


        Function<B, A> btoaFunction = new Function<B, A>() {
            @Override
            public A apply(final B b) {

                return new A(b.a, b.s, Integer.parseInt(b.c));
            }
        };

        System.out.println(btoaFunction.apply(new B(34.0, "tartapion", "67")));
    }

}
