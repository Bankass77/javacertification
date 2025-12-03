package org.example.functionalprogrammingjava8.consumers;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

import org.example.functionalprogrammingjava8.unaryoperatorandbinaryoperator.Car;

public class SpliteratorExampleTest {
    public static void main(String[] args) {

        List<Car> cars = Arrays.asList(new Car("Nissan", 230000), new Car("Chevrolet", 680000),
                new Car("Hyundai", 450000), new Car("Buick", 432000));

        Spliterator<Car> carSpliterator= cars.spliterator();
       // carSpliterator.forEachRemaining( x -> System.out.println("In Spliterator: " +x));

        Spliterator<Car>  firstHalfCar= carSpliterator.trySplit();

        firstHalfCar.forEachRemaining( x -> System.out.println("In 1st half liste of Cars: " + x));
        carSpliterator.forEachRemaining( x-> System.out.println("In 2nd half: "+ x));
    }
}
