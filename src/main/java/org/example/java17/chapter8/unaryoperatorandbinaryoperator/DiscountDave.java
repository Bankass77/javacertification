package org.example.java17.chapter8.unaryoperatorandbinaryoperator;

import java.util.List;

public class DiscountDave {
    public static void main(String[] args) {

        List<Car> cars = List.of(
                new Car("Hundai Elantras", 20000),
                new Car("Toyata Priuses", 250000),
                new Car("Honda Odysseys", 30000),
                new Car("Hyndai Elantra", 22000));

        List<Car> discounted = cars.stream().map(
                car -> switch (car.model) {
                    case "Hundai Elantras" -> new Car(car.model, car.price * 0.90);
                    case "Toyata Priuses" -> new Car(car.model, car.price * 0.93);
                    case "Honda Odysseys" -> new Car(car.model, car.price * 0.95);

                    default -> car;

                }
        ).toList();

        discounted.forEach(System.out::println);
    }
}
