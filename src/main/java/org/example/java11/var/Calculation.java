package org.example.java11.var;

import java.util.List;

@FunctionalInterface
public interface Calculation {
    public abstract double calculateSum(List<Integer> numList);
}
