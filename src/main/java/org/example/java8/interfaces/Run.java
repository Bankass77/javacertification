package org.example.java8.interfaces;

public interface Run {
    public default int getSpeed() {
        return 10;
    }
}
