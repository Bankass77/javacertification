package org.example.functionalprogrammingjava8.shortProblems;

@FunctionalInterface
public interface Summer<X extends Number> {
    X sum( X value, X value2);
}
