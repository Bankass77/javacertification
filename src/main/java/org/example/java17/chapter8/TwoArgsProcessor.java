package org.example.java17.chapter8;

@FunctionalInterface
public interface TwoArgsProcessor<X> {

    X process(X arg1, X arg2);

}
