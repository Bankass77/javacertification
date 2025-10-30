package org.example.java17.chapter8.functions;

public class B {
    Double a;
    String s;
    String c;

    public B(final Double a, final String s, final String c) {
        this.a = a;
        this.s = s;
        this.c = c;
    }

    @Override
    public String toString() {
        return a + " " + s + " " + c;
    }
}
