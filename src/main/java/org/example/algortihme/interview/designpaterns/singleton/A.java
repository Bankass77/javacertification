package org.example.algortihme.interview.designpaterns.singleton;

public class A {

    private A() {

    }

    public static class AHolder {
        private static final A INSTANCE = new A();
    }

    public static A getInstance() {
        return AHolder.INSTANCE;
    }
}
