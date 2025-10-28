package org.example.java8.interfaces;

public class Owl implements hasbigeyes {
    @Override
    public void flap() {

        System.out.println("Flap!");
    }

    @Override
    public int hunt() {
        return 5;
    }
}
