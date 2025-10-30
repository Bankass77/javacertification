package org.example.java17.chapter8.functions;

public class A {
    double d;
    String s;
    Integer i;

    public A(final double d, final String s, final Integer i) {
        this.d = d;
        this.s = s;
        this.i = i;
    }

    @Override
    public String toString() {
        return d + " " + s + " " + i;
    }
}
