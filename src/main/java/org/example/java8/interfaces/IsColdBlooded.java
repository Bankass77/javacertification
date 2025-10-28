package org.example.java8.interfaces;

public interface IsColdBlooded {
    boolean hasScales();
    default double getTemperature(){
        return 10.0;
    }
}
