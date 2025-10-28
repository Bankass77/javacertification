package org.example.java8.enums;

public enum OnlyOne {

    ONCE(true);

    private OnlyOne(boolean b){
        System.out.println("Constructing");
    }
}
