package org.example.functionalprogrammingjava8.collections.problem;

public class Vehicule {
    String make;
    String model;
    int year;

    public Vehicule(final String make, final String model, final int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return year + " " + make + " " + model;
    }
}
