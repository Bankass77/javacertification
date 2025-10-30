package org.example.java17.chapter8.unaryoperatorandbinaryoperator;

import java.util.List;
import java.util.function.UnaryOperator;

import org.example.java17.chapter8.functions.C;

public class DiscountDave2 {
    public static void main(String[] args) {

        List<Car> cars = List.of(
                new Car("Hundai Elantras", 20000),
                new Car("Toyata Priuses", 250000),
                new Car("Honda Odysseys", 30000),
                new Car("Hyndai Elantra", 22000));

        UnaryOperator<Car> discount = car -> {

            double price = car.getPrice();
            return switch (car.model) {
                case "Hundai" -> new Car(car.model, price * 0.90);
                case "Toyota" -> new Car(car.model, price * 0.93);
                case "Honda" -> new Car(car.model, price * 0.95);
                default -> car;  // aucune reduction
            };
        };

        for (Car car : cars) {

            System.out.println(discount.apply(car));
        }
    }
}
