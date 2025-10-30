package org.example.java17.chapter8.unaryoperatorandbinaryoperator;

public class Car {
    String model;
    double price;

    public Car(final String model, final double price) {
        this.price = price;
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString(){

        return  " model:" + model + " => " + " price= " + price;
    }
}
