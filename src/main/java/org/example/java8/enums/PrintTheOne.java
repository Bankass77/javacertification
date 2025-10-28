package org.example.java8.enums;

public class PrintTheOne {

    public static void main(String[] args) {
        System.out.println("begin");
        OnlyOne firstCall= OnlyOne.ONCE;  // ecrit true
        OnlyOne secondCall = OnlyOne.ONCE; // deuxième appel n'écrit rien
        System.out.println("end");
    }
}
