package org.example.functionalprogrammingjava8.functions;

import java.util.List;

import org.example.functionalprogrammingjava8.unaryoperatorandbinaryoperator.Car;

public class DiscountDave {
    public static void main(String[] args) {

        List<Car> cars = List.of(
                new Car("Hundai Elantras", 20000),
                new Car("Toyata Priuses", 250000),
                new Car("Honda Odysseys", 30000),
                new Car("Hyndai Elantra", 22000));

        Function<Car, Car> pipeline = ((Function<Car, Car>) car -> {

            double factor = switch (car.getModel()) {

                case "Hundai" -> 0.90;
                case "Toyota" -> 0.93;
                case "Honda" -> 0.95;
                default -> 1.0;
            };

            return new Car(car.getModel(), car.getPrice() * factor);

        }).andThen(car -> {
            System.out.println("Car after discount: " + car);
            return car;
        });

        for (Car car : cars) {
            System.out.println(pipeline.apply(car));
        }
    }
}
