package org.example.java8.interfaces;

public abstract interface Soar { // La déclaration de abstract est optionel

    int MAX_HEIGHT = 10;  // public, static, final  de façon implicite
    final static boolean UNDERWATER = true;

    void fly(int speed); // public et abstract  de façon implicite, puisqu'il n'a pas de body

    abstract void takeoof();   // public de façon implicite

    public abstract double drive();
}
