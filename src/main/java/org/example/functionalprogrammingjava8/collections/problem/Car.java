package org.example.functionalprogrammingjava8.collections.problem;

public class Car {
    String make;
    String model;

    public Car(final String make, final String model) {
        this.make = make;
        this.model = model;
    }

    @Override
    public  String toString(){

        return  make + " " + model;
    }
}
