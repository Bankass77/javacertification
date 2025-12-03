package org.example.functionalprogrammingjava8.consumers;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

import org.example.functionalprogrammingjava8.unaryoperatorandbinaryoperator.Car;

public class ForEachRemainingTest {
    public static void main(String[] args) {

        List<Car> cars = Arrays.asList(
                new Car("Nissan", 45000),
                new Car("Hyndai", 678000),
                new Car("BMW", 345300)
        );

        Spliterator<Car> carSpliterator = cars.spliterator();

        StringBuilder sb = new StringBuilder();
        carSpliterator.forEachRemaining(car -> {

            if (!sb.isEmpty()) {
                sb.append(",");
            }
            sb.append(car.getModel());
        });

        String result = sb.toString();
        System.out.println("Models: " + result);
    }
}
