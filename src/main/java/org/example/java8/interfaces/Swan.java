package org.example.java8.interfaces;

public class Swan extends Bird implements Swim {


    @Override
    boolean canSwoop() {
        return false;
    }

    @Override
    int getType() {
        return 0;
    }

    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }
}
